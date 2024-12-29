package lk.pizzaheaven.backend.service;

import java.util.ArrayList;
import java.util.List;

import lk.pizzaheaven.backend.entity.Admin;
import lk.pizzaheaven.backend.entity.Customer;
import lk.pizzaheaven.backend.entity.UserEntity;
import lk.pizzaheaven.backend.entity.enums.UserRole;

public class UserServiceImpl implements UserService{

    private final List<UserEntity> users = new ArrayList<>();

    @Override
    public Customer registerCustomer(Customer customer) {
        customer.setRole(UserRole.CUSTOMER);
        users.add(customer);
        return customer;
    }

    @Override
    public Admin registerAdmin(Admin admin) {
        admin.setRole(UserRole.ADMIN);
        users.add(admin);
        return admin;
    }

    @Override
    public UserEntity login(UserEntity user) {
        return users.stream()
                .filter(u -> u.getEmail().equals(user.getEmail()) && u.getPassword().equals(user.getPassword()))
                .findFirst()
                .orElse(null);
    }

    @Override
    public UserEntity getUserById(Long id) {
        return users.stream()
                .filter(a -> a.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
    
}
