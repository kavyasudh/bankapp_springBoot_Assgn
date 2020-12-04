package com.zoo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="FOOD_ITEM")
public class FoodItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="FOOD_ITEM_ID")
	private int fid;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="QUANTITY")
	private int quantity;
	
	

  @ManyToMany(mappedBy ="fitems",cascade=CascadeType.ALL)
  private List<Animal> animals=new ArrayList<>();

	
	
	public FoodItem() {}


	public FoodItem(String name, int quantity) {
		
		this.name = name;
		this.quantity = quantity;
	}








	public int getFid() {
		return fid;
	}



	public void setFid(int fid) {
		this.fid = fid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public List<Animal> getAnimals() {
		return animals;
	}



	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}


	@Override
	public String toString() {
		return "FoodItem [fid=" + fid + ", name=" + name + ", quantity=" + quantity  + "]";
	}





	
	
	
}
