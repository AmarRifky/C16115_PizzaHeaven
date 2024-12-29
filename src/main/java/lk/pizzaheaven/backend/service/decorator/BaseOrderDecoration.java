package lk.pizzaheaven.backend.service.decorator;

import lk.pizzaheaven.backend.entity.OrderEntity;

public class BaseOrderDecoration extends OrderDecoration {
    public BaseOrderDecoration(OrderEntity order) {
        super(order);
    }

    @Override
    public void enhance() {
        System.out.println("Base order, no additional enhancements.");
    }
}
