package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite{

    @Test
    void testPizzaNew(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("with sesame seed bum")
                .burgers(2)
                .sauce("BBQ")
                .ingredients("Onion")
                .ingredients("Pickles")
                .ingredients("lettuce")
                .ingredients("Cheddar")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredientsQuantity();
        //Then
        assertEquals(4, howManyIngredients);
    }
}
