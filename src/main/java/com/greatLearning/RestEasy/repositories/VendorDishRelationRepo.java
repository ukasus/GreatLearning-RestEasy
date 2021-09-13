package com.greatLearning.RestEasy.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.greatLearning.RestEasy.entities.Vendor;
import com.greatLearning.RestEasy.entities.VendorDishRelation;

public interface VendorDishRelationRepo extends JpaRepository<VendorDishRelation, Integer> {

	
	

	@Query(value = "Select * from vendor_dish_relation where dish_name=?1",nativeQuery = true)
	List<VendorDishRelation> findByDish(String dishName);

	@Query(value = "Select * from vendor_dish_relation order by price ",nativeQuery = true)
	List<VendorDishRelation> findDishOrderByPriceAsc();

	@Query(value = "Select * from vendor_dish_relation order by price desc",nativeQuery = true)
	List<VendorDishRelation> findDishOrderByPriceDesc();



}
