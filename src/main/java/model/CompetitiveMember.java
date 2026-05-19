package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class CompetitiveMember extends Member {

    public CompetitiveMember(String name, int memberID, int age, MemberType memberType, Discipline discipline) {
        super(name, memberID, age, memberType);
        this.discipline = discipline;
    }

    public CompetitiveMember(String name, int memberID, int age, MemberType memberType, Discipline discipline, LocalDate date) {
        super(name, memberID, age, memberType, date);
        this.discipline = discipline;
    }

    private Discipline discipline;

    public Discipline getDiscipline() {
        return discipline;
    }
    private ArrayList<TrainingResult> results = new ArrayList<>();


    public void addResult(TrainingResult result) {
        results.add(result);
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
