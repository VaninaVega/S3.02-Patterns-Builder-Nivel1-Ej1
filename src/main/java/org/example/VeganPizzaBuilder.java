package org.example;

import java.util.ArrayList;
import java.util.List;

public class VeganPizzaBuilder implements PizzaBuilder {

    protected String size;
    protected String dough;
    protected List<String> topping = new ArrayList<>();
    private Pizza pizza;

    @Override
    public VeganPizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    @Override
    public VeganPizzaBuilder setDough(String dough) {
        this.dough = dough;
        return this;
    }

    @Override
    public VeganPizzaBuilder addTopping(String topping) {
        this.topping.add(topping);
        return this;
    }

    @Override
    public Pizza build() {

        if (!topping.contains("Tomato")) topping.add("Tomato");
        if (!topping.contains("Oli")) topping.add("Oli");
        return new Pizza(size, dough, topping);

    }

    @Override
    public String getSize() {
        return this.size;
    }

    @Override
    public String getDough() {
        return this.dough;
    }

    @Override
    public List<String> getToppings() {
        return this.topping;
    }
}
