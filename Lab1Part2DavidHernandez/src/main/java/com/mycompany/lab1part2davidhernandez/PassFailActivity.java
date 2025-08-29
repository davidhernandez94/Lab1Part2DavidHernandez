package com.mycompany.lab1part2davidhernandez;

/**
 * @author david hernandez
 */

public class PassFailActivity extends GradedActivity {
    private double minPassingScore;

    public PassFailActivity(double minPassingScore) {
        super(0);
        this.minPassingScore = minPassingScore;
    }

    /**
     * same as overridden method, except returns pass or fail
     * instead of letter grade
     * @return char P for pass and F for fail
     */
    @Override
    public char getGrade() {
        if (this.getScore() >= minPassingScore) {
            return 'P';
        }
        return 'F';
    }

    public double getMinPassingScore() {
        return minPassingScore;
    }
}
