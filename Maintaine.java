package com.taxiMe.model;

public class Maintaine { 
	private int id;
	private String vehicleId;
	private String status;
	private int qty;
	private String driName;
	private int partId;
	private String description;
	private String date;
	public Maintaine() {
		super();
	}
	public Maintaine(int id, String vehicleId, String status, int qty, int partId, String description, String date,String driName) {
		super();
		this.id = id;
		this.vehicleId = vehicleId;
		this.status = status;
		this.qty = qty;
		this.partId = partId;
		this.description = description;
		this.date = date;
		this.driName = driName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDriName() {
		return driName;
	}
	public void setDriName(String driName) {
		this.driName = driName;
	}

	public String getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPartId() {
		return partId;
	}
	public void setPartId(int partId) {
		this.partId = partId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	

}
