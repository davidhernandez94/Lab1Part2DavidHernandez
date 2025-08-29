/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1part2davidhernandez;

/**
 * @author David Hernandez
 */

public class FinalExam extends GradedActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public FinalExam(int numQuestions, int numMissed) {
        super(0);
        this.numQuestions = numQuestions;
        this.numMissed = numMissed;
        this.pointsEach = 100 / numQuestions;
        this.setScore(100 - (numMissed * pointsEach));
    }
    
    /**
     * calculate the points 
     * for each question and the numeric score for this exam
     * @return double points per question
     */
    public double getPointsEach() {
        return 100 / numQuestions;
    }
    
    public int getNumMissed() {
        return numMissed;
    }

    public int getNumQuestions() {
        return numQuestions;
    }

    public void setNumQuestions(int numQuestions) {
        this.numQuestions = numQuestions;
    }
    
    
}
