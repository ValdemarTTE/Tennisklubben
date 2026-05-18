package model;

public class PassiveMember extends Member {
    public PassiveMember(String name, int memberID, int age, MemberType memberType) {
        super(name, memberID, age, memberType);
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
