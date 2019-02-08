package com.leopoldo;

public class Main {

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score is " + finalScore);
        }

    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position);
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return (1);
        } else if (score >= 500) {
            return (2);
        } else if (score >= 100) {
            return (3);
        } else {
            return (4);
        }
    }

    public static void main(String[] args) {

    int player1 = calculateHighScorePosition(1500);
    int player2 = calculateHighScorePosition(900);
    int player3 = calculateHighScorePosition(400);
    int player4 = calculateHighScorePosition(50);

    displayHighScorePosition("leo", player1);
    displayHighScorePosition("leo2", player2);
    displayHighScorePosition("leo3", player3);
    displayHighScorePosition("leo4", player4);
    }
}
