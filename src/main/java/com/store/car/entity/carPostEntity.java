package com.store.car.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="car_post")
public class CarPostEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="car_model")
	private String model;
	
	@Column(name="car_brand")
	private String brand;
	
	@Column(name="car_price")
	private Double price;
	
	@Column(name="car_description")
	private String description;
	
	@Column(name="car_engine")
	private String engineVersion;
	
	@Column(name="car_city")
	private String city;
	
	@Column(name="car_created")
	private String createdDate;
	
	@Column(name="car_post_contact")
	private String contact;
	
	@ManyToOne
	@JoinColumn(name="owner_post_id", nullable=false, referencedColumnName="id")
	private OwnerPostEntity ownerPost;

	
	public CarPostEntity() {
		super();
	}

	public CarPostEntity(Long id, String model, String brand, Double price, String description, String engineVersion,
			String city, String createdDate, String contact, OwnerPostEntity ownerPost) {
		super();
		this.id = id;
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.description = description;
		this.engineVersion = engineVersion;
		this.city = city;
		this.createdDate = createdDate;
		this.contact = contact;
		this.ownerPost = ownerPost;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEngineVersion() {
		return engineVersion;
	}

	public void setEngineVersion(String engineVersion) {
		this.engineVersion = engineVersion;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public OwnerPostEntity getOwnerPost() {
		return ownerPost;
	}

	public void setOwnerPost(OwnerPostEntity ownerPost) {
		this.ownerPost = ownerPost;
	}
	
	
	
	
	
}
