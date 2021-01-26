/**
 * @author dannavarro
 *
 */
package com.danjeremynavarro.xoddu.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String brand, model, color, registernumber;

	private int year, price;
	
	public enum DESCRIPTION {
		NEW, USED, LIGHTLY_USED
	}

//	Enums doesn't work properly on mariadb
//	@Column(name = "desc", columnDefinition="ENUM('NEW','USED','LIGHTLY_USED')")
//	@Enumerated(EnumType.STRING)
//	private DESCRIPTION description;

	/**
	 * store owner of this car.
	 * 
	 * 
	 */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "OWNER_FK")
	private Owner owner;

	public Car() {
	}

	public Car(String brand, String model, String color, String registernumber, int year, int price,
			Owner owner) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.registernumber = registernumber;
		this.year = year;
		this.price = price;
		this.owner = owner;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRegisternumber() {
		return registernumber;
	}

	public void setRegisternumber(String registernumber) {
		this.registernumber = registernumber;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}
}
