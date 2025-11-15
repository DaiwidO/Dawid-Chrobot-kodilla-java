package com.kodilla.rps.move;

public class MoveFactory {

    public final Move makeMove(String input) {
        return switch (input) {
            case "1" -> new Rock();
            case "2" -> new Paper();
            case "3" -> new Scissors();
            default -> null;
        };
    }

    public final Move makeRandomMove(int randomNumber) {
        switch (randomNumber) {
            case 1: return new Rock();
            case 2: return new Paper();
            case 3: return new Scissors();
            default: return null;
        }
    }
}
