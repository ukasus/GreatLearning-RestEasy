package com.greatLearning.RestEasy.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatLearning.RestEasy.dto.QuantityAddRequest;
import com.greatLearning.RestEasy.entities.Dish;
import com.greatLearning.RestEasy.entities.Order;
import com.greatLearning.RestEasy.entities.OrderItem;
import com.greatLearning.RestEasy.entities.Vendor;
import com.greatLearning.RestEasy.entities.VendorDishRelation;
import com.greatLearning.RestEasy.repositories.DishRepo;
import com.greatLearning.RestEasy.repositories.OrderItemRepo;
import com.greatLearning.RestEasy.repositories.OrderRepo;
import com.greatLearning.RestEasy.repositories.VendorDishRelationRepo;
import com.greatLearning.RestEasy.repositories.VendorRepo;

@Service
public class ControllerServiceImplementation implements ControllerService {
	
	@Autowired
	OrderRepo orderRepo;
	@Autowired
	OrderItemRepo orderItemRepo;
	@Autowired
	DishRepo dishRepo;
	@Autowired
	VendorRepo vendorRepo;
	@Autowired
	VendorDishRelationRepo vendorDishRelationRepo;
	
	

	@Override
	public List<Vendor> getVendors() {
		// TODO Auto-generated method stub
		List<Vendor> vendors;
		try {
			vendors=vendorRepo.findAll();
		}
		catch (Exception e) {
			e.printStackTrace();
			vendors=new ArrayList<>();
			
		}
		return vendors;
	}

	@Override
	public List<VendorDishRelation> getVendorsByDish(String dishName) {
		// TODO Auto-generated method stub
		List<VendorDishRelation> vendors;
		try
		{
			vendors=vendorDishRelationRepo.findByDish(dishName);
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
			vendors=new ArrayList<>();
		}
		
		return vendors;
	}

	@Override
	public List<Dish> getDishes() {
		// TODO Auto-generated method stub
		List<Dish> dishes;
		try {
			dishes=dishRepo.findAll();
		} catch (Exception e) {
			// TODO: handle exception
			dishes=new ArrayList<>();
			e.printStackTrace();
		}
		return dishes;
	}

	@Override
	public List<VendorDishRelation> getDishes(String sortByPrice) {
		// TODO Auto-generated method stub
		List<VendorDishRelation> dishes;
		try {
			if(sortByPrice.equals("asc"))
			{
				dishes=vendorDishRelationRepo.findDishOrderByPriceAsc();
			}
			else 
			{
				dishes=vendorDishRelationRepo.findDishOrderByPriceDesc();
			}
		} catch (Exception e) {
			// TODO: handle exception
			dishes=new ArrayList<>();
			e.printStackTrace();
		}
		return dishes;
	}

	@Override
	public OrderItem addQuantityToDish(QuantityAddRequest request) {
		// TODO Auto-generated method stub
		try {
			OrderItem order=orderItemRepo.findById(request.getOrderId()).get();
			order.setQuantity(order.getQuantity()+request.getQuantityToAdd());
			order.setTotalPrice(order.getTotalPrice()+(order.getUnitPrice()*request.getQuantityToAdd()));
			orderItemRepo.save(order);
			return order;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public String addOrders(List<Order> orders) {
		// TODO Auto-generated method stub
		try {
			orderRepo.saveAll(orders);
			return "All orders saved successfully!";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "Failed to save orders";
		}
		
	}

}
