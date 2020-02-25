package com.capgemini.project.beans;

public class Product {
	public Product() {
		super();
		}
		
	private int rawMaterialId;
	private String deliveryStatus;
	
	
	
	public int getRawMaterialId() {
		return rawMaterialId;
	}
	public void setRawMaterialId(int rawMaterialId) {
		this.rawMaterialId = rawMaterialId;
	}
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	
	}
