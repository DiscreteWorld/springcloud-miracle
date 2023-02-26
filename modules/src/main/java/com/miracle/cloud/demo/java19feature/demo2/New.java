package com.miracle.cloud.demo.java19feature.demo2;

/**
 * @Author:徐塬峰
 * @Date: 2023/2/26  14:57
 * @Version 1.0
 */
public class New {
    static void ratePresentation(Grade grade) {
        int score = switch (grade) {
            case BAD, WORST_EVER -> 1;
            case NEUTRAL -> 3;
            case GREAT, NICE -> {
                System.out.println("Impressive!");
                yield 5;
            }
        };
        System.out.println("Presentation score: " + score);
    }

    public static void main(String[] args) {
        ratePresentation(Grade.GREAT);
    }
}
