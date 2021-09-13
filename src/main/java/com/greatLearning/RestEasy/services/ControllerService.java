package com.greatLearning.RestEasy.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.greatLearning.RestEasy.dto.QuantityAddRequest;
import com.greatLearning.RestEasy.entities.Dish;
import com.greatLearning.RestEasy.entities.Order;
import com.greatLearning.RestEasy.entities.OrderItem;
import com.greatLearning.RestEasy.entities.Vendor;
import com.greatLearning.RestEasy.entities.VendorDishRelation;

@Service
public interface ControllerService {
	
	 List<Vendor> getVendors();
	
	
	
	 List<VendorDishRelation> getVendorsByDish(String dishName);
	
	
	
	 List<Dish> getDishes();
	
	 List<VendorDishRelation> getDishes(String sortByPrice);

	 OrderItem addQuantityToDish(QuantityAddRequest request);
	
	 String addOrders(List<Order> orders);
	

}
