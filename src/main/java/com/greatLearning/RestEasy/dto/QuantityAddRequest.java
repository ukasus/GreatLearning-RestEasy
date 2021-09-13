package com.greatLearning.RestEasy.dto;

import lombok.Data;

@Data
public class QuantityAddRequest {
	private int orderId;
	private int quantityToAdd;

}
