package com.kodilla.exception.test;

public class FlightSearchRunner {
    public static void main(String[] args) {
        Flight flight1 = new Flight("JFK", "Okecie");

        FlightSearch flightSearch = new FlightSearch();

        try {
            flightSearch.findFlight(flight1);
        } catch(RouteNotFoundException e){
            System.out.println("Arrival airport not found in the database.");
        }
    }
}
