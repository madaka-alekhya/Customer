package com.example.Customer;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer_Information")

public class CustomerDetails {
    @Id
    private String customerId;
    private String customerName;
    private String customerAge;
    private String customerLocation;
    private String customerMobileNo;
    public CustomerDetails() {
    }
    public CustomerDetails(String customerId, String customerName, String customerAge, String customerLocation,
            String customerMobileNo) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.customerLocation = customerLocation;
        this.customerMobileNo = customerMobileNo;
    }
    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerAge() {
        return customerAge;
    }
    public void setCustomerAge(String customerAge) {
        this.customerAge = customerAge;
    }
    public String getCustomerLocation() {
        return customerLocation;
    }
    public void setCustomerLocation(String customerLocation) {
        this.customerLocation = customerLocation;
    }
    public String getCustomerMobileNo() {
        return customerMobileNo;
    }
    public void setCustomerMobileNo(String customerMobileNo) {
        this.customerMobileNo = customerMobileNo;
    }
}
