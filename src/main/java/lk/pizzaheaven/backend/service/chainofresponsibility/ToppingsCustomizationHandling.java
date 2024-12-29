package lk.pizzaheaven.backend.service.chainofresponsibility;

import lk.pizzaheaven.backend.entity.PizzaEntity;

public class ToppingsCustomizationHandling extends OrderCustomizationHandling {
    @Override
    public void handleCustomization(PizzaEntity pizza) {
        System.out.println("Customizing toppings: " + pizza.getToppingsType());
        super.handleCustomization(pizza);
    }
}