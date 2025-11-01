package com.kodilla.good.patterns.airlinecompany.application;

import com.kodilla.good.patterns.airlinecompany.model.Flight;
import com.kodilla.good.patterns.airlinecompany.repository.FlightRepository;
import com.kodilla.good.patterns.airlinecompany.service.FlightFinder;

import java.util.Set;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {

        FlightRepository flightRepository = new FlightRepository();
        FlightFinder flightFinder = new FlightFinder();

        Set<Flight> allFlights = flightRepository.getFlights();

        String allFlightsString = allFlights.stream()
                .map(flight -> flight.getDeparture() + " -> " + flight.getDestination())
                .collect(Collectors.joining(", ", "<<", ">>"));

        System.out.println("All flights:\n " + allFlightsString);

        flightFinder.findFlightsFrom("GDAŃSK");
        System.out.println("");
        flightFinder.findFlightsTo("WARSZAWA");
        System.out.println("");
        flightFinder.findFlightsThroughAnotherCity("GDAŃSK", "WROCŁAW", "WARSZAWA");
    }
}
