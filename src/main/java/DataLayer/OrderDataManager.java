/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import BusinessLayer.Order;
import java.util.ArrayList;

/**
 *
 * @author Kyle Prater
 */
public class OrderDataManager {
    private ArrayList<Order> orders; 
    
    public OrderDataManager() {
        this.orders = new ArrayList<Order>();
    }
    
    public Order create(Order newOrder) {
        this.orders.add(newOrder); 
        return newOrder; 
    }
    
    public ArrayList<Order> getAll() {
        return this.orders;
    }
    public void listAll() { 
        for (Order order : orders) {
            
            System.out.println("Order Number: " + order.getOrderNumber());
            System.out.println("Customer ID: " + order.getCustomerID());
            System.out.println("Date of Order: " + order.getDate() + "\n");
        }
    }
    public void listByCustomerID(int CustomerID) {
        for (Order order : orders) {
            if (order.getCustomerID() == CustomerID) {
                System.out.println("Customer ID: " + order.getCustomerID());
                System.out.println("Order Number: " + order.getOrderNumber()); 
                System.out.println("Order Date: " + order.getDate() + "\n");
            }
        }
    }
    public ArrayList<Order> getByCustomerID(int customerID) {
        ArrayList<Order> output = new ArrayList<Order>();
        for (Order order : orders) {
            if (order.getCustomerID() == customerID) {
                output.add(order); 
            }
        }
        return output;
    }
    
}
