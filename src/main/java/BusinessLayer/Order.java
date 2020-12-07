/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLayer;

import java.util.Date;

/**
 *
 * @author Kyle Prater
 */
public class Order {
    private int orderNumber; 
    private int customerID;
    private Date date; 
    
    public Order(int number, int customerID, Date transactionDate) {
        this.orderNumber = number; 
        this.customerID = customerID; 
        this.date = transactionDate; 
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Order{" + "orderNumber = " + orderNumber + ", customerID = " + customerID +  ", date = " + date + '}';
    }
    
}
