package id.co.rizalahmad.parkir.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import id.co.rizalahmad.parkir.controller.Parking;
import id.co.rizalahmad.parkir.controller.Utility;
import id.co.rizalahmad.parkir.model.Car;

public class Main 
{
	public static void main(String args[])
	{
		Parking parking = new Parking();
		Scanner scanner;
		String command;
		String input[];
		int num = 0;
		List<Car> slot = new ArrayList<Car>();
		
		while(true)
		{
			scanner = new Scanner(System.in);
			System.out.println("Input:");
			command = scanner.nextLine();			
			input = command.split(" ", 3);
			
			if(input.length == 1)
			{
				if(input[0].equalsIgnoreCase("status"))
					parking.status();
			}
			else if(input.length == 2)
			{
				if(input[0].equalsIgnoreCase("create_parking_lot"))
				{
					if(Utility.isPosInt(input[1]))
					{
						if(num > 0)
						{
							System.out.println("Error:");
							System.out.println("You have initialize the slots for the parking lot");
						}							
						else
						{
							num = Integer.valueOf(input[1]);
							System.out.println("Output:");
							System.out.println("Created a parking lot with " + input[1] + " slots");
						}
					}
					else
					{
						System.out.println("Error:");
						System.out.println("Number of slot must be a positive number");
					}
				}
				else if(input[0].equalsIgnoreCase("leave"))
				{
					if(Utility.isPosInt(input[1]) && Integer.valueOf(input[1]) <= num)
					{
						
					}
				}
			}
			else if(input.length == 3)
			{
				if(input[0].equalsIgnoreCase("park"))
				{
					
				}
			}
			
			scanner.close();
		}		
	}
}