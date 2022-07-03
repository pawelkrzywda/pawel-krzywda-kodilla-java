package com.kodilla.good.patterns.flights;

public class FlightServiceMain{
    public static void main(String[] args){
        FlightsDB flightsDB = new FlightsDB();
        flightsDB.startDB();
        FlightSearch.searchFlights(flightsDB);
    }
}
