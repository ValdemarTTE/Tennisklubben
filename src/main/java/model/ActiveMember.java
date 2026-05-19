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
    public double getAnnualFee() {
      if (getAge() < 18){
          return 800;
      } if (getAge()>=60){
          return 0.75*1500;
      }
        return 1500;
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
