package lk.pizzaheaven.backend.service.state;

import lk.pizzaheaven.backend.entity.OrderEntity;

public interface OrderState {
    void next(OrderEntity order);
    void previous(OrderEntity order);
    void printStatus();
}
