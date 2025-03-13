package org.example;

import java.util.ArrayList;
import java.util.List;

public class FourCheesePizzaBuilder implements PizzaBuilder {

    protected String size;
    protected String dough;
    protected List<String> topping = new ArrayList<>();
    private Pizza pizza;

    @Override
    public FourCheesePizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    @Override
    public FourCheesePizzaBuilder setDough(String dough) {
        this.dough = dough;
        return this;
    }

    @Override
    public FourCheesePizzaBuilder addTopping(String topping) {
        this.topping.add(topping);
        return this;
    }

    @Override
    public Pizza build() {
        if (!topping.contains("Mozzarella")) topping.add("Mozzarella");
        if (!topping.contains("Cheddar")) topping.add("Cheddar");
        if (!topping.contains("Azul")) topping.add("Azul");
        if (!topping.contains("Gorgonzola")) topping.add("Gorgonzola");

        pizza = new Pizza(size, dough, topping);
        return pizza;

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

