package com.greatLearning.RestEasy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatLearning.RestEasy.entities.OrderItem;

public interface OrderItemRepo extends JpaRepository<OrderItem, Integer> {

}
