package model;

import java.time.LocalDate;

public abstract class Member {

    private int memberId;
    private String name;
    private int age;
    private boolean isActive;
    private boolean isCompetitive;
    private boolean hasPaid;
    private LocalDate createDate;
    private MemberType memberType;

    public Member(int memberId, String name, int age, boolean isActive, boolean isCompetitive, boolean hasPaid, LocalDate createDate, MemberType memberType) {
        this.memberId = memberId;
        this.name = name;
        this.age = age;
        this.isActive = isActive;
        this.isCompetitive = isCompetitive;
        this.hasPaid = hasPaid;
        this.createDate = createDate;
        this.memberType = memberType;
    }

    public int getAge() {
        return age;
    }

    public void setHasPaid(boolean hasPaid) {
        this.hasPaid = hasPaid;
    }

    public abstract double getDiscount();

    public double calculateDues(double amount) {
        return amount - (amount * getDiscount());
    }

    public boolean isJunior() {
       if(memberType == MemberType.JUNIOR) {
           return true;
       } else {
           return false;
       }
    }

    @Override
    public int compareTo() {

    }
}
