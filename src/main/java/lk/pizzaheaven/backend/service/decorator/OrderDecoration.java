package lk.pizzaheaven.backend.service.decorator;

import lk.pizzaheaven.backend.entity.OrderEntity;

public abstract class OrderDecoration {
    protected OrderEntity order;

    public OrderDecoration(OrderEntity order) {
        this.order = order;
    }

    public abstract void enhance();
}
