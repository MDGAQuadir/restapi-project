package com.example.restapiproduct.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "products")  // PostgreSQL table name
public class Product {

    @Id
    private Integer id;

    private Double cost;
    private String category;
    private String name;
    private String brand;

    @Column(name = "retail_price")
    private Double retailPrice;

    private String department;
    private String sku;

    @Column(name = "distribution_center_id")
    private Integer distributionCenterId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(Double retailPrice) {
		this.retailPrice = retailPrice;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public Integer getDistributionCenterId() {
		return distributionCenterId;
	}

	public void setDistributionCenterId(Integer distributionCenterId) {
		this.distributionCenterId = distributionCenterId;
	}

}
