package com.kodilla.rps;

import com.kodilla.rps.move.Move;
import com.kodilla.rps.move.MoveFactory;

import java.util.Random;
import java.util.Scanner;

public class RpsGame {

    public void printKeys() {
        System.out.println("""
                These are the keys for playing the game.
                [1] - play "rock" 
                [2] - play "paper" 
                [3] - play "scissors" 
                [x] - end the game 
                [n] - restart the game 
                [?] - if you need to see the keys again
                """);
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();
        MoveFactory moveFactory = new MoveFactory();

        System.out.println("Welcome to Rock Paper Scissors game!");

        System.out.println("What's your name? ");
        String name = scanner.nextLine();
        Player player = new Player(name);
        System.out.println("Welcome " + player.getName());

        System.out.println("Type how many rounds are needed to win. ");
        int rounds = scanner.nextInt();
        scanner.nextLine();
        GameInfo gameInfo = new GameInfo(rounds);
        System.out.println("Rounds needed for game victory: " + gameInfo.getRounds());

        printKeys();

        System.out.println("");
        System.out.println("Let's begin!");

        boolean end = false;

        while (!end) {

            System.out.println("\nStart the round by making a move");
            String input = scanner.nextLine();

            if (input.equals("1") || input.equals("2") || input.equals("3")) {

                int randomNumber = randomGenerator.nextInt(3) + 1;

                Move computerMove = moveFactory.makeRandomMove(randomNumber);
                Move playerMove = moveFactory.makeMove(input);

                System.out.println("Your move is : " + playerMove);
                System.out.println("Computer move is : " + computerMove);

                if (playerMove.getClass() == computerMove.getClass()) {
                    System.out.println("It's a draw!");
                    gameInfo.printRoundsStatus();
                } else if (playerMove.fight(computerMove)) {
                    gameInfo.roundsWonByPlayer++;
                    System.out.println(player.getName() + " won this round!");
                    gameInfo.printRoundsStatus();
                } else {
                    gameInfo.roundsWonByComputer++;
                    System.out.println("Computer won this round!");
                    gameInfo.printRoundsStatus();
                }

            } else if (input.equals("x") || input.equals("X")) {
                System.out.println("Are you sure you want to end the game?\n" + "[1] = yes  [2] = no");
                int endGame = scanner.nextInt();
                scanner.nextLine();
                if (endGame == 1) {
                    System.out.println("Thanks for playing!\n" + "I hope we'll fight again soon :D");
                    end = true;
                } else if (endGame == 2) {
                    System.out.println("Let's continue then!");
                    gameInfo.printRoundsStatus();
                    end = false;
                }
            } else if (input.equals("n") || input.equals("N")) {
                System.out.println("Are you sure you want to quit the current game?\n" + "[1] = yes  [2] = no");
                int restartGame = scanner.nextInt();
                scanner.nextLine();
                if (restartGame == 1) {
                    gameInfo.roundsWonByPlayer = 0;
                    gameInfo.roundsWonByComputer = 0;
                    System.out.println("Game restarted!");
                    gameInfo.printRoundsStatus();
                    continue;
                } else if (restartGame == 2) {
                    System.out.println("Let's continue then!");
                    gameInfo.printRoundsStatus();
                    continue;
                }
            } else if (input.equals("?")) {
                printKeys();
                gameInfo.printRoundsStatus();
            } else {
                System.out.println("Invalid input. Try again!\n");
                printKeys();
                gameInfo.printRoundsStatus();
            }

            if (gameInfo.rounds == gameInfo.roundsWonByPlayer) {
                System.out.println(player.getName() + " won!");
                System.out.println("Game finished!");
                end = true;
            }
            if (gameInfo.rounds == gameInfo.roundsWonByComputer) {
                System.out.println("You lost!");
                System.out.println("Game finished!");
                end = true;
            }
        }
    }
}