package main;

import file.CSVHandler;
import model.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TennisSystemChairman {

    private Scanner sc;
    private Random random = new Random();
    private CSVHandler filehandler = new CSVHandler();
    public ArrayList<Member> memberList = new ArrayList<>();
    public ArrayList<Member> savedMembers = filehandler.loadMember();



    public void createMember(Scanner sc) {
        int memberID = random.nextInt(1000);

        sc.nextLine();
        System.out.println("Medlem navn: ");
        String name = sc.nextLine();

        Member newMember = null;
        while(true) {

            System.out.println("Medlem type (aktiv, passiv, konkurrence) ");
            String memberTypeString = sc.nextLine();

            System.out.println("Alder: ");
            int age = sc.nextInt();

            if(memberTypeString.equalsIgnoreCase("aktiv")) {
                newMember = new ActiveMember(name, memberID, age, MemberType.ACTIVE);
                break;
            } else if(memberTypeString.equalsIgnoreCase("passiv")) {
                newMember = new PassiveMember(name, memberID, age, MemberType.PASSIVE);
                break;
            } else if(memberTypeString.equalsIgnoreCase("konkurrence")) {
                newMember = new CompetitiveMember(name, memberID, age, MemberType.COMPETITIVE);
                break;
            }

        }

        memberList.add(newMember);
        filehandler.saveMember(newMember);
    }





}
