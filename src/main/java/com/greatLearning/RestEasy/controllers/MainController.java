package com.greatLearning.RestEasy.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.greatLearning.RestEasy.dto.QuantityAddRequest;
import com.greatLearning.RestEasy.entities.Dish;
import com.greatLearning.RestEasy.entities.Order;
import com.greatLearning.RestEasy.entities.OrderItem;
import com.greatLearning.RestEasy.entities.Vendor;
import com.greatLearning.RestEasy.entities.VendorDishRelation;
import com.greatLearning.RestEasy.services.ControllerService;

@RestController
public class MainController {
	@Autowired
	ControllerService service;
	
	@GetMapping(path = "/vendors")
	public List<Vendor> getVendors()
	{
		return service.getVendors();
	}
	
	@GetMapping(path = "/vendors/{dishName}")
	public List<VendorDishRelation> getVendorsByDish(@PathVariable String dishName)
	{
		return service.getVendorsByDish(dishName);
	}
	
	@GetMapping(path = "/dishes")
	public List<Dish> getDishes()
	{
		return service.getDishes();
	}
	
	@GetMapping(path = "/dishes/sort")
	public List<VendorDishRelation> getDishes(@RequestParam(name="order") String sortByPrice)
	{
		return service.getDishes(sortByPrice);
	}
	
	@PostMapping(path = "/addQuantity")
	public OrderItem addQuantityToDish(@RequestBody QuantityAddRequest request)
	{
		return service.addQuantityToDish(request);
	}
	
	@PostMapping(path="/addOrders")
	public String addOrders(@RequestBody List<Order> orders)
	{
		return service.addOrders(orders);
	}
	
	

}
