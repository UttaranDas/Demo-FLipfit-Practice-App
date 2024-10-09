package com.flipkart.business;

public class CustomerBusiness implements CustomerInterface{

    @Override
    public void createCustomer(String firstName, String lastName) {
        // TODO Auto-generated method stub
        System.out.println("<---Create the Customer here--->");
    }

    @Override
    public boolean updateCustomer(String firstName, String lastName) {
        // TODO Auto-generated method stub
        System.out.println("<------ Update Customer by id----------->");
        return true;
    }

    @Override
    public boolean deleteCustomer(String firstName, String lastName) {
        // TODO Auto-generated method stub
        System.out.println("<-- delete Customer by id-->");
        return true;
    }

    @Override
    public void listCustomers() {
        // TODO Auto-generated method stub
        System.out.println("list customer here -->");
    }
}
