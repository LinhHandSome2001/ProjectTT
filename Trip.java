package com.brycen.detai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_trip")
public class Trip {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nameTrip;
	private String arrivalTime;
	private String time;
	private int blank;

	@ManyToOne
	@JoinColumn(name = "driver_id")
	private Driver driver;
	@ManyToOne
	@JoinColumn(name = "route_id")
	private Route route;
	public Trip() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trip(int id, String nameTrip, String arrivalTime, String time, int blank, Driver driver) {
		super();
		this.id = id;
		this.nameTrip = nameTrip;
		this.arrivalTime = arrivalTime;
		this.time = time;
		this.blank = blank;
		this.driver = driver;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameTrip() {
		return nameTrip;
	}

	public void setNameTrip(String nameTrip) {
		this.nameTrip = nameTrip;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getBlank() {
		return blank;
	}

	public void setBlank(int blank) {
		this.blank = blank;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

}
