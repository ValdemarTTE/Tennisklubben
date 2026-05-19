package file;

import model.*;
import util.SmashException;

import java.io.*;
import java.util.*;

public class CSVHandler {
    private static final String MEMBER_FILE = "members.csv";
    private static final String PAYMENT_FILE = "payments.csv";
    private static final String TRAINING_FILE = "training.csv";



    public void saveMember(ArrayList<Member> memberList) {

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(MEMBER_FILE, true))) {

            for(Member m : memberList) {
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

    public void loadMember(ArrayList<Member> memberList) {

        memberList.clear();

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
                        memberList.add(new ActiveMember(name, memberID, age, memberType));
                        break;
                    case PASSIVE:
                        memberList.add(new PassiveMember(name, memberID, age, memberType));
                        break;
                    case COMPETITIVE:
                        memberList.add(new CompetitiveMember(name, memberID, age, memberType));
                        break;
                }

            }
        } catch (IOException e) {
            SmashException.handle(new SmashException.FileWriteException("Kunne ikke skrive medlemsliste" + MEMBER_FILE));
        }
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
