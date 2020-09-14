package com.crudop.assign.Laptop;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="Laptop")
public class Laptop implements Serializable
{
	@Id
	@Column(name="ID")
	@GenericGenerator(name = "lap_aid", strategy = "increment")
	@GeneratedValue(generator="lap_aid")
	private Long id;
	@Column(name="Name")
	private String name;
	@Column(name="Model")
	private String model;
	@Column(name="Specifications")
	private String specifications;
	@Column(name="Price")
	private Double price;
	@Column(name="userratings")
	private Double userrating;
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
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getSpecifications() {
		return specifications;
	}
	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getUserrating() {
		return userrating;
	}
	public void setUserrating(Double userrating) {
		this.userrating = userrating;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", model=" + model + ", specifications=" + specifications
				+ ", price=" + price + ", userrating=" + userrating + "]";
	}
	
	

}
