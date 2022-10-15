package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.taxiportal.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        // When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        // Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        // When
        String description = pizzaOrder.getDescription();
        // Then
        assertEquals("Pizza with tomato sauce and cheese", description);
    }

    @Test
    public void testPizzaWithExtraCheeseTomatoProsciuttoBlackOlivesGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new TomatoDecorator(pizzaOrder);
        pizzaOrder = new ProscuittoDecorator(pizzaOrder);
        pizzaOrder = new BlackOlivesDecorator(pizzaOrder);
        System.out.println(pizzaOrder.getCost());
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(32), theCost);
    }

    @Test
    public void testPizzaWithExtraCheeseTomatoProsciuttoSalamiBlackOlivesGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new TomatoDecorator(pizzaOrder);
        pizzaOrder = new ProscuittoDecorator(pizzaOrder);
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        pizzaOrder = new BlackOlivesDecorator(pizzaOrder);
        System.out.println(pizzaOrder.getDescription());
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sauce and cheese + extra cheese + tomato + prosciutto + salami + black olives", description);
    }
}
