package lk.pizzaheaven.backend.service.strategy;

import lk.pizzaheaven.backend.entity.PaymentEntity;

public interface PaymentStrategy {
    void processPayment(PaymentEntity payment);
}
