package lk.pizzaheaven.backend.service.chainofresponsibility;

import lk.pizzaheaven.backend.entity.PizzaEntity;

public abstract class OrderCustomizationHandling {
    protected OrderCustomizationHandling nextHandler;

    public void setNextHandler(OrderCustomizationHandling nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleCustomization(PizzaEntity pizza) {
        if (nextHandler != null) {
            nextHandler.handleCustomization(pizza);
        }
    }
}
