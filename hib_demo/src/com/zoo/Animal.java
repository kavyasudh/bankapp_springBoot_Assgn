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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="ANIMAL")
public class Animal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ANIMAL_ID")
	private int animalId;
	
	@Column(name="TYPE")
	private String animalType;
	
	@Column(name="TOTAL_NO")
	private int TotalNo;
	

	@JoinColumn(name="CAGE_Id")
	@OneToOne(mappedBy = "animal")
	private Cage cage;
	
	/*
	 * @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	 * 
	 * @JoinColumn(name="CATEGORY_Id") private Category category;
	 * 
	 */
	
	@JoinTable(name="Animal_Food_Item",
 	joinColumns= {@JoinColumn(name="Animal_Id_fk", referencedColumnName = "ANIMAL_ID")},
 	inverseJoinColumns= {@JoinColumn(name="Food_ITEM_Id_fk",referencedColumnName="FOOD_ITEM_ID")})
	@ManyToMany(cascade=CascadeType.ALL)
    private List<FoodItem> fitems=new ArrayList<>();
	
	public Animal() {}
	
	

	public Animal(String animalType, int totalNo) {
		
		this.animalType = animalType;
		TotalNo = totalNo;
	}



	public int getAnimalId() {
		return animalId;
	}

	public void setAnimalId(int animalId) {
		this.animalId = animalId;
	}

	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	public int getTotalNo() {
		return TotalNo;
	}

	public void setTotalNo(int totalNo) {
		TotalNo = totalNo;
	}

	public Cage getCage() {
		return cage;
	}

	public void setCage(Cage cage) {
		this.cage = cage;
	}

	/*
	 * public Category getCategory() { return category; }
	 * 
	 * public void setCategory(Category category) { this.category = category; }
	 */

	public List<FoodItem> getFitems() {
		return fitems;
	}

	public void setFitems(List<FoodItem> fitems) {
		this.fitems = fitems;
	}



	@Override
	public String toString() {
		return "Animal [animalId=" + animalId + ", animalType=" + animalType + ", TotalNo=" + TotalNo + ", cage=" + cage
				+  "]";
	}

	
	
	

}
