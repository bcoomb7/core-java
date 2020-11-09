package com.cognixia.jump.corejava.classes;

public class NatureDriver {

	public static void main(String[] args) {
		int num = 10;
		do {
			num++;
			if(num % 2 == 0) {
				System.out.println("Even ");
				
			}
			else {
				System.out.println("Odd  ");
			}
			
		}while (num <10);
		
	}
	}
		
		/*//Default Constructor - when its not defined in the class
		Animal animal = new Animal();
		Animal animal2 = new Animal("Reptile", 1.0, 1, true, true);
		Animal animal3 = new Animal("Mammal");
		Animal animal4 = new Animal("Fish");
		
		
		System.out.println("First Animal type: " + animal.getType());
		System.out.println(animal2.getType());
		animal.setType("Bird");
		System.out.println("First animal type:  " + animal.getType());
		
		animal3.sound("Woof");
		String storage = animal3.getType();
		System.out.println(Animal.count);
		//System.out.println(animal2.count);
		
		//Inheritance 
		Dog dog = new Dog();
		dog.setType("Maltese");
		System.out.println(dog.getType());
		
		Dog dog1 = new Dog("Maltese", "dog", 10, 1, true, false);
		System.out.println(dog1.getType());
		dog1.sound("Woof");
		animal2.sound("bark");
		System.out.println(dog1.sound("bark", 4));

				
	}

}
*/