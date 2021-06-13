package com.yavaconf._2_switchexpressions;

public class Old {

    static void ratePresentation(Grade grade) {
        int score;
        switch (grade) {
            case BAD:
            case WORST_EVER:
                score = 1;
                break;
            case NEUTRAL:
                score = 3;
                break;
            case GREAT:
            case NICE: {
                System.out.println("Impressive!");
                score = 5;
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + grade);
        }
        System.out.println("Presentation score: " + score);
    }

    public static void main(String[] args) {
        ratePresentation(Grade.GREAT);
    }
}
