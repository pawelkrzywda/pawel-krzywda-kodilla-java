package com.kodilla.good.patterns.flights;

public class TransferFlight{
    private Flight flight1;
    private Flight flight2;

    public TransferFlight(Flight flight1, Flight flight2) {
        this.flight1 = flight1;
        this.flight2 = flight2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TransferFlight that = (TransferFlight) o;

        if (flight1 != null ? !flight1.equals(that.flight1) : that.flight1 != null) return false;
        return flight2 != null ? flight2.equals(that.flight2) : that.flight2 == null;
    }

    @Override
    public int hashCode() {
        int result = flight1 != null ? flight1.hashCode() : 0;
        result = 31 * result + (flight2 != null ? flight2.hashCode() : 0);
        return result;
    }

    @Override
    public String toString(){
        return "First flight: Departure city: " + flight1.getDepartureCity() + ", arrival city: " + flight1.getArrivalCity() +
        "\nSecond flight: Departure city: " + flight2.getDepartureCity() + ", arrival city: " + flight2.getArrivalCity();
    }
}
