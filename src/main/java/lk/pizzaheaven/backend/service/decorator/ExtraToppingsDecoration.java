package lk.pizzaheaven.backend.service.decorator;

public class ExtraToppingsDecoration extends OrderDecoration {
    public ExtraToppingsDecoration(OrderDecoration decorator) {
        super(decorator.order); 
    }

    @Override
    public void enhance() {
        System.out.println("Adding extra toppings to order.");
        
    }
}