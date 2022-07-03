package com.kodilla.good.patterns.flights;

public class Flight{
    private String departureCity;
    private String arrivalCity;

    public Flight(String departureCity, String arrivalCity){
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
    }

    public String getDepartureCity(){
        return departureCity;
    }

    public String getArrivalCity(){
        return arrivalCity;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (departureCity != null ? !departureCity.equals(flight.departureCity) : flight.departureCity != null)
            return false;
        return arrivalCity != null ? arrivalCity.equals(flight.arrivalCity) : flight.arrivalCity == null;
    }

    @Override
    public int hashCode(){
        int result = departureCity != null ? departureCity.hashCode() : 0;
        result = 31 * result + (arrivalCity != null ? arrivalCity.hashCode() : 0);
        return result;
    }

    @Override
    public String toString(){
        return "Flight: Departure city: " + departureCity + ", arrival city: " + arrivalCity;
    }
}
