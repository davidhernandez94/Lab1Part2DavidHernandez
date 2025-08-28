/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1part2davidhernandez;

/**
 *
 * @author 6309110
 */
public class Main {
    public static void main(String[] args) {
        FinalExam exam = new FinalExam(100, 11);
        System.out.println("number of questions on final exam: " + exam.getNumQuestions());
        System.out.println("questions missed: " + exam.getNumMissed());
        System.out.println("each question counts for " + exam.getPointsEach() + " points");
        System.out.println("the exam score is " + exam.getScore());
        System.out.println("the exam grade is " + exam.getGrade());

        PassFailExam exam2 = new PassFailExam(60, 20, 11);
        System.out.println("number of questions on exam: " + exam2.getNumQuestions());
        System.out.println("missed questions: " + exam2.getNumMissed());
        System.out.println("minimum passing score: " + exam2.getMinPassingScore());
        System.out.println("each question counts for " + exam2.getPointsEach() + " points");
        System.out.println("exam score: " + exam2.getScore());
        System.out.println("exam grade: " + exam2.getGrade());
    }
}
