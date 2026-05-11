package model;

import java.time.LocalDate;

public class TrainingResult {

    private String discipline ;
    private double resultValue;
    private LocalDate date;
    private boolean isTournament;

    public TrainingResult(String discipline, double resultValue, LocalDate date, boolean isTournament) {
        this.discipline = discipline;
        this.resultValue = resultValue;
        this.date = date;
        this.isTournament = isTournament;
    }

    public String getDiscipline() {
        return discipline;
    }

    public double getResultValue() {
        return resultValue;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return discipline + " " + resultValue + " " + date + " " + isTournament;
    }
}
