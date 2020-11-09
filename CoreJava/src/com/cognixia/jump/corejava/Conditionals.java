package com.cognixia.jump.corejava;

import java.util.Scanner;

public class Conditionals {

	public static void main(String[] args) {

		// If Statement (stand alone)
		System.out.println("If Example: \n");
		
		System.out.println("Enter an Integer:  ");
		Scanner userInput = new Scanner(System.in);
		int checkInt = 0;
		if(userInput.hasNextInt()) {
			checkInt = userInput.nextInt();
		}
		double newDub = 49;
		
		// New Scanner taking different input
		Scanner userInputAlt = new Scanner(System.in);
		
		
		System.out.println(newDub / 10);

		

		if (checkInt % 10 == 0) {
			System.out.println("WE are divisible by 10");
		}

		System.out.println("WE are going with the program");

		// If - else, and else - if
		System.out.println("\nIf - else and else if: \n");
		checkInt = 50;
		if (checkInt % 10 == 0) {
			System.out.println("Divisible by 10!");

		} else if (checkInt % 5 == 0) {
			System.out.println(" Divisible by 5");
		} else {
			System.out.println("No Match");
		}
		// Logical Condition Operators (some combinations)
		System.out.println("\nIf conditional operators");
		checkInt = 45;

		if ((checkInt > 0) ^ (checkInt % 5 == 0)) {

			System.out.println(" Positive num divisble by 5");
		}

		// Nested Conditionals
		System.out.println("\n Nested conditionals:");
		if (checkInt % 5 == 0) {
			if (checkInt % 2 == 0) {
				System.out.println("Your num is divisble by 10");
			} else {

				System.out.println("Divis by 5 but not 10");
			}
		}

		// Switch Statement (ATM Example)
		System.out.println("\nIf switch ATM example:\n");
		
		System.out.println("Welcome to the jump ATM. Please choose from\n"
				+ "options below");
		System.out.println("Press 1 for Balance\n"
				+ "Press 2 for deposit\n" + 
				"Press 3 for withdraw\n" + 
				"Press 4 for exit\n" );
		
		//Hard core different user options
		
		checkInt = 3;

		switch (checkInt) {
		case 1:
			System.out.println(" You want to check balance");
			break;
		case 2:
			System.out.println(" You want to deposit");
			break;
		case 3:
			System.out.println(" You want to withdraw");
			break;
		case 4:
			System.out.println(" You want to exit");
		 default:
			System.out.println("Exiting");
		}
		
		char charIn = ' ';
		charIn = 'A';
			 switch (charIn) {
			case 'a':
			case 'A':
				System.out.println("You printed the char a");
				break;
			case 'b':
			case 'B': 
				System.out.println("You printed the char b");
			default:
				break;
			}
			 
			 //Ternary Operator
			  int n1 = 25, n2 = 10, max;
			 
			 max = (n1 > n2) ? n1 : n2;
			 
			 System.out.println(max);
			 
			 userInput.close();
			 userInputAlt.close();
	}

}
