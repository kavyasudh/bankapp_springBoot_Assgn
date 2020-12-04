package com.zoo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CATEGORY")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="CATEGORY_ID")
	private int categoryId;
	
	@Column(name="CATEGORY_TYPE")
	private String categoryType;
	
	@JoinColumn(name="cid_fk")
	@OneToMany(cascade= {CascadeType.ALL}, fetch=FetchType.EAGER)
	private List<Animal> animals=new ArrayList<>();
	
	
	public Category() {}


	public Category(String categoryType) {
		
		this.categoryType = categoryType;
	}


	public int getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	public String getCategoryType() {
		return categoryType;
	}


	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}


	public List<Animal> getAnimals() {
		return animals;
	}


	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}


	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryType=" + categoryType + ", animals=" + animals + "]";
	}
	
	
}