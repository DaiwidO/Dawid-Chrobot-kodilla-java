package com.kodilla.exception.test;

public class MainRunner {

    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();
        Flight wmToP = new Flight("Warsaw Modlin", "Poznań");
        Flight woToG = new Flight("Warszawa Okęcie", "Gdańsk");
        Flight pToWo = new Flight("Poznań", "Warszawa Okęcie");

        try {
            boolean available = flightFinder.findFlight(wmToP);
            String availability = available ? "is available" : "is not available";
            System.out.println(wmToP + " " + availability);

        } catch (RouteNotFoundException e) {
            System.out.println("Airport not found! " + e.getMessage());
        } finally {
            System.out.println("Search finished.");
        }

        try {
            boolean available2 = flightFinder.findFlight(woToG);
            String availability2 = available2 ? "is available" : "is not available";
            System.out.println(woToG + " " + availability2);

        } catch (RouteNotFoundException e) {
            System.out.println("Airport not found! " + e.getMessage());
        } finally {
            System.out.println("Search finished.");
        }

        try {
            boolean available3 = flightFinder.findFlight(pToWo);
            String availability3 = available3 ? "is available" : "is not available";
            System.out.println(wmToP + " " + availability3);

        } catch (RouteNotFoundException e) {
            System.out.println("Airport not found! " + e.getMessage());
        } finally {
            System.out.println("Search finished.");
        }
    }
}