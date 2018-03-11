package id.co.rizalahmad.parkir.controller;

import id.co.rizalahmad.parkir.model.Car;

public class Parking 
{	
	public void initializeSlot(Car[] cars, String number)
	{
		if(Utility.isPosInt(number))
		{
			if(cars.length > 0)
				Utility.error("You have initialize the slots for the parking lot");
			else
			{
				cars = new Car[Integer.valueOf(number)];
				System.out.println("Created a parking lot with " + number + " slots");
			}
		}
	}
	
	public void status(Car[] cars)
	{
		if(cars.length == 0)
			System.out.println("Please initialize the parking lot first");
		else
		{
			System.out.println("Slot No\tRegistration No.\tColour");
			
			for(int i=0; i<cars.length; i++)
			{
				if(cars[i] != null)
					System.out.println(i + "\t" + cars[i].getRegNumber() + "\t" + cars[i].getColor());
			}
		}
	}
	
	public void park(Car[] cars, String regNo, String color)
	{
		for(int i=0; i<cars.length; i++)
		{
			if(cars[i] != null)
			{
				cars[i] = new Car(regNo, color);
				System.out.println("Allocated slot number: " + (i+1));
				break;
			}
		}
		
		System.out.println("Sorry, parking lot is full");
	}
	
	public void leave(Car[] cars, String no)
	{
		if(Utility.isPosInt(no))
		{
			int index = Integer.valueOf(no);
			
			if(cars[index] != null)
			{
				cars[index] = null;
				System.out.println("Slot number " + no + " is free");
			}
			else
				System.out.println("Not found");
		}
	}
	
	public void showRegNoByColor(Car[] cars, String color)
	{
		StringBuilder slots = new StringBuilder();
		
		for(int i=0; i<cars.length; i++)
		{
			if(cars[i] != null)
			{
				if(cars[i].getColor().equalsIgnoreCase(color))
				{
					slots.append(cars[i].getRegNumber());
					slots.append(", ");
				}
			}
		}
		
		if(slots.length() > 0)
			System.out.println(slots.substring(0, slots.length()-3));
		else
			System.out.println("Not found");
	}
	public void showSlotByColor(Car[] cars, String color)
	{
		StringBuilder slots = new StringBuilder();
		
		for(int i=0; i<cars.length; i++)
		{
			if(cars[i] != null)
			{
				if(cars[i].getColor().equalsIgnoreCase(color))
				{
					slots.append(i+1);
					slots.append(", ");
				}
			}
		}
		
		if(slots.length() > 0)
			System.out.println(slots.substring(0, slots.length()-3));
		else
			System.out.println("Not found");
	}
	public void showSlotByRegNo(Car[] cars, String regNo)
	{
		for(int i=0; i<cars.length; i++)
		{
			if(cars[i] != null)
			{
				if(cars[i].getColor().equalsIgnoreCase(regNo))
				{
					System.out.println(i+1);
					break;
				}
			}
		}
		
		System.out.println("Not found"); 
	}
}