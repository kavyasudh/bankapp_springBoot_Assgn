package com.zoo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CAGE")
public class Cage {
  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CAGE_ID")
	private int cageId;
	
	@Column(name="CAGE_NO")
	private int cageNo;
	
	@Column(name="LOCATION")
	private String location;
	 
	@JoinColumn(name="ANIMAL_ID")
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER,orphanRemoval = true)
	private Animal animal;

	
	public Cage() {}


	public Cage(int cageNo, String location) {
		
		this.cageNo = cageNo;
		this.location = location;
	}


	public int getCageId() {
		return cageId;
	}


	public void setCageId(int cageId) {
		this.cageId = cageId;
	}


	public int getCageNo() {
		return cageNo;
	}


	public void setCageNo(int cageNo) {
		this.cageNo = cageNo;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public Animal getAnimal() {
		return animal;
	}


	public void setAnimal(Animal animal) {
		this.animal = animal;
	}


	@Override
	public String toString() {
		return "Cage [cageId=" + cageId + ", cageNo=" + cageNo + ", location=" + location + "]";
	}
	
	
}
