package com.kodilla.rps.move;

public class Rock implements Move {

    @Override
    public boolean fight(Move move) {
        if (move instanceof Scissors) {
            return true;
        } else if (move instanceof Paper) {
            return false;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Rock";
    }
}
