package com.kodilla.good.patterns.airlinecompany.service;

import com.kodilla.good.patterns.airlinecompany.model.Flight;
import com.kodilla.good.patterns.airlinecompany.repository.FlightRepository;

import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {

    public void findFlightsFrom(String city) {

        FlightRepository flightRepository = new FlightRepository();

        List<Flight> flightListFrom = flightRepository.getFlights().stream()
                .filter(f -> f.getDeparture() == city)
                .collect(Collectors.toList());

        if (flightListFrom.isEmpty()) {
            System.out.println("No flights found");
        } else {
            System.out.println("Flights from " + city + ":");
            flightListFrom.stream()
                    .forEach(flight -> System.out.println(flight.getDeparture() + " -> " + flight.getDestination()));
        }
    }

    public void findFlightsTo(String city){

        FlightRepository flightRepository = new FlightRepository();

        List<Flight> flightListTo = flightRepository.getFlights().stream()
                .filter(flight -> flight.getDestination() == city)
                .collect(Collectors.toList());

        if (flightListTo.isEmpty()) {
            System.out.println("No flights found");
        } else {
            System.out.println("Flights to " + city + ":");
            flightListTo.stream()
                    .forEach(f -> System.out.println(f.getDeparture() + " -> " + f.getDestination()));
        }
    }

    public void findFlightsThroughAnotherCity(String departure, String via, String destination){

        FlightRepository flightRepository = new FlightRepository();

        List<Flight> flightFirstListToThroughAnotherCity = flightRepository.getFlights().stream()
                .filter(f -> f.getDeparture().equals(departure) && f.getDestination().equals(via))
                .collect(Collectors.toList());

        List<Flight> flightSecondListToThroughAnotherCity = flightRepository.getFlights().stream()
                .filter(f -> f.getDeparture().equals(via) && f.getDestination().equals(destination))
                .collect(Collectors.toList());

        if (!flightFirstListToThroughAnotherCity.isEmpty() && !flightSecondListToThroughAnotherCity.isEmpty()) {
            System.out.println("Flights from " + departure + " via " + via + " to " + destination + ":");
            flightFirstListToThroughAnotherCity.stream()
                    .forEach(f -> System.out.println(f.getDeparture() + " -> " + f.getDestination()));

            flightSecondListToThroughAnotherCity.stream()
                    .forEach(f -> System.out.println(f.getDeparture() + " -> " + f.getDestination()));
        }
        else {
            System.out.println("No flights found from " + departure + " via " + via + " to " + destination);
        }
    }
}
