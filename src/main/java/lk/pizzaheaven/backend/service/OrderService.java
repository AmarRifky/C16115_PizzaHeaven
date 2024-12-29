package lk.pizzaheaven.backend.service;

import java.util.List;

import lk.pizzaheaven.backend.entity.Customer;
import lk.pizzaheaven.backend.entity.FavouritePizzaEntity;
import lk.pizzaheaven.backend.entity.OrderEntity;
import lk.pizzaheaven.backend.entity.PaymentEntity;
import lk.pizzaheaven.backend.entity.PizzaEntity;
import lk.pizzaheaven.backend.entity.PromotionEntity;
import lk.pizzaheaven.backend.entity.RateEntity;
import lk.pizzaheaven.backend.entity.enums.OrderStatus;
import lk.pizzaheaven.backend.service.observer.OrderObserver;
import lk.pizzaheaven.backend.service.strategy.PaymentStrategy;

public interface OrderService {
 
     // Ordering Process
     OrderEntity createOrder(OrderEntity order);
     void updateOrderStatus(OrderEntity orderEntity);
     OrderEntity reviewOrder(OrderEntity order);
     OrderEntity getOrderById(Long id);
     List<OrderEntity> getAllOrders();
 
     // User Profiles and Favorites
     FavouritePizzaEntity saveFavouritePizza(FavouritePizzaEntity favouritePizzaEntity);
     List<PizzaEntity> getFavoritePizzasByUser(Long id);
     FavouritePizzaEntity getFavouritePizzaById(Long id);
 
     // Real-Time Order Tracking
     OrderStatus trackOrderStatus(OrderEntity order);
     void addOrderObserver(OrderObserver observer);
     void removeOrderObserver(OrderObserver observer);
 
     // Payment and Loyalty Program
     void processPayment(PaymentEntity payment, PaymentStrategy strategy);
     void addLoyaltyPoints(Customer customer, double amount);
     int getLoyaltyPoints(Customer customer);
 
     // Seasonal Specials and Promotions
     PromotionEntity addPromotion(PromotionEntity promotion);
     List<PromotionEntity> getActivePromotions();
 
     // Feedback and Ratings
     void provideFeedback(RateEntity rate);
     List<RateEntity> getFeedbackForOrder(OrderEntity order);
     List<RateEntity> getAllFeedbacks();
 
     // Enhance Order
     void enhanceOrder(OrderEntity order, boolean addToppings, boolean specialPackaging);
}
