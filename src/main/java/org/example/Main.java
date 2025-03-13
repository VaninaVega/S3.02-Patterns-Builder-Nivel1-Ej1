package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MestrePizzer constructor = new MestrePizzer();

        Pizza FourCheesePizzaBuilder = constructor.makeFourCheesePizza(new FourCheesePizzaBuilder());
        Pizza VeganPizzaBuilder = constructor.makeVeganPizza(new VeganPizzaBuilder());

        System.out.println("Your pizza 4 cheese: " + FourCheesePizzaBuilder);
        System.out.println("********************************************************************");
        System.out.println("Your vegan pizza: " + VeganPizzaBuilder);


    }
}
