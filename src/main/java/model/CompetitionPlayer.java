package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class CompetitionPlayer extends Member {

    public CompetitionPlayer(int memberID, String name, int age, boolean isActive, boolean isCompetitive, boolean arrearsAmount, LocalDate createDate, MemberType memberType) {
        super(memberID, name, age, isActive, isCompetitive, arrearsAmount, createDate, memberType);
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
