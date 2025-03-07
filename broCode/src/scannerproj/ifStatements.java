package scannerproj;

import java.util.Scanner;
public class ifStatements {
	public static void man(String[] args) {
		
		// if statement = performs a block of code if its condition is true
		
		Scanner scanner = new Scanner(System.in);
		
		String name;
		int age;
		boolean isStudent;
		
		System.out.println("Enter your name: ");
		name = scanner.nextLine();
		
		System.out.print("Enter your age: ");
		age = scanner.nextInt();
		
		System.out.print("Are you a student? true/false: ");
		isStudent = scanner.nextBoolean();
		
		//GROUP 1 (for name)
		if(name.isEmpty()) {
			//Checks if the string is empty
			System.out.println("You didn't enter your name!");
		}
		else {
			System.out.println("Hello " + name + "!");
		}
		
		
		//GROUP 2 (for age)
		if(age >= 18) {
			System.out.println("You are an adult!");
		}
		else if(age >= 65) {
			System.out.println("You are a senior!");
			//This line will get skipped if someone is over 65 because the if statement before it is also true
		}
		else if(age < 0) {
			System.out.println("You haven't been born yet!");
		}
		else if(age == 0) {
			//Make sure to use == not = because = is the assignment operator
			System.out.println("You are a baby!");
		}
		else {
			System.out.println("You are a child!");
		}
		
		//GROUP 3 (for student status)
		if(isStudent) {
			//this will automatically be set to if student is true
			System.out.println("You are a student!");
		}
		else {
			System.out.println("You are NOT a student!");
		}
		scanner.close();
	}
}
