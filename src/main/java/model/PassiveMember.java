package model;

import java.time.LocalDate;

public class PassiveMember extends Member {
    public PassiveMember (int memberId, String name, int age, boolean isActive, boolean isCompetitive, boolean hasPaid, LocalDate createDate, MemberType memberType) {
        super(memberId, name, age, isActive, isCompetitive, hasPaid, createDate, memberType);
    }

    @Override
    public double getDiscount() {
        return 250;
    }
}

