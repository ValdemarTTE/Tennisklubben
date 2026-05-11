package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class CompetitionPlayer extends Member {

    public CompetitionPlayer(int memberId, String name, int age, boolean isActive, boolean isCompetitive, boolean hasPaid, LocalDate createDate, MemberType memberType) {
        super(memberId, name, age, isActive, isCompetitive, hasPaid, createDate, memberType);
    }

    private String coachName;
    private String squad;
    private ArrayList<String> disciplines = new ArrayList<>();
    private ArrayList<TrainingResult> results = new ArrayList<>();

    public String getCoach() {
        return coachName;
    }

    public void addResult(TrainingResult result) {
        results.add(result);
    }

    public ArrayList<TrainingResult> getBestResults() {

        for(TrainingResult p : results) {

        }
    }





}
