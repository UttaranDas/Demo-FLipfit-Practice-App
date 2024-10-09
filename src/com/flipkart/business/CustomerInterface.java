package com.flipkart.business;

import com.flipkart.bean.Customer;

public interface CustomerInterface {
    public void createCustomer(String firstName, String lastName);
    public boolean updateCustomer(int customerID);
    public boolean deleteCustomer(int customerID);
    public void listCustomers();
}
