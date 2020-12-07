/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import BusinessLayer.Customer;
import java.util.ArrayList;

/**
 *
 * @author Kyle Prater
 */
public class CustomerDataManager {
    private ArrayList<Customer> customer;
    
    public CustomerDataManager() {
        this.customer = new ArrayList<Customer>();
    }
        
    public Customer create(Customer newCustomer) {
        this.customer.add(newCustomer); 
        return newCustomer; 
    }
    
    public ArrayList<Customer> getAll() {
       return this.customer;
    }
    
    public ArrayList<Customer> getByCustomerID(int customerID) {
        ArrayList<Customer> output = new ArrayList<Customer>(); 
        for(Customer Customer : this.customer) {
            if(Customer.getCustomerID() == customerID) {
                output.add(Customer); 
            }
        }
        return output; 
    }
    public void listAll() {
        for (Customer Customer : this.customer) {
            System.out.println("Customer Name: " + Customer.getFirstName() + " " + Customer.getLastName()); 
            System.out.println("Customer ID: " + Customer.getCustomerID()); 
            System.out.println("Phone Number: " + Customer.getPhoneNumber() + "\n");
        }
    }
}
