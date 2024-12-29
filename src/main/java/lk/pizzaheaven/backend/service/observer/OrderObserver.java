package lk.pizzaheaven.backend.service.observer;

import lk.pizzaheaven.backend.entity.enums.OrderStatus;

public interface OrderObserver {
    void update(OrderStatus status);
}
