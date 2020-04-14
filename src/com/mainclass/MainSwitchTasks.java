package com.mainclass;

import java.util.Scanner;

import com.animals.Ostrich;
import com.enums.Days;

public class MainSwitchTasks {
	
	
	public static void main(String[] args) {
		Ostrich ostrich=new Ostrich("Rocky");
		Scanner in = new Scanner(System.in);
		boolean cont= true;
		String value;
		
		ostrich.setDayToEat(Days.MONDAY);
		System.out.println(ostrich);
		//TODO: 16.- Create a loop that asks user to guess the day the Ostrich eats.
		do {
			System.out.println("What day does the ostrich eats?");
			value = in.nextLine();
			//System.out.println(Days.MONDAY.getValue());
			//System.out.println(Days.MONDAY.name());
			value=value.toUpperCase();
		if (value.equals(Days.MONDAY.name())) {
			cont=false;
			System.out.println("That's the correct answer!");
		} else {
			System.out.println("Try again!");
		}
			
		} while (cont);
		//Once the user answers correctly, the loop ends.
		//HINT: The enum classes has a method named valueOf and name.
		//Use only if statements
		//Plus: Use try and catch for any possible input errors.
		
	}

}
