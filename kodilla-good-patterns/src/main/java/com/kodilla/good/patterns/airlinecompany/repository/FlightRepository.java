package com.kodilla.good.patterns.airlinecompany.repository;

import com.kodilla.good.patterns.airlinecompany.model.Flight;

import java.util.*;
import java.util.Set;

public class FlightRepository {


    Set<Flight> flights = new HashSet<>();

    Flight flight1 = new Flight("GDAŃSK", "WROCŁAW");
    Flight flight2 = new Flight("WARSZAWA", "WROCŁAW");
    Flight flight3 = new Flight("WROCŁAW", "WARSZAWA");
    Flight flight4 = new Flight("GDAŃSK", "POZNAŃ");
    Flight flight5 = new Flight("POZNAŃ", "WARSZAWA");

    public FlightRepository() {
        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);
        flights.add(flight4);
        flights.add(flight5);
    }

    public Set<Flight> getFlights() {
        return flights;
    }
}
