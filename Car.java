package com.brycen.detai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_car")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nameCar;
	private String plateCar;
	private String seats;
		
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Car(int id, String nameCar, String plateCar, String seats) {
		super();
		this.id = id;
		this.nameCar = nameCar;
		this.plateCar = plateCar;
		this.seats = seats;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameCar() {
		return nameCar;
	}
	public void setNameCar(String nameCar) {
		this.nameCar = nameCar;
	}
	public String getPlateCar() {
		return plateCar;
	}
	public void setPlateCar(String plateCar) {
		this.plateCar = plateCar;
	}
	public String getSeats() {
		return seats;
	}
	public void setSeats(String seats) {
		this.seats = seats;
	}

	
}
