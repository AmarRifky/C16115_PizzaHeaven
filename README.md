# PizzaHeaven

A Food Ordering System for a Pizza Shop developed for the KU BSc Program - Programming Patterns & Algorithms Module Coursework 02

## Project Details

**Name:** Amar Rifky  
**KU ID:** K2430652  
**Module Code:** C16115  
**Module Name:** Programming Patterns & Algorithms  

## Overview
PizzaHeaven is a Java-based food ordering application designed to streamline the pizza ordering process. This application demonstrates the effective use of various programming patterns and algorithms to create a modular, efficient, and scalable system.

## Key Features
- **Pizza Customization:** Users can customize pizzas by choosing crusts, toppings, and packaging options.
- **Order Management:** Real-time order tracking with updates using the State and Observer patterns.
- **Payment Processing:** Multiple payment options (credit card, digital wallet) implemented using the Strategy pattern.
- **Dynamic Order Enhancements:** Add extra toppings or special packaging through the Decorator pattern.
- **Feedback System:** Users can provide feedback on their orders.

## Design Patterns Used
- **Builder Pattern:** Constructs complex pizza orders in a step-by-step manner.
- **Observer Pattern:** Notifies users of order status changes.
- **Strategy Pattern:** Handles different payment methods dynamically.
- **Chain of Responsibility Pattern:** Customizes orders by handling crusts and toppings separately.
- **State Pattern:** Manages order states such as received, preparing, and ready for pickup.
- **Decorator Pattern:** Adds dynamic enhancements like extra toppings or special packaging.
- **Command Pattern:** Processes user actions like placing orders and providing feedback.

## Algorithm Workflow
1. **Order Creation:** The Builder pattern constructs a new pizza order with the selected attributes.
2. **Customization:** The Chain of Responsibility pattern customizes the pizza (crust, toppings).
3. **Order Tracking:** The State pattern updates the order status in real-time.
4. **Notification:** The Observer pattern notifies users of status changes.
5. **Payment Processing:** The Strategy pattern handles different payment methods.
6. **Enhancements:** The Decorator pattern applies additional order customizations.

## How to Run the Application
1. Clone the repository to your local machine:
   ```bash
   git clone https://github.com/username/PizzaHeaven.git
   ```
2. Navigate to the project directory:
   ```bash
   cd PizzaHeaven
   ```
3. Build the project using your preferred IDE (e.g., IntelliJ IDEA, Eclipse) or a build tool like Maven.
4. Run the main class to start the application.



