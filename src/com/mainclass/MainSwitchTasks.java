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
		//System.out.println(ostrich);
		do {
			System.out.println("What day does the ostrich eats? PD: Use cappital letters");
			/* Method 1
			value = in.nextLine();
			//System.out.println(Days.MONDAY.name());
			value=value.toUpperCase();
			if (value.equals(Days.MONDAY.name())) {
				cont=false;
				System.out.println("That's the correct answer!");
			} else {
				System.out.println("Try again!");
			}
			
			 */
			// Method 2
			Days day=null;
			Days dayToEat=ostrich.getDayToEat();

			try {
				day=Days.valueOf(in.nextLine());
			} catch (Exception e) {
				System.out.println("Please write a day of the week");
				// Continue breaks the loop
				continue;
			}
			if (day.equals(dayToEat)) {
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
