package lk.pizzaheaven.backend.service;

import lk.pizzaheaven.backend.entity.PizzaEntity;

public interface PizzaService {
    // Pizza Customization
    PizzaEntity customizePizza(PizzaEntity pizza);
    void processPizzaCustomization(PizzaEntity pizza);
    PizzaEntity getPizzaById(Long id);
}
