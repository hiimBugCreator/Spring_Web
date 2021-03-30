package com.websystique.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "billdetail")
public class OrderDetail {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Long id;

	@Column(name = "id_bill")
	private Long id_bill;

	@Column(name = "id_product")
	private Long id_product;
	
	@Column(name = "quan")
	private int quan;
	
	@Column(name = "price")
	private int price;
	
	@Column(name = "total_price")
	private int total_price;
	@Column(name = "image")
	private String image;
	@Column(name = "namep")
	private String namep;

	public OrderDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderDetail( Long id_bill, Long id_product, int quan, int price, int total_price) {
		super();
		this.id_bill = id_bill;
		this.id_product = id_product;
		this.quan = quan;
		this.price = price;
		this.total_price = total_price;
	}
	
	
	

	public OrderDetail(Long id_bill, Long id_product, int quan, int price, int total_price, String image,
			String namep) {
		super();
		this.id_bill = id_bill;
		this.id_product = id_product;
		this.quan = quan;
		this.price = price;
		this.total_price = total_price;
		this.image = image;
		this.namep = namep;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getNamep() {
		return namep;
	}

	public void setNamep(String namep) {
		this.namep = namep;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId_bill() {
		return id_bill;
	}

	public void setId_bill(Long id_bill) {
		this.id_bill = id_bill;
	}

	public Long getId_product() {
		return id_product;
	}

	public void setId_product(Long id_product) {
		this.id_product = id_product;
	}

	public int getQuan() {
		return quan;
	}

	public void setQuan(int quan) {
		this.quan = quan;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTotal_price() {
		return total_price;
	}

	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}
	
	
}
