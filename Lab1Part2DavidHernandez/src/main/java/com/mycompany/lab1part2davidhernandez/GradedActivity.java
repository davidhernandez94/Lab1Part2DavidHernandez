/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1part2davidhernandez;

/**
 * @author David Hernandez
 */

public class GradedActivity {
    private double score;

    public GradedActivity(double score) {
        this.score = score;
    }

    /**
     * calculates the corresponding letter grade
     * @return char letter grade based on score
     */
    public char getGrade() {
        return switch((int) (score / 10)) {
            case 9, 10 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            default -> 'F';
        };
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
