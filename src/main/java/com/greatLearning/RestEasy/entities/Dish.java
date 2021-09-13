package com.greatLearning.RestEasy.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class Dish  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String name;
	private int calories;
	
	


}
