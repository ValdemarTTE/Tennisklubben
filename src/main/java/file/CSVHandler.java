package file;

import model.*;
import util.SmashException;
import service.MemberFactoryImpl;
import java.io.*;
import java.util.*;

public class CSVHandler implements IStorage {
    private final String MEMBER_FILE = "src/main/resources/members.csv";

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
            SmashException.handle(new SmashException.MemberNotFoundException("Kunne ikke læse medlemsfilen" + MEMBER_FILE));
        }
        return members;

    }

    private Member parseMember(String line) {
        String[] data = line.split(",");

        int id = Integer.parseInt(data[0]);
        String name = data[1];
        int age = Integer.parseInt(data[2]);
        boolean isActive = Boolean.parseBoolean(data[3]);
        boolean isCompetitive = Boolean.parseBoolean(data[4]);

        MemberFactoryImpl factory = new MemberFactoryImpl();
        return factory.createMember(id, name, age,isActive, isCompetitive);
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
