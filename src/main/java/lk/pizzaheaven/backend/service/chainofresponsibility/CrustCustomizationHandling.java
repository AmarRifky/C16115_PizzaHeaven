package lk.pizzaheaven.backend.service.chainofresponsibility;

import lk.pizzaheaven.backend.entity.PizzaEntity;

public class CrustCustomizationHandling extends OrderCustomizationHandling {
    @Override
    public void handleCustomization(PizzaEntity pizza) {
        System.out.println("Customizing crust: " + pizza.getCrustType());
        super.handleCustomization(pizza);
    }
}

