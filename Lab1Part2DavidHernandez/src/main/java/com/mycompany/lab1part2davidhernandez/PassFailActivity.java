package com.mycompany.lab1part2davidhernandez;

public class PassFailActivity extends GradedActivity {
    private double minPassingScore;

    public PassFailActivity(double minPassingScore) {
        this.minPassingScore = minPassingScore;
    }

    /**
     * same as overridden method, except returns pass or fail
     * instead of letter grade
     * @return char P for pass and F for fail
     */
    @Override
    public char getGrade() {
        if (this.getScore() >= 60) {
            return 'P';
        }
        return 'F';
    }

    public double getMinPassingScore() {
        return minPassingScore;
    }
}
