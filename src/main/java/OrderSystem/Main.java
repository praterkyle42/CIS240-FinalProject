/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrderSystem;

import BusinessLayer.Customer;
import BusinessLayer.Order;
import BusinessLayer.OrderItem;
import BusinessLayer.Product;
import DataLayer.CustomerDataManager;
import DataLayer.OrderDataManager;
import DataLayer.OrderItemDataManager;
import DataLayer.ProductDataManager;


/**
 *
 * @author Kyle Prater
 */
import java.util.Date;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in); 
    String customerOneFirstName;
    String firstNameInput;
    String customerOneLastName; 
    String lastNameInput;
    String customerOnePhoneNumber;
    String phoneNumberInput;
    String customerTwoFirstName; 
    String firstNameInput2;
    String customerTwoLastName; 
    String lastNameInput2;
    String customerTwoPhoneNumber; 
    String phoneNumberInput2;
    String customerThreeFirstName; 
    String firstNameInput3;
    String customerThreeLastName; 
    String lastNameInput3; 
    String customerThreePhoneNumber; 
    String phoneNumberInput3;
    CustomerDataManager myCustomerDataManager = new CustomerDataManager(); 
    OrderDataManager myOrderDataManager = new OrderDataManager(); 
    
    // Create 3 customers. Get FirstName, LastName, and PhoneNumber from User
    System.out.println("Enter Your First Name: ");
    firstNameInput = keyboard.next();
    
    //Validate input is a string (not a number)
    while (isNumeric(firstNameInput) == true) {
        System.out.println("Invalid Input. Plase Enter Your First Name: ");
        firstNameInput = keyboard.next();
    }
    customerOneFirstName = firstNameInput;
    
    System.out.println("Enter Your Last Name: "); 
    lastNameInput = keyboard.next(); 
    while (isNumeric(lastNameInput) == true) {
        System.out.println("Invalid Input. Plase Enter Your Last Name: ");
        lastNameInput = keyboard.next();
    }
    customerOneLastName = lastNameInput;
    
    System.out.println("Enter your phone number with dashes" + "(" + "ex 800-777-777" + ")" + " :"); 
    phoneNumberInput = keyboard.next();
    
    //Validate phoneNumber is in the correct format
    while (phoneNumberInput.charAt(3) != '-' || phoneNumberInput.charAt(7) != '-' || containsLetter(phoneNumberInput) == true) {
        System.out.println("Please enter your phone number in the format 777-777-7777");
        phoneNumberInput = keyboard.next();
    }
   customerOnePhoneNumber = phoneNumberInput;
    
   System.out.println("Enter Your First Name: ");
   firstNameInput2 = keyboard.next(); 
   while (isNumeric(firstNameInput2) == true) {
        System.out.println("Invalid Input. Plase Enter Your First Name: ");
        firstNameInput2 = keyboard.next();
    }
    customerTwoFirstName = firstNameInput2;
    
   System.out.println("Enter Your Last Name: "); 
   lastNameInput2 = keyboard.next(); 
   while (isNumeric(lastNameInput2) == true) {
        System.out.println("Invalid Input. Plase Enter Your Last Name: ");
        lastNameInput2 = keyboard.next();
    }
   customerTwoLastName = lastNameInput2;
    
   System.out.println("Enter your phone number with dashes" + "(" + "ex 800-777-777" + ")" + " :");
   phoneNumberInput2 = keyboard.next();
   while (phoneNumberInput2.charAt(3) != '-' || phoneNumberInput2.charAt(7) != '-' || containsLetter(phoneNumberInput2) == true) {
        System.out.println("Invalid Input. Please enter your phone number in the format 777-777-7777");
        phoneNumberInput2 = keyboard.next();
    }
   customerTwoPhoneNumber = phoneNumberInput2; 
    
    System.out.println("Enter Your First Name: ");
    firstNameInput3 = keyboard.next(); 
    while (isNumeric(firstNameInput3) == true) {
        System.out.println("Invalid Input. Plase Enter Your First Name: ");
        firstNameInput3 = keyboard.next();
    }
    customerThreeFirstName = firstNameInput3;
    
    System.out.println("Enter Your Last Name: "); 
    lastNameInput3 = keyboard.next(); 
     while (isNumeric(lastNameInput3) == true) {
        System.out.println("Invalid Input. Plase Enter Your Last Name: ");
        lastNameInput3 = keyboard.next();
    }
    customerThreeLastName = lastNameInput2;
    
    System.out.println("Enter your phone number with dashes" + "(" + "ex 800-777-777" + ")" + " :");
    phoneNumberInput3 = keyboard.next();
    while (phoneNumberInput3.charAt(3) != '-' || phoneNumberInput2.charAt(7) != '-' || containsLetter(phoneNumberInput3) == true) {
        System.out.println("Invalid Input. Please enter your phone number in the format 777-777-7777");
        phoneNumberInput3 = keyboard.next();
    }
    customerThreePhoneNumber = phoneNumberInput2; 
    Customer customer1 = new Customer(1001, customerOneFirstName, customerOneLastName, customerOnePhoneNumber);
    Customer customer2 = new Customer(1002, customerTwoFirstName, customerTwoLastName, customerTwoPhoneNumber); 
    Customer customer3 = new Customer(1003, customerThreeFirstName, customerThreeLastName, customerThreePhoneNumber);
    myCustomerDataManager.create(customer1); 
    myCustomerDataManager.create(customer2); 
    myCustomerDataManager.create(customer3);
    
    ProductDataManager myProductDataManager = new ProductDataManager();
    Product product1 = new Product(111, "Bluetooth Headphones", 15, 59.99);
    myProductDataManager.create(product1);  
    Product product2 = new Product(200, "Iphone", 5, 699.99);
    myProductDataManager.create(product2); 
    Product product3 = new Product(201, "Iphone Charger", 15, 5.99); 
    myProductDataManager.create(product3);
    Product product4 = new Product(203, "Iphone Case", 15, 9.99); 
    myProductDataManager.create(product4);
    Product product5 = new Product(301, "Playstation 5", 1, 999.99);
    myProductDataManager.create(product5);
    Product product6 = new Product(304, "T-Shirt- Large",20, 9.99 ); 
    myProductDataManager.create(product6);
    Product product7 = new Product(401, "Android Charger", 16, 5.99); 
    myProductDataManager.create(product7);
    Product product8 = new Product(415, "Portable Charger", 7, 19.99);
    myProductDataManager.create(product8);
    
    Order order1 = new Order(13579, 1001, new Date()); 
    Order order2 = new Order(2468, 1001, new Date()); 
    Order order3 = new Order(1234, 1002, new Date());
    Order order4 = new Order(5678, 1002, new Date());
    Order order5 = new Order(3691, 1003, new Date());
    
    myOrderDataManager.create(order1);
    myOrderDataManager.create(order2); 
    myOrderDataManager.create(order3); 
    myOrderDataManager.create(order4);
    myOrderDataManager.create(order5);
   
    OrderItemDataManager myOrderItemDataManager = new OrderItemDataManager(); 
    
    OrderItem order1_item1 = new OrderItem(order1.getOrderNumber(), 1, product1.getProductID(), product1.getDescription(), 1, product1.getPrice());
    myOrderItemDataManager.create(order1_item1); 
    OrderItem order1_item2 = new OrderItem(order1.getOrderNumber(),2, product2.getProductID(), product2.getDescription(), 1, product2.getPrice());
    myOrderItemDataManager.create(order1_item2); 
    OrderItem order1_item3 = new OrderItem(order1.getOrderNumber(), 2, product3.getProductID(), product3.getDescription(), 1, product3.getPrice());
    myOrderItemDataManager.create(order1_item3);   
    
    OrderItem order2_item1 = new OrderItem(order2.getOrderNumber(),2, product4.getProductID(), product4.getDescription(), 1, product4.getPrice());
    myOrderItemDataManager.create(order2_item1); 
    OrderItem order2_item2 = new OrderItem(order2.getOrderNumber(),3, product5.getProductID(), product5.getDescription(), 1, product5.getPrice()); 
    myOrderItemDataManager.create(order2_item2); 
    
    OrderItem order3_item1 = new OrderItem(order3.getOrderNumber(),3, product6.getProductID(), product6.getDescription(), 1, product6.getPrice()); 
    myOrderItemDataManager.create(order3_item1); 
    OrderItem order3_item2 = new OrderItem(order3.getOrderNumber(),4, product7.getProductID(), product7.getDescription(), 1, product7.getPrice()); 
    myOrderItemDataManager.create(order3_item2);
    
    OrderItem order4_item1 = new OrderItem(order4.getOrderNumber(),4, product8.getProductID(), product8.getDescription(), 1, product8.getPrice());
    myOrderItemDataManager.create(order4_item1);
   
    
    OrderItem order5_item1 = new OrderItem(order5.getOrderNumber(), 1, product1.getProductID(), product1.getDescription(), 1, product1.getPrice()); 
    myOrderItemDataManager.create(order5_item1);
    OrderItem order5_item2 = new OrderItem(order5.getOrderNumber(), 3, product6.getProductID(), product6.getDescription(), 1, product1.getPrice());
    myOrderItemDataManager.create(order5_item2);
    
    System.out.println("\nCurrent Customers: ");
    myCustomerDataManager.listAll();
    System.out.println("\nOrders made on " + new Date());
    myOrderDataManager.listAll(); 
    
    System.out.println("\nCurrent Products: ");
    myProductDataManager.listAll();
    
    System.out.println("\nOrders for " + customer1.getFirstName());
    myOrderDataManager.listByCustomerID(customer1.getCustomerID()); 
    System.out.println("Items in these orders: "); 
    System.out.println("Order " + order1.getOrderNumber());
    myOrderItemDataManager.listByOrderNumber(order1.getOrderNumber()); 
    System.out.println("Order " + order2.getOrderNumber());
    myOrderItemDataManager.listByOrderNumber(order2.getOrderNumber());
    
    System.out.println("\nOrders for " + customer2.getFirstName()); 
    myOrderDataManager.listByCustomerID(customer2.getCustomerID());  
    System.out.println("Item's in these orders: ");
    System.out.println("Order " + order3.getOrderNumber());
    myOrderItemDataManager.listByOrderNumber(order3.getOrderNumber());
    System.out.println("Order " + order4.getOrderNumber());
    myOrderItemDataManager.listByOrderNumber(order4.getOrderNumber()); 
    
    System.out.println("\nOrders for " + customer3.getFirstName()); 
    myOrderDataManager.listByCustomerID(customer3.getCustomerID());  
    System.out.println("Item's in these orders: ");
    System.out.println("Order " + order5.getOrderNumber());
    myOrderItemDataManager.listByOrderNumber(order5.getOrderNumber());
    }
   
    //Name Input Validation
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str); 
            return true; 
        }    
        catch (NumberFormatException ex) {
                return false;
                }    
        }
    //Input Validation make sure phone number does not contain a letter
    public static boolean containsLetter(String inputString) {
        boolean containsLetter = false; 
        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isLetter(inputString.charAt(i)) == true) {
                containsLetter = true;
            } 
        }
        return containsLetter;
    }
}
