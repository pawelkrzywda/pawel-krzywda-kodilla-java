package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlightSearch{

    public static void searchFlights(FlightsDB flightsDB){
        String action;
        String departureCity;
        String arrivalCity;
        System.out.println("Welcome to our private flight service.\nPlease choose: " +
                "\n1 - find departures" +
                "\n2 - find arrivals" +
                "\n3 - find transfer flights" +
                "\nx - end program:");
        Scanner scan = new Scanner(System.in);
        action = scan.nextLine();

        if(action.equals("x")){
            return;
        }else if(action.equals("1")){
            List<Flight> flightsList;
            System.out.println("Please type city of departure:");
            departureCity = scan.nextLine();
            flightsList = flightsDB.findDepartures(departureCity);
            if(flightsList.size()>0){
                System.out.println("Flights found successfully:");
                System.out.println(flightsList.toString());
            }else{
                System.out.println("We couldn't find possible flights from city: " + departureCity);
            }
        }else if(action.equals("2")){
            List<Flight> flightsList;
            System.out.println("Please type city of arrival:");
            arrivalCity = scan.nextLine();
            flightsList = flightsDB.findArrivals(arrivalCity);
            if(flightsList.size()>0){
                System.out.println("Flights found successfully:");
                System.out.println(flightsList.toString());
            }else{
                System.out.println("We couldn't find possible flights to city: " + arrivalCity);
            }
        }else if(action.equals("3")){
            List<TransferFlight> transferFlightsList;
            System.out.println("Please type city of departure:");
            departureCity = scan.nextLine();
            System.out.println("Please type city of arrival:");
            arrivalCity = scan.nextLine();
            transferFlightsList = flightsDB.findTransferFlights(departureCity, arrivalCity);
            if(transferFlightsList.size()>0){
                System.out.println("Flights found successfully:");
                System.out.println(transferFlightsList.toString());
            }else{
                System.out.println("We couldn't find possible transfer flights from city: " + departureCity +
                        " to city: " + arrivalCity);
            }
        }
    }
}
