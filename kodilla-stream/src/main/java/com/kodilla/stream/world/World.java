package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    public List<Continent> continents = new ArrayList<>();

    public void addContinent(Continent continent){
        continents.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal totalSand = continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        System.out.println("People quantity equals: " + totalSand);
        return totalSand;
    }
}
