package com.cognixia.jump.corejava;

public class Loops {

	public static void main(String[] args) {
		
		//While Loop
		System.out.println("While Loop:");
		
		int count = 0;
		boolean condition = true;
		while(condition) {
			
			if(count % 2 != 0) {
				System.out.println(count);
			}
			count++;
			if(count % 25 == 0) {
				condition = false;
			
			}
		}
System.out.println("\nFor Loops");

for(int i = 0; i <= 9; ++i) {
	int x = 1;
	x+=1;
	//same thing x = x + 1;
	System.out.println(i);
}

System.out.println("\n Nested Loops:");
for(int i = 0; i < 10; i++) {
	for(int j = 0; j < 5; j++) {
		System.out.println(i +" " + j);
	}
}
	}

}

