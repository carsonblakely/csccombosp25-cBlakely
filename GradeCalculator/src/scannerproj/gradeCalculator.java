package scannerproj;

import java.util.Scanner;

public class gradeCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double grade = 0.0;
				
		System.out.print("Enter your numeric grade: ");
		grade = scanner.nextDouble();
		
		if (grade < 0.0) {
			System.out.println("ERROR");
		}
		else if (grade >= 0 && grade < 60) {
			System.out.println("Your grade is an F.");
		}
		else if (grade >= 60 && grade < 67) {
			System.out.println("Your grade is an D.");
		}
		else if (grade >= 67 && grade < 69) {
			System.out.println("Your grade is an D+.");
		}
		else if (grade >= 69 && grade < 72) {
			System.out.println("Your grade is an C-.");
		}
		else if (grade >= 72 && grade < 77) {
			System.out.println("Your grade is an C.");
		}
		else if (grade >= 77 && grade < 79) {
			System.out.println("Your grade is an C+.");
		}
		else if (grade >= 79 && grade < 82) {
			System.out.println("Your grade is an B-.");
		}
		else if (grade >= 82 && grade < 87) {
			System.out.println("Your grade is an B.");
		}
		else if (grade >= 87 && grade < 89) {
			System.out.println("Your grade is an B+.");
		}
		else if (grade >= 89 && grade < 92) {
			System.out.println("Your grade is an A-.");
		}
		else if (grade >= 92) {
			System.out.println("Your grade is an A.");
		}
		
		scanner.close();
	}

}