package com.greatLearning.RestEasy.entities;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class VendorDishRelation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private int id;
	@OneToOne
	@JoinColumn(name = "vendorName")
	private Vendor vendor;
	@OneToOne
	@JoinColumn(name="dishName")
	private Dish dish;
	private int price;

}
