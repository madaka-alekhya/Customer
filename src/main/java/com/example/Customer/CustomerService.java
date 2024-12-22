package com.example.Customer;

import java.util.List;

public interface  CustomerService {
    public String createcustomerdetails(CustomerDetails det);
    public String updatecustomerdetails(CustomerDetails det);
    public String deletecustomerdetails(String id);
    public CustomerDetails getdetails(String id);
    public List<CustomerDetails> getalldetails();

}
