package model;

import java.time.LocalDate;

public class ActiveMember extends Member {
    private boolean isCompetitive;

    public ActiveMember(int memberId, String name, int age, boolean isActive, boolean isCompetitive, boolean hasPaid, LocalDate createDate, MemberType memberType) {
        super(memberId, name, age, isActive, isCompetitive, hasPaid, createDate, memberType);
        this. isCompetitive = isCompetitive;
    }

    public boolean isCompetitive() {
        return isCompetitive;
    }

    public void setCompetitive(boolean competitive) {
        isCompetitive = competitive;
    }

    @Override
    public double getDiscount() {
        return 1500;
    }

}
