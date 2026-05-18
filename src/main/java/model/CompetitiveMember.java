package model;

import java.util.ArrayList;

public class CompetitiveMember extends Member {

    public CompetitiveMember(String name, int memberID, int age, MemberType memberType) {
        super(name, memberID, age, memberType);
    }

    private String coachName;
    private ArrayList<TrainingResult> results = new ArrayList<>();

    public String getCoach() {
        return coachName;
    }

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
