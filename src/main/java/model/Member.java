package model;

import java.util.ArrayList;

public abstract class Member {

    private int memberID;
    private String name;
    private int age;
    private double arrearsAmount;
    private MemberType memberType;
    private ArrayList<Discipline> discipline = new ArrayList<>();

    public Member(int memberID, String name, int age,double arrearsAmount, MemberType memberType) {
        this.memberID = memberID;
        this.name = name;
        this.age = age;
        this.arrearsAmount = arrearsAmount;
        this.memberType = memberType;
    }

    public int getMemberID() {
        return memberID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setArrearsAmount(double arrearsAmount) {
        this.arrearsAmount = arrearsAmount;
    }

    public void addDisciplineToList(Discipline disciplineType) {
        discipline.add(disciplineType);
    }

    public abstract void addDiscipline(Discipline choice);

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


}
