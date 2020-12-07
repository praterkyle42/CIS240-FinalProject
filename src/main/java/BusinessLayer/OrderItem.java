/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLayer;

/**
 *
 * @author Kyle Prater
 */
public class OrderItem {
    private int orderNumber;
    private int lineNumber; 
    private int productID; 
    private int quantity; 
    private double price;
    private String productDescription; 
    
    
    public OrderItem(int orderNum, int lineNum, int prodID, String desc, int qty, double price) {
        this.orderNumber = orderNum; 
        this.lineNumber = lineNum; 
        this.productID = prodID; 
        this.quantity = qty; 
        this.price = price; 
        this.productDescription = desc; 
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    @Override
    public String toString() {
        return "OrderItem{" + "orderNumber = " + orderNumber + ", lineNumber = " + lineNumber + ", productID = " + productID + ", quantity = " + quantity + ", price = " + price + ", productDescription = " + productDescription + '}';
    }
    
    
    
}
