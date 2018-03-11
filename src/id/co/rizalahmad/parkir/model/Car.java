package id.co.rizalahmad.parkir.model;

public class Car 
{
	private String regNumber;
	private String color;
	
	public Car(String regNumber, String color) {
		super();
		this.regNumber = regNumber;
		this.color = color;
	}
	public String getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}