package com.websystique.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "price")
	private int price;
	
	@Column(name = "discount")
	private int discount;
	
	@Column(name = "amount")
	private int amount;

	@Column(name = "description")
	private String description;
	
	@Column(name = "image")
	private String image;
	
	@Column(name = "type")
	private Long type;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Long getType() {
		return type;
	}

	public void setType(Long type) {
		this.type = type;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String name, int price, int discount, int amount, String description, String image, Long type) {
		super();
		this.name = name;
		this.price = price;
		this.discount = discount;
		this.amount = amount;
		this.description = description;
		this.image = image;
		this.type = type;
	}

	public Product(Long id, String name, int price, int discount, int amount, String description, String image,
			Long type) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.discount = discount;
		this.amount = amount;
		this.description = description;
		this.image = image;
		this.type = type;
	}
	
    




	
}
