package com.kodilla.rps;

public class GameInfo {

    int rounds;
    int roundsWonByPlayer = 0;
    int roundsWonByComputer = 0;

    public GameInfo(int rounds) {
        this.rounds = rounds;
    }

    public int getRounds() {
        return rounds;
    }

    public int getRoundsWonByPlayer() {
        return roundsWonByPlayer;
    }

    public int getRoundsWonByComputer() {
        return roundsWonByComputer;
    }

    public void printRoundsStatus() {
        System.out.println("\nPlayer : " + roundsWonByPlayer + " points  Computer : " + roundsWonByComputer + " points");
    }
}
