/*
 * 21/2/22
 * 
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 * 
 * Class to define properties
 * 
 * 
 */

public class Property {

	private int idProperty;
	private String name;
	private String color;
	private int price;
	private boolean isMortgaged;

	// Constructors
	
	// Default
	
	
	// Normal Constructor
	public Property(int idProperty, String name, String color, int price, boolean isMortgaged) {
		super();
		this.idProperty = idProperty;
		this.name = name;
		this.color = color;
		this.price = price;
		this.isMortgaged = isMortgaged;
	}

	// Getters and Setters

	public int getIdProperty() {
		return idProperty;
	}

	public void setIdProperty(int idProperty) {
		this.idProperty = idProperty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
