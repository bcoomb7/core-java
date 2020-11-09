package com.cognixia.jump.corejava;

public class FlowchartHw {

	public static void main(String[] args) {
		int userInput = 15;
		
		if(userInput > 0)
		{

			 if(userInput % 3 == 0 && userInput % 5 == 0 ) {
					System.out.println("FizzBuzz");
				}
			 
			 else if(userInput % 3 == 0) {
			System.out.println("Fizz");
		}
			 else if(userInput %  5 == 0) {
			System.out.println("Buzz");
		}
		
	} else {
		if(userInput % 2 == 0) {
			System.out.println("Even Negative");
			
			}
		
		}
	}
	}

