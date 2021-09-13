package com.greatLearning.RestEasy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatLearning.RestEasy.entities.Order;

public interface OrderRepo extends JpaRepository<Order, Integer> {

}
