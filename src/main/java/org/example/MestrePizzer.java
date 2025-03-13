package org.example;

public class MestrePizzer {

    public Pizza makeFourCheesePizza(PizzaBuilder pizzaBuilder) {
        return pizzaBuilder
                .setSize("Medium")
                .setDough("Thin")
                .addTopping("Mozzarella")
                .addTopping("Blue cheese")
                .addTopping("Cheddar")
                .addTopping("Gorgonzola")
                .build();
    }

    public Pizza makeVeganPizza(PizzaBuilder pizzaBuilder) {
        return new VeganPizzaBuilder()
                .setSize("Small")
                .setDough("Thin")
                .addTopping("Oli")
                .addTopping("Aubergine")
                .build();
    }

}

