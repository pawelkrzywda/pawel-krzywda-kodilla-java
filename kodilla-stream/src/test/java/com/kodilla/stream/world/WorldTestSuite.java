package com.kodilla.stream.world;

import com.kodilla.stream.forum.ForumUser;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        //Create world, continents and countries
        World world = new World();

        Continent europe = new Continent("Europe");
        Country poland = new Country("Poland", new BigDecimal("37952658"));
        Country germany = new Country("Germany", new BigDecimal("83242158"));
        Country czechRepublic = new Country("Czech Republic", new BigDecimal("10785958"));
        Country spain = new Country("Spain", new BigDecimal("47354968"));
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(czechRepublic);
        europe.addCountry(spain);

        Continent northAmerica = new Continent("North America");
        Country usa = new Country("USA", new BigDecimal("329548658"));
        Country canada = new Country("Canada", new BigDecimal("38014968"));
        Country mexico = new Country("Mexico", new BigDecimal("128963587"));
        northAmerica.addCountry(usa);
        northAmerica.addCountry(canada);
        northAmerica.addCountry(mexico);

        Continent asia = new Continent("Asia");
        Country china = new Country("China", new BigDecimal("1402658745"));
        Country japan = new Country("Japan", new BigDecimal("125814968"));
        Country india = new Country("India", new BigDecimal("1380652948"));
        asia.addCountry(china);
        asia.addCountry(japan);
        asia.addCountry(india);

        world.addContinent(europe);
        world.addContinent(northAmerica);
        world.addContinent(asia);

        //When
        //Calculate world population
        BigDecimal population = world.getPeopleQuantity();

        //Then
        //compare result
        assertEquals(new BigDecimal("3584989616"), population);
    }
}
