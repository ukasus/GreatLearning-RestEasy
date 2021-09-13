package com.greatLearning.RestEasy.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Vendor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String vendorName;
	

}
