package com.greatLearning.RestEasy.entities;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity
@Table(name = "orderData")
@Data
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	@ManyToOne
	@JoinColumn(name = "customername")
	private Customer customer;
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date orderDate;
	private int orderAmount;
	@OneToMany(mappedBy = "order")
	private List<OrderItem> items;

}
