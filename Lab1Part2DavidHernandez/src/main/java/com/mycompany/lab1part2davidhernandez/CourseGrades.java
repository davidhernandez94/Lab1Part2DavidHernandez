package com.mycompany.lab1part2davidhernandez;

/**
 * @author david hernandez
 */

public class CourseGrades implements Analyzable {
    private GradedActivity[] grades;
    private final int NUM_GRADES = 4;

    public CourseGrades() {
        grades = new GradedActivity[NUM_GRADES];
    }

    /**
     * stored in index 0 of grades
     * @param gradedActivity student's lab
     */
    public void setLab(GradedActivity gradedActivity) {
        grades[0] = gradedActivity;
    }

    /**
     * stored in index 1 of grades
     * @param passfail student's pass fail exam
     */
    public void setPassFailExam(PassFailExam passfail) {
        grades[1] = passfail;
    }

    /**
     * stored in index 2 of grades
     * @param essay student's essay
     */
    public void setEssay(Essay essay) {
        grades[2] = essay;
    }

    /**
     * stored in index 3 of grades
     * @param finalExam student's final exam
     */
    public void setFinalExam(FinalExam finalExam) {
        grades[3] = finalExam;
    }

    /**
     * Returns the average of the
     * numeric scores stored in the grades array.
     * @return average of grades
     */
    @Override
    public double getAverage() {
        double sum = 0;
        for (GradedActivity activity : grades) {
            sum += activity.getScore();
        }
        return sum / NUM_GRADES;
    }

    /**
     * Returns a reference
     * to the element in the grades array with the highest
     * numeric score
     * @return activity with highest grade
     */
    @Override
    public GradedActivity getHighest() {
        GradedActivity highest = grades[0];
        for (GradedActivity activity : grades) {
            if (highest.getScore() < activity.getScore()) {
                highest = activity;
            }
        }
        return highest;
    }

    /**
     * Returns a reference
     * to the element in the grades array with the lowest
     * numeric score
     * @return activity with lowest grade
     */
    @Override
    public GradedActivity getLowest() {
        GradedActivity lowest = grades[0];
        for (GradedActivity activity : grades) {
            if (lowest.getScore() > activity.getScore()) {
                lowest = activity;
            }
        }
        return lowest;
    }

    @Override
    public String toString() {
        return String.format("%s: %.1f\t\t%s: %c\n%s: %.1f\t\t%s: %c\n%s: %.1f\t\t%s: %c\n%s: %.1f\t\t%s: %c",
                "lab score", grades[0].getScore(), "grade", grades[0].getGrade(),
                "pass/fail exam score", grades[1].getScore(), "grade", grades[1].getGrade(),
                "essay score", grades[2].getScore(), "grade", grades[2].getGrade(),
                "final exam score", grades[3].getScore(), "grade", grades[3].getGrade() );
    }
}
