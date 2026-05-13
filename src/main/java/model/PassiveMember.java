package model;

public class PassiveMember extends Member {
    public PassiveMember(int memberID, String name, int age,  double arrearsAmount, MemberType memberType) {
        super(memberID, name, age, arrearsAmount, memberType);
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
