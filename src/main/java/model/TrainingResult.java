package model;

import java.time.LocalDate;

public abstract class TrainingResult {

    private String discipline ;
    private double resultValue;
    private boolean isTournament;

    public TrainingResult(String discipline, double resultValue, boolean isTournament) {
        this.discipline = discipline;
        this.resultValue = resultValue;
        this.isTournament = isTournament;
    }

    public String getDiscipline() {
        return discipline;
    }

    public double getResultValue() {
        return resultValue;
    }

    public abstract void addDiscipline(Discipline choice);


    @Override
    public String toString() {
        return discipline + " " + resultValue + " " + isTournament;
    }




}
