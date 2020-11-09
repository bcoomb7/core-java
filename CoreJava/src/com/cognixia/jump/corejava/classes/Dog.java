package com.cognixia.jump.corejava.classes;

public class Dog extends Animal {
	

	
	private String breed;
	//the object existing in another class
	private MicroChip chip;
	
	
	public Dog() {
		super("poodle", 50, 2, true, false); 
		this.breed = "";
		chip = new MicroChip();
	}
		public Dog(String breed) {
			super("poodle", 50, 2, true, false); 
			this.breed = breed;
			chip = new MicroChip();
		}
			
			public Dog(String breed, String type, double weight, double height, boolean isDomestic, boolean isPredator) {
				super(type, weight, height, isDomestic, isPredator);
				this.breed = breed;
				chip = new MicroChip();
			}
			
			public String getBreed() {
				return breed;
			}
			public void setBreed(String breed) {
				this.breed = breed;
			}
			public MicroChip getChip() {
				return chip;
			}
			public void setChip(MicroChip chip) {
				this.chip = chip;
			}
		
		//Methods
			//method override - runtime polymorphism means Java can figure 
			//out where to find what it needs during runtime.
			//signature has to match exactly 
			
			@Override
			public void sound(String noise) { 
				System.out.println("A dog goes:  " + noise);
				
				
			}
	
			//Method Overloading - compile time polymorphism
			
			public String sound(String noise, int volume) {
				String string = "";
				for(int i = 0; i < volume; i++) {
				string+=(" " + noise);
			}
			return string;

	}
}



