package lk.pizzaheaven.backend.service.decorator;

public class SpecialPackagingDecoration extends OrderDecoration {
    public SpecialPackagingDecoration(OrderDecoration decorator) {
        super(decorator.order); // Pass the original order object
    }

    @Override
    public void enhance() {
        System.out.println("Adding special packaging to order.");
        // Call the next enhancement in the chain
    }
}
