package com.oliiarchyk.designpatterns.decorator;

import org.junit.jupiter.api.Test;

class PizzaIngredientTest {

    @Test
    void decoratorTest() {
        var pizza = new ThickCrustPizza();
        System.out.println(pizza.getCost());
        System.out.println(pizza.getDescription());

        var pepperoni = new Pepperoni(pizza);
        System.out.println(pepperoni.getCost());
        System.out.println(pepperoni.getDescription());


        var doublePepperoni = new Pepperoni(pepperoni);
        System.out.println(doublePepperoni.getCost());
        System.out.println(doublePepperoni.getDescription());


    }

}