package com.kodilla.good.patterns.challenges;

import java.util.stream.*;


public class MovieStoreRunner {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        String allTitlesInOneLine = movieStore.getMovies().values().stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.joining("!", "<<", ">>"));
        System.out.println(allTitlesInOneLine);
    }
}
