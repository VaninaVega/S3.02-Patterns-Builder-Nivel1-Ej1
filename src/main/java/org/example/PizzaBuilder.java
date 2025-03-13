package org.example;

import java.util.List;

public interface PizzaBuilder {

    PizzaBuilder setSize(String size);

    PizzaBuilder setDough(String dough);

    PizzaBuilder addTopping(String topping);

    Pizza build();

    String getSize();

    String getDough();

    List<String> getToppings();

}
