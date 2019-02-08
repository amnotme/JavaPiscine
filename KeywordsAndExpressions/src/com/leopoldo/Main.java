package com.leopoldo;

public class Main {

    public static void main(String[] args) {

    boolean gameOver = true;
    int score = 800;
    int levelCompleted = 4;
    int bonus = 100;

    if (gameOver) {
        int finalScore = score + (levelCompleted * bonus);
        finalScore += 1000;
        System.out.println("Your final score was " + finalScore);
    }
    score = 10000;
    levelCompleted = 8;
    bonus = 200;
    if (gameOver) {
        int finalScore = score + (levelCompleted * bonus);
        System.out.println("Your final score was " + finalScore);
    }


    }
}
