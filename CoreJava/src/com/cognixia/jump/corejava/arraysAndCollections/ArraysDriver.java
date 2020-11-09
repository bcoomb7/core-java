package com.cognixia.jump.corejava.arraysAndCollections;

import com.cognixia.jump.corejava.classes.Animal;



public class ArraysDriver {

	public static void main(String[] args) {

		// create some arrays
		
		//declare - primitives and object arrays
		int[] integers;
		boolean[] booleans;
		short[] shorts;
		//array of objects
		Animal[] animals;
		//these are the same but line 10 is preferred syntax
		int ints[];
		
		//initializing 
			//no values
			integers = new int[5]; //starts with 0s in all elements
			animals = new Animal[5]; //starts with null in all elements
		
			//with values - must declare and initialize at the same time
			//primitives
			short[] altShorts = {12, 25, 31, 44, 5};
			//objects
			Animal[] altAnimals = {new Animal("Dog"), new Animal("Fish"), new Animal("Elephant")};
		//accessing - reading ad writing to array
			//read from array - 1 elem
			System.out.println(animals[0]);
			System.out.println(altAnimals[0]);
			System.out.println(integers[0]);
			System.out.println(altShorts[4]);
			
			
			// write to array - 1 elem
			integers[0] = 25;
			animals[0] = new Animal("Alligator", 1000, 2, false, true);
			altAnimals[0] = null;
			altShorts[4] = 0;
			
			//printing again so see the write changes
			System.out.println("\nAfter write changes");
			System.out.println(animals[0]);
			System.out.println(altAnimals[0]);
			System.out.println(integers[0]);
			System.out.println(altShorts[4]);
		//looping / iterating through arrays
			//traditional for loop
			//we'll use altAnimals and altShorts
			
			//going forwards, 1 at a time to the end
			for(int i = 0; i < altAnimals.length; i++) {
				System.out.println(altAnimals[i]);
				
			}
			for(int i = altShorts.length-1; i >= 0; i--) {
				System.out.println(altShorts[i]);
			}
			
			System.out.println("\nFor Each Loop");
			//for each loop - not handling indexs -> no [i]
			//primitive show read and write with for each
			for(short s : altShorts) {
				s = 0;
			}
			
			for(short s : altShorts) {
				System.out.println(s);
				
			}
			//objects same as above
			for(Animal a : altAnimals) {
				a = new Animal("Crocodile");
				}
			}

	}


