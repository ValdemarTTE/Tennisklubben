package model;

import java.util.ArrayList;

public abstract class Member {

    private int memberID;
    private String name;
    private int age;
    private boolean isActive;
    private boolean isCompetitive;
    private boolean arrearsAmount;
    private MemberType memberType;
    private ArrayList<Discipline> discipline = new ArrayList<>();

    public Member(int memberID, String name, int age, boolean isActive, boolean isCompetitive, boolean arrearsAmount, LocalDate createDate, MemberType memberType) {
        this.memberID = memberID;
        this.name = name;
        this.age = age;
        this.isActive = isActive;
        this.isCompetitive = isCompetitive;
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

    public void setArrearsAmount(boolean arrearsAmount) {
        this.arrearsAmount = arrearsAmount;
    }

    public void addDisciplineToList(Discipline disciplineType) {
        discipline.add(disciplineType);
    }

    public abstract void addDiscipline(Discipline choice);

    public boolean isJunior() {
       return memberType == MemberType.JUNIOR;
    }

    public boolean


}
