package com.greatLearning.RestEasy.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class OrderItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne
	@JoinColumn(name="vendorname")
	private Vendor vendor;
	@OneToOne
	@JoinColumn(name="dishname")
	private Dish dish;
	private Integer quantity;
	private int unitPrice;
	private int totalPrice;
	@ManyToOne
	@JoinColumn(name = "orderId")
	private Order order;
	
	

}
