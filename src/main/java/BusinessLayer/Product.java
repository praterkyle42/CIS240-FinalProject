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
public class Product {
    private int productID; 
    private int quantityOnHand; 
    private double price; 
    private String description; 
    
    public Product(int ID, String desc, int qtyOnHand, double price) {
        this.productID = ID; 
        this.description = desc; 
        this.quantityOnHand = qtyOnHand; 
        this.price = price; 
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    public void setQuantityOnHand(int quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" + "productID = " + productID + ", quantityOnHand = " + quantityOnHand + ", price = " + price + ", description = " + description + '}';
    }
    
}
