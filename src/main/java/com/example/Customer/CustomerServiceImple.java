package com.example.Customer;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImple implements CustomerService {
    CustomerRepo repo;

    public CustomerServiceImple(CustomerRepo repo) {
        this.repo = repo;
    }

    @Override
    public String createcustomerdetails(CustomerDetails det) {
        repo.save(det);
        return "Success";
    }

    @Override
    public String updatecustomerdetails(CustomerDetails det) {
        repo.save(det);
        return "Updated";
    }

    @Override
    public String deletecustomerdetails(String id) {
        repo.deleteById(id);
        return "Deleted";
    }

    @Override
    public CustomerDetails getdetails(String id) {
        return repo.findById(id).get();
    }

    @Override
    public List<CustomerDetails> getalldetails() {
        return repo.findAll();
    }

    

   
    
    
}
