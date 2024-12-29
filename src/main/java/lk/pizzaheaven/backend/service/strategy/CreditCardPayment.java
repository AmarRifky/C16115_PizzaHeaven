package lk.pizzaheaven.backend.service.strategy;

import lk.pizzaheaven.backend.entity.PaymentEntity;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment(PaymentEntity payment) {
        System.out.println("Processing credit card payment of Rs. " + payment.getPrice());
    }
}
