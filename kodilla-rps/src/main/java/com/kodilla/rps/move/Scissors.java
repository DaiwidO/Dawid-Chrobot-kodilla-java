package com.kodilla.rps.move;

public class Scissors implements Move {

    @Override
    public boolean fight(Move move) {
        if (move instanceof Paper) {
            return true;
        } else if (move instanceof Rock) {
            return false;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Scissors";
    }
}
