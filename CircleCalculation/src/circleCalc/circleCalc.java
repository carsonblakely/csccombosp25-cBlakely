package circleCalc;

import java.util.Scanner;

public class circleCalc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = 0.0;
		radius = scanner.nextDouble();
		
		double diameter = 2*radius;
		double area = Math.PI*Math.pow(radius, 2.0);
		double circumference = 2*Math.PI*radius;
		
		System.out.println("The Diameter is " + diameter + ".");
		System.out.println("The area is " + area + ".");
		System.out.println("The circumference is " + circumference + ".");
		
		scanner.close();
		
		

	}

}
