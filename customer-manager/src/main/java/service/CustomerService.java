package service;

import model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    Customer save(Customer customer);

    Customer findById(long id);

    void create(Customer customer);

    void remove(long id);
}
