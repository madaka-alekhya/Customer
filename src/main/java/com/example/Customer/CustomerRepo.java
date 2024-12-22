package com.example.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends  JpaRepository<CustomerDetails,String>{
    
}