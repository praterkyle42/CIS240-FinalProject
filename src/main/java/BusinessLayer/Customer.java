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
public class Customer {
    private int customerID; 
    private String firstName; 
    private String lastName; 
    private String phoneNumber; 
    
    public Customer(int id, String fName, String lName, String phone){
        //input validation for phone 
        this.phoneNumber = phone; 
        this.customerID = id; 
        this.firstName = fName; 
        this.lastName = lName; 
        this.phoneNumber = phone; 
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "(customerID: " + customerID + ", firstName: " + firstName + ", lastName: " + lastName + ", phoneNumber: " + phoneNumber + ")";
    }
    
}
