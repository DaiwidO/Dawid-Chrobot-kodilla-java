package com.kodilla.exception.test;

import java.util.*;

public class FlightFinder {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Warsaw Modlin", true);
        airports.put("Warszawa Okęcie", false);
        airports.put("Gdańsk", true);
        airports.put("Poznań", true);

        String arrivalAirport = flight.getArrivalAirport();
        if (airports.containsKey(arrivalAirport)) {
            return airports.get(arrivalAirport);
        }
        else {
            throw new RouteNotFoundException(arrivalAirport + " not found");
        }
    }
}
