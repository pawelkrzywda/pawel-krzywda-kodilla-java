package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightsDB{

    private List<Flight> flights = new ArrayList<>();

    public void startDB(){
        flights.add(new Flight("Warszawa", "Kraków"));
        flights.add(new Flight("Kraków", "Warszawa"));
        flights.add(new Flight("Warszawa", "Gdańsk"));
        flights.add(new Flight("Gdańsk", "Warszawa"));
        flights.add(new Flight("Warszawa", "Katowice"));
        flights.add(new Flight("Katowice", "Warszawa"));
        flights.add(new Flight("Warszawa", "Wrocław"));
        flights.add(new Flight("Wrocław", "Warszawa"));
        flights.add(new Flight("Warszawa", "Rzeszów"));
        flights.add(new Flight("Rzeszów", "Warszawa"));
    }

    public List<Flight> findDepartures(String departureCity){
        List<Flight> departures = flights.stream()
                .filter(flight -> flight.getDepartureCity().equals(departureCity))
                .collect(Collectors.toList());
        return departures;
    }

    public List<Flight> findArrivals(String arrivalCity){
        List<Flight> arrivals = flights.stream()
                .filter(flight -> flight.getArrivalCity().equals(arrivalCity))
                .collect(Collectors.toList());
        return arrivals;
    }

    public List<TransferFlight> findTransferFlights(String departureCity, String arrivalCity){
        List<TransferFlight> transferFlights = new ArrayList<>();
        List<Flight> departures = findDepartures(departureCity);
        List<Flight> arrivals = findArrivals(arrivalCity);

        for(int i=0;i<departures.size();i++){
            for(int j=0;j<arrivals.size();j++){
                if(departures.get(i).getArrivalCity().equals(arrivals.get(j).getDepartureCity())){
                    transferFlights.add(new TransferFlight(departures.get(i), arrivals.get(j)));
                }
            }
        }
        return transferFlights;
    }
}
