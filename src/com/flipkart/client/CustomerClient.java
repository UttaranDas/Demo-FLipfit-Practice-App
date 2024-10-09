package com.flipkart.client;

import com.flipkart.business.CustomerBusiness;
import com.flipkart.business.CustomerInterface;

public class CustomerClient {

    public static void main(String[] args) {
        CustomerInterface business=new CustomerBusiness();
        business.createCustomer("Uttaran", "Das");
        System.out.println("delete Customer-->" +business.deleteCustomer(101));
        System.out.println("update Customer-->" +business.updateCustomer(101));
        business.listCustomers();
    }
}