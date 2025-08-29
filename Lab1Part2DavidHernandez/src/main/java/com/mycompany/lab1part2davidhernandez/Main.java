/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1part2davidhernandez;

/**
 * @author david hernandez
 */

public class Main {
    public static void main(String[] args) {
        // test steps 1, 2
        FinalExam exam = new FinalExam(50, 6);
        System.out.println("number of questions on final exam: " + exam.getNumQuestions() +
                "\nquestions missed: " + exam.getNumMissed() +
                "\neach question counts for " + exam.getPointsEach() + " points" +
                "\nthe exam score is " + exam.getScore() +
                "\nthe exam grade is " + exam.getGrade());
        // test step 3
        PassFailExam exam2 = new PassFailExam(70, 10, 4);
        System.out.println("\nnumber of questions on exam: " + exam2.getNumQuestions() +
                "\nmissed questions: " + exam2.getNumMissed() +
                "\nminimum passing score: " + exam2.getMinPassingScore() +
                "\neach question counts for " + exam2.getPointsEach() + " points" +
                "\nexam score: " + exam2.getScore() +
                "\nexam grade: " + exam2.getGrade());
        // test step 4
        Essay essay = new Essay(28, 19, 20, 24);
        System.out.println("\nTerm paper:" +
                "\ngrammar points: " + essay.getGrammar() +
                "\nspelling points: " + essay.getSpelling() +
                "\nlength points: " + essay.getCorrectLength() +
                "\ncontent points: " + essay.getContent() +
                "\ntotal points: " + essay.getScore() +
                "\ngrade: " + essay.getGrade());

        // test step 5
        GradedActivity lab = new GradedActivity(90);
        CourseGrades courseGrades = new CourseGrades();
        courseGrades.setLab(lab);
        courseGrades.setPassFailExam(exam2);
        courseGrades.setEssay(essay);
        courseGrades.setFinalExam(exam);
        System.out.println("\n" + courseGrades.toString());

        // test step 6
        System.out.println("\naverage score: " + courseGrades.getAverage());
        System.out.println("highest score: " + courseGrades.getHighest().getScore());
        System.out.println("lowest score: " + courseGrades.getLowest().getScore());
    }
}
