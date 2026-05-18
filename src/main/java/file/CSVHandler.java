package file;

import model.*;
import util.SmashException;

import java.io.*;
import java.util.*;

public class CSVHandler {
    private static final String MEMBER_FILE = "members.csv";
    private static final String PAYMENT_FILE = "payments.csv";
    private static final String TRAINING_FILE = "training.csv";


    public void saveMember(ArrayList<Member> member) {

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(MEMBER_FILE, true))) {

            for(Member m : member) {
                writer.write(m.getName() + "," +
                        m.getMemberID() + "," +
                        m.getAge() + "," +
                        m.getMemberType());

                writer.newLine();

            }
        } catch(IOException e) {
            SmashException.handle(new SmashException.FileWriteException("Kunne ikke skrive medlemsliste" + MEMBER_FILE));
        }


    }

    public ArrayList<Member> loadMember() {

        ArrayList<Member> members = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(MEMBER_FILE))) {

            String line;

            while((line = reader.readLine()) != null) {

                String[] parts = line.split(",");

                String name = parts[0];
                int memberID = Integer.parseInt(parts[1]);
                int age = Integer.parseInt(parts[2]);
                MemberType memberType = MemberType.valueOf(parts[3]);

                switch(memberType) {
                    case ACTIVE:
                        members.add(new ActiveMember(name, memberID, age, memberType));
                        break;
                    case PASSIVE:
                        members.add(new PassiveMember(name, memberID, age, memberType));
                        break;
                    case COMPETITIVE:
                        members.add(new CompetitiveMember(name, memberID, age, memberType));
                        break;
                }

            }
        } catch (IOException e) {
            SmashException.handle(new SmashException.FileWriteException("Kunne ikke skrive medlemsliste" + MEMBER_FILE));
        }
        return members;
    }


    public ArrayList<Member> loadDebt() {
        ArrayList<Member> debts = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(PAYMENT_FILE))) {

            String line;

            while((line = reader.readLine()) != null) {

                String[] parts = line.split(",");

                int memberID = Integer.parseInt(parts[0]);
                String name = (parts[1]);
                int age = Integer.parseInt(parts[2]);
                double arrearsAmount = Double.parseDouble(parts[3]);
                MemberType memberType = MemberType.valueOf(parts[4]);

                debts.add(new Member(memberID, name, age, arrearsAmount,memberType));
            }

        } catch(IOException e) {
            SmashException.handle(new SmashException.FileReadException("Could not read file " + PAYMENT_FILE));
        }
        return debts;
    }

    public void saveDebt(Member member) {

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(PAYMENT_FILE, true))) {

            for(Member s : member.getDebts()) {
                writer.write(member.getArrearsAmount() + ",");
                writer.newLine();
            }

        } catch(IOException e) {
            SmashException.handle(new SmashException.FileWriteException("Could not write file " + PAYMENT_FILE));
        }
    }

    @Override
    public List<Member> loadmembers() {
        List<Member> members = new ArrayList<>();
        // Her bruger vi standardindlæsning (buffered som default)
        try (BufferedReader br = new BufferedReader(new FileReader(MEMBER_FILE))) {
            String line;
            while ((line = br.readLine()) != null){
            Member member = parseMember(line);
            members.add(member);
            }
        } catch (IOException e) {
            SmashException.handle(new SmashException.FileReadException("Kunne ikke læse medlemsfilen" + MEMBER_FILE));
        }
        return members;

    }


        public void measurePerformance () {
            System.out.println("Starter CPU-tidsmåling...");

            long startNon = System.nanoTime();
            readWithoutBuffer();
            long endNon = System.nanoTime();
            long timeNon = endNon - startNon;

            long startBuf = System.nanoTime();
            readWithBuffer();
            long endBuf = System.nanoTime();
            long timeBuf = endBuf - startBuf;

            System.out.println("Tid uden buffer: " + timeNon + " ns");
            System.out.println("Tid med buffer: " + timeBuf + " ns");
            System.out.println("Forbedring: " + ((double) timeNon / timeBuf) + " gange hurtigere!");
        }

        private void readWithoutBuffer() {
            try (FileReader fr = new FileReader(MEMBER_FILE)) {
                int data;
                while ((data = fr.read()) != -1) {

                }
            } catch (IOException e) { e.printStackTrace(); }
        }


    private void readWithBuffer() {
        try (BufferedReader br = new BufferedReader(new FileReader(MEMBER_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {

            }
        } catch (IOException e) { e.printStackTrace(); }
    }

}
