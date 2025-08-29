package com.mycompany.lab1part2davidhernandez;

/**
 * @author david hernandez
 */

public class Essay extends GradedActivity {
    private double grammar;
    private double spelling;
    private double correctLength;
    private double content;

    public Essay(double grammar, double spelling, double correctLength, double content) {
        super(0);
        this.grammar = grammar;
        this.spelling = spelling;
        this.correctLength = correctLength;
        this.content = content;
        this.setScore(grammar + spelling + correctLength + content);
    }

    public double getGrammar() {
        return grammar;
    }

    public void setGrammar(double grammar) {
        this.grammar = grammar;
    }

    public double getSpelling() {
        return spelling;
    }

    public void setSpelling(double spelling) {
        this.spelling = spelling;
    }

    public double getCorrectLength() {
        return correctLength;
    }

    public void setCorrectLength(double correctLength) {
        this.correctLength = correctLength;
    }

    public double getContent() {
        return content;
    }

    public void setContent(double content) {
        this.content = content;
    }
}
