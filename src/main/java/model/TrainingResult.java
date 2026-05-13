package model;

import java.time.LocalDate;

public class TrainingResult {

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


    @Override
    public String toString() {
        return discipline + " " + resultValue + " " + isTournament;
    }
}
