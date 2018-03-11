package id.co.rizalahmad.parkir.view;

import java.util.Scanner;

import id.co.rizalahmad.parkir.controller.Parking;
import id.co.rizalahmad.parkir.model.Car;

public class Main 
{
	public static void main(String args[])
	{
		Parking parking = new Parking();
		Scanner scanner;
		String command;
		String input[];
		Car cars[] = new Car[0];
		
		while(true)
		{
			scanner = new Scanner(System.in);
			System.out.println("Input:");
			command = scanner.nextLine();			
			input = command.split(" ", 3);
			
			if(input.length == 1)
			{
				if(input[0].equalsIgnoreCase("status"))
					parking.status(cars);
			}
			else if(input.length == 2)
			{
				if(input[0].equalsIgnoreCase("create_parking_lot"))
					parking.initializeSlot(cars, input[1]);
				else if(input[0].equalsIgnoreCase("leave"))
					parking.leave(cars, input[1]);
				else if(input[0].equalsIgnoreCase("registration_numbers_for_cars_with_colour"))
					parking.showRegNoByColor(cars, input[1]);
				else if(input[0].equalsIgnoreCase("slot_numbers_for_cars_with_colour"))
					parking.showSlotByColor(cars, input[1]);
				else if(input[0].equalsIgnoreCase("slot_number_for_registration_number"))
					parking.showSlotByRegNo(cars, input[1]);
			}
			else if(input.length == 3)
			{
				if(input[0].equalsIgnoreCase("park"))
					parking.park(cars, input[1], input[2]);
			}
			
			scanner.close();
		}		
	}
}