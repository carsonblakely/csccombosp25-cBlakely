package scannerproj;
import java.util.Scanner;
public class mathClass {

	public static void main(String[] args) {
		
		System.out.println(Math.PI);
		//Built in constant for PI
		System.out.println(Math.E);
		//Built in constant for E
		
//		double result;
//		
//		result = Math.pow(2, 3);
//		//2^3 (base, power)
//		result = Math.abs(-5);
//		//Gives absolute value
//		result = Math.sqrt(9);
//		//Square Root
//		result = Math.round(3.14);
//		//Rounds to nearest whole int
//		result = Math.ceil(3.14);
//		//Rounds UP every time
//		result = Math.floor(3.99);
//		//Rounds DOWN every time
//		result = Math.max(10, 20);
//		//Gives max between the two values
//		result = Math.min(10, 20);
//		//Gives min between the two values
		
		// HYPOTENUSE c = Math.sqrt(a^2 + b^2)
//		Scanner scanner = new Scanner(System.in);
//		
//		double a;
//		double b;
//		double c;
//		
//		System.out.print("Enter the length of side A: ");
//		a = scanner.nextDouble();
//		
//		System.out.print("Enter the length of side B: ");
//		b = scanner.nextDouble();
//		
//		c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
//		
//		System.out.println("The hypotenuse (side c) is: " + c);
//		
//		scanner.close();
		
		Scanner scanner = new Scanner(System.in);
		
		double radius;
		double circumference;
		double area;
		double volume;
		
		System.out.print("Enter the radius: ");
		radius = scanner.nextDouble();
		
		circumference = 2 * Math.PI * radius;
		area = Math.PI * Math.pow(radius, 2);
		volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
		
		System.out.printf("The circumferenece is: %.1fcm\n", circumference);
		System.out.printf("The area is: %.1fcm^2\n", area);
		System.out.printf("The volume is: %.1fcm^3\n", volume);
		//The print f shindig makes it so it displays only one decimal
		
		scanner.close();

	}

}
