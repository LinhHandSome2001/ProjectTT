package com.brycen.detai.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_driver")
public class Driver {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fullName;
	private String birthday;
	private String address;
	private String gender;
	private String identityCard;
	private String phone;
	@OneToMany(mappedBy = "driver")
	private List<Trip> trips;


	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Driver(int id, String fullName, String birthday, String address, String gender, String identityCard,
			String phone) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.birthday = birthday;
		this.address = address;
		this.gender = gender;
		this.identityCard = identityCard;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIdentityCard() {
		return identityCard;
	}

	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
