package Exam1;
import java.util.Scanner;
public class Accumulator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = -1;
		int total = 0;
		
		while (num != 0) {
			System.out.println("Enter a number: ");
			num = scanner.nextInt();
			total += num;
		}
		
		System.out.println("Sum of numbers" + total);	
	}
}
