package org.example;

public class MestrePizzer {

    public Pizza makeFourCheesePizza(String size, String dough, String topping) {
        return new FourCheesePizzaBuilder()
                .setSize(size)
                .setDough(dough)
                .addTopping(topping)
                .build();
    }

    public Pizza makeVeganPizza(String size, String dough, String topping) {
        return new VeganPizzaBuilder()
                .setSize(size)
                .setDough(dough)
                .addTopping(topping)
                .build();
    }

}

