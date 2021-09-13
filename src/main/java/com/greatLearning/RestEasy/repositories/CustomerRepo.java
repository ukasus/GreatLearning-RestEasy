package com.greatLearning.RestEasy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatLearning.RestEasy.entities.Customer;

public interface CustomerRepo extends JpaRepository<Customer, String> {

}
