package Exam1;
import java.util.Scanner;
public class BeverageSelector {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Select a beverage (1)Water (2)Coke (3)Coffee: ");
		int beverageSelection = scanner.nextInt();
		
		if (beverageSelection == 1) {
			System.out.println("You chose Water.");
		}
		else if (beverageSelection == 2) {
			System.out.println("You chose Coke.");
		}
		else if (beverageSelection == 3) {
			System.out.println("You chose Coffee.");
		}
		scanner.close();
	}
}
