package com.greatLearning.RestEasy.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatLearning.RestEasy.entities.Dish;

public interface DishRepo extends JpaRepository<Dish, String> {
	
	

}
