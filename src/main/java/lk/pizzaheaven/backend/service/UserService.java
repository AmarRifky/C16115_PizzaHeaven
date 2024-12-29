package lk.pizzaheaven.backend.service;

import lk.pizzaheaven.backend.entity.Admin;
import lk.pizzaheaven.backend.entity.Customer;
import lk.pizzaheaven.backend.entity.UserEntity;

public interface UserService {
    // User Registration
    Customer registerCustomer(Customer customer);

    Admin registerAdmin(Admin admin);

    // User Login
    UserEntity login(UserEntity user);

    UserEntity getUserById(Long id);

}
