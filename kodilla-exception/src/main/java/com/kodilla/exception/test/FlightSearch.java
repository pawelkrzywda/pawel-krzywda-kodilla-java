package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    public void findFlight (Flight flight) throws RouteNotFoundException{
        Map<String, Boolean > flights = new HashMap<>();
        flights.put("Balice", false);
        flights.put("JFK", true);

        if(flights.get(flight.getArrivalAirport()) == null){
            throw new RouteNotFoundException();
        } else if(flights.get(flight.getArrivalAirport()) == true){
            System.out.println("You can fly to this airport: " + flight.getArrivalAirport());
        } else if(flights.get(flight.getArrivalAirport()) == false){
            System.out.println("You can't fly to this airport: " + flight.getArrivalAirport());
        }
    }
}
