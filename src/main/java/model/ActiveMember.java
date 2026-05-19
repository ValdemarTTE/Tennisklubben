package model;

import java.time.LocalDate;

public class ActiveMember extends Member {

    public ActiveMember(String name, int memberID, int age, MemberType memberType) {
        super(name, memberID, age, memberType);
    }

    public ActiveMember(String name, int memberID, int age, MemberType memberType, LocalDate date) {
        super(name, memberID, age, memberType, date);
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
