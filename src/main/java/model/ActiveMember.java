package model;

import java.time.LocalDate;

public class ActiveMember extends Member {

    public ActiveMember(int memberID, String name, int age, boolean isActive, boolean isCompetitive, boolean arrearsAmount, MemberType memberType) {
        super(memberID, name, age, isActive, isCompetitive, arrearsAmount, memberType);
    }



    @Override
    public void addDiscipline(Discipline choice) {
        if (choice == Discipline.SINGLE) {
            addDisciplineToList(choice);
        } else if (choice == Discipline.DOUBLE) {
            addDisciplineToList(choice);
        } else if (choice == Discipline.MIXED_DOUBLE) {
            addDisciplineToList(choice);
        }
    }



}
