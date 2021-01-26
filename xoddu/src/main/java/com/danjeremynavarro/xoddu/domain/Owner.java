package com.danjeremynavarro.xoddu.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.GenerationType;

@Entity
public class Owner {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long ownerId;
	
	private String firstName, lastName;
	
	public Owner(){}
	
	public Owner(String f, String l){
		super();
		this.firstName = f;
		this.lastName = l;
	}
	
	/**
	 * <p>
	 * mappedBy refers to field owner in car the column containing foreign key.
	 * JsonIgnore is added so that it doesn't get loaded when being parsed by jackson
	 */
	@OneToMany(cascade=CascadeType.ALL,mappedBy="owner")
	@JsonIgnore
	private List<Car> cars;

	public long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(long ownerId) {
		this.ownerId = ownerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@JsonIgnore
	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> carOwner) {
		this.cars = cars;
	}
}
