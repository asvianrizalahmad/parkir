package id.co.rizalahmad.parkir.model;

import id.co.rizalahmad.parkir.predefined.Color;

public class Car 
{
	private String regNumber;
	private Color color;
	
	public String getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
}