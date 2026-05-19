package main;

import file.CSVHandler;
import model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TennisSystemChairman {

    private Scanner sc;
    private Random random = new Random();
    private CSVHandler filehandler = new CSVHandler();
    public ArrayList<Member> memberList = new ArrayList<>();


    public void createMember(Scanner sc) {
        int memberID = generateRandomMemberID();

        sc.nextLine();
        System.out.println("Medlem navn: ");
        String name = sc.nextLine();

        Member newMember = null;
        while(true) {

            System.out.println("Medlem type (aktiv, passiv, konkurrence) ");
            String memberTypeString = sc.nextLine();

            System.out.println("Alder: ");
            int age = sc.nextInt();
            sc.nextLine();

            if(memberTypeString.equalsIgnoreCase("aktiv")) {
                newMember = new ActiveMember(name, memberID, age, MemberType.ACTIVE);
                break;
            } else if(memberTypeString.equalsIgnoreCase("passiv")) {
                newMember = new PassiveMember(name, memberID, age, MemberType.PASSIVE);
                break;
            } else if(memberTypeString.equalsIgnoreCase("konkurrence")) {

                System.out.println("Discipline: (SINGLE, DOUBLE, MIXED DOUBLE");
                String input = sc.nextLine();
                Discipline discipline = Discipline.valueOf(input);

                newMember = new CompetitiveMember(name, memberID, age, MemberType.COMPETITIVE, discipline);
                break;
            }

        }

        memberList.add(newMember);
        filehandler.saveMember(memberList);
    }

    private int generateRandomMemberID() {

        int memberID;

        while(true) {
            memberID = random.nextInt(1000);

            boolean exists = false;

            for(Member member : memberList) {
                if(member.getMemberID() == memberID) {
                    exists = true;
                    break;
                }
            }
            if(!exists) {
                return memberID;
            }
        }
    }





}
