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
@Table(name="SUPPLIER")
public class Supplier {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SUPPLIER_ID")
	private int supplierId;
	@Column(name="SUPPLIER_NAME")
	private String sname;
	@Column(name="CONTACT_NO")
	private String contNo;
	
	@Column(name="ADDRESS")
	private String address;
	

	@JoinColumn(name="sid_fk")
	@OneToMany(cascade= {CascadeType.ALL}, fetch=FetchType.EAGER)
	
	private List<FoodItem>fitems=new ArrayList<>();
	
	public Supplier() {}

	public Supplier(String sname, String contNo, String address) {
		
		this.sname = sname;
		this.contNo = contNo;
		this.address = address;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getContNo() {
		return contNo;
	}

	public void setContNo(String contNo) {
		this.contNo = contNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<FoodItem> getFitems() {
		return fitems;
	}

	public void setFitems(List<FoodItem> fitems) {
		this.fitems = fitems;
	}

	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", sname=" + sname + ", contNo=" + contNo + ", address=" + address
				+ ", fitems=" + fitems + "]";
	}

	
	
	
}
