package model;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Member {

    private String name;
    private int memberID;
    private int age;
    private MemberType memberType;
    public ArrayList<Member> memberList = new ArrayList<>();
    private double amountPaid;
    public LocalDate date;

    public Member(String name, int memberID, int age, MemberType memberType) {
        this.name = name;
        this.memberID = memberID;
        this.age = age;
        this.memberType = memberType;
        this.date = LocalDate.now();
    }

    public Member(String name, int memberID, int age, MemberType memberType, LocalDate date) {
        this.name = name;
        this.memberID = memberID;
        this.age = age;
        this.memberType = memberType;
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }


    public String getName() {
        return name;
    }

    public int getMemberID() {
        return memberID;
    }

    public int getAge() {
        return age;
    }

    public MemberType getMemberType() {
        return memberType;
    }

    public ArrayList<Member> getMemberList() {
        return memberList;
    }

    public void addMember(Member member) {
        memberList.add(member);
    }

    public abstract double getAnnualFee();

    public double getArrearsAmount() {
        return getAnnualFee() - amountPaid;
    }



    public void addDisciplineToList(Discipline disciplineType) {
        discipline.add(disciplineType);
    }



    public MemberType typeOFMember() {
        if(memberType == MemberType.ACTIVE) {
            return MemberType.ACTIVE;
        } else if (memberType == MemberType.PASSIVE) {
            return MemberType.PASSIVE;
        } else if (memberType == MemberType.JUNIOR) {
            return MemberType.JUNIOR;
        } else if (memberType == MemberType.SENIOR) {
            return MemberType.SENIOR;
        } else if (memberType == MemberType.COMPETITIVE) {
            return MemberType.COMPETITIVE;
        } else if (memberType == MemberType.OVER_SIXTY) {
            return MemberType.OVER_SIXTY;
        }
        return memberType;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + memberID + " " + discipline + " " + date;
    }

}
