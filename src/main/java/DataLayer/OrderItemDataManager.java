/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import BusinessLayer.OrderItem;
import java.util.ArrayList;

/**
 *
 * @author Kyle Prater
 */
public class OrderItemDataManager {
    private ArrayList<OrderItem> OrderItem; 
    
    public OrderItemDataManager() {
        this.OrderItem = new ArrayList<OrderItem>(); 
    }
    
    public OrderItem create(OrderItem newOrderItem) {
        this.OrderItem.add(newOrderItem); 
        return newOrderItem;
    }
    
    public ArrayList<OrderItem> getAll() {
        return this.OrderItem; 
    }
    
    public ArrayList<OrderItem> getByOrderNumber(int newOrderNumber) {
        ArrayList<OrderItem>output = new ArrayList<OrderItem>(); 
        for (OrderItem item : OrderItem) {
            if (item.getOrderNumber() == newOrderNumber) {
                output.add(item); 
            }
        }
        return output; 
    }
    public ArrayList<OrderItem> getByProductID (int newProductID) {
        ArrayList<OrderItem>output = new ArrayList<OrderItem>(); 
        for (OrderItem item : OrderItem) {
            if (item.getProductID() == newProductID) {
                output.add(item); 
            }
        }
        return output;
    }
    public int getNumberOfItems(int orderNumber) {
        int itemCount = 0; 
        for (OrderItem item : OrderItem) {
            if (item.getOrderNumber() == orderNumber) {
                itemCount++;
            }
        }
        return itemCount;
    }

    public void listByOrderNumber(int OrderNumber) {
        int count = 1;
        for (OrderItem item : OrderItem) {
            if (item.getOrderNumber() == OrderNumber) {
                System.out.println("item " + count + " of " + getNumberOfItems(OrderNumber));
                System.out.println("Order Number: " + item.getOrderNumber());
                System.out.println("Line Number: " + item.getLineNumber());
                System.out.println("ProductID: " + item.getProductID());
                System.out.println("Product Description: " + item.getProductDescription()); 
                System.out.println("Quantity: " + item.getQuantity()); 
                System.out.println("Price: " + item.getPrice() + "\n");
                count++;
            } 
        }
    }
}
