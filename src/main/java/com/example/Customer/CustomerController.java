package com.example.Customer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/customerinformation")
public class CustomerController {

    CustomerService service;
    public CustomerController(CustomerService service) {
        this.service=service;
    }

    @GetMapping("{id}")
    public CustomerDetails getdetails(@PathVariable String id) {
        return service.getdetails(id);
    }

    @PostMapping
    public String createcustomerdetails(@RequestBody CustomerDetails det){
        service.createcustomerdetails(det);
        return "Created Successfully.";
    }

    @PutMapping
    public String updatecustomerdetails(@RequestBody CustomerDetails det) {
        service.updatecustomerdetails(det);
        return "Updated Successfully.";
    }

    @DeleteMapping("{id}")
    public String deletecustomerdetails(@PathVariable("id") String id){
        service.deletecustomerdetails(id);
        return "Deleted Successfully.";
    }

    @GetMapping
    public List<CustomerDetails> getalldetails(){
        return service.getalldetails();
    }
    
    
}
