package Exam1;
import java.util.Scanner;
public class TenMaker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter value: ");
		int val1 = scanner.nextInt();

		System.out.print("Enter next value: ");
		int val2 = scanner.nextInt();
		
		System.out.println(makes10(val1, val2));
		}
	
	public static boolean makes10(int val1, int val2) {
		boolean adds10;

		if (val1 + val2 == 10) {
			adds10 = true;
			System.out.println("The numbers add to ten.");
		}
		else {
			adds10 = false;
			System.out.println("The numbers do not add to ten.");

		}
	return adds10;

	}
}