package com.tts.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@NotNull
	private Long id;
	
	private int quantity;
	private double price;
	
	private String description;
	private String name;
	private String brand;
	private String category;
	private String image; //this will be a url

}
