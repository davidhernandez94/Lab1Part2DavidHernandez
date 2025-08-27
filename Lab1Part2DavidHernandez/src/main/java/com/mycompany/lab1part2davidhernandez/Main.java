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
        FinalExam exam = new FinalExam(20, 3);
        System.out.println("number of questions on final exam: " + exam.getNumQuestions());
        System.out.println("questions missed: " + exam.getNumMissed());
        System.out.println("each question counts for " + exam.getPointsEach() + " points");
        System.out.println("the exam score is " + exam.score);
        System.out.println("the exam grade is " + exam.getGrade());
    }
}
