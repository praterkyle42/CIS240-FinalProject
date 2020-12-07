/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;



import BusinessLayer.Product;
import java.util.ArrayList;

/**
 *
 * @author Kyle Prater
 */
public class ProductDataManager {
    private ArrayList<Product> Products;
    
    public ProductDataManager() {
        this.Products = new ArrayList<Product>(); 
    }
    
    public Product create(Product newProduct) {
        this.Products.add(newProduct); 
        return newProduct;
    }
    
    public ArrayList<Product> getAll() {
        return this.Products;
    }
    
     public void listAll() {
        for (Product p : Products) {
            System.out.println("Product ID: " + p.getProductID());
            System.out.println("Product Description: " + p.getDescription());
            System.out.println("Quantity on Hand: " + p.getQuantityOnHand()); 
            System.out.println("Price: " + p.getPrice() + "\n"); 
        }
    }
    public ArrayList<Product> getByProductID (int productID) {
        ArrayList<Product> output = new ArrayList<Product>(); 
        for (Product p : Products) {
            if (p.getProductID() == productID) {
                output.add(p); 
            }
        }
        return output;
    }
}
