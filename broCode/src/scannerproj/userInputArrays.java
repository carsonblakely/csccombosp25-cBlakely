package scannerproj;
import java.util.Scanner;
public class userInputArrays {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		String[] foods = {"pizza", "taco", "hamburger"};
//		
//		//before setting values make sure you set the size of the array
//		String[] test = new String[3];
//		//this will make a 4 part array ^
//		//You cant reassign to places that havent been created before
		
		String[] foods;
		int size;
		
		System.out.print("What number of food do you want?: ");
		size = scanner.nextInt();
		scanner.nextLine();
		
		foods = new String[size];
		
		for(int i = 0; i < foods.length; i++) {
			System.out.print("Enter a food: ");
			foods[i] = scanner.nextLine();
		}
		
		for(String food :foods) {
			System.out.println(food);
		}
		//food is basically made to be a number for each string in foods
		
		scanner.close();
	}

}
