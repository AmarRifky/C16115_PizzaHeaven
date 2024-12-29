package lk.pizzaheaven.backend.service.command;

import lk.pizzaheaven.backend.entity.OrderEntity;

public class PlaceOrderCommand implements Command {
    private final OrderEntity order;

    public PlaceOrderCommand(OrderEntity order) {
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println("Placing order: " + order.getId());
    }
}
