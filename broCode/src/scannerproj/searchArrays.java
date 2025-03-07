package scannerproj;
import java.util.Scanner;
public class searchArrays {

	public static void main(String[] args) {
		
		int[] numbers = {1, 7, 2 ,3, 5, 2};
		int target = 2;
		boolean isFound = false;
		
		for(int i = 0; i < numbers.length; i++) {
			if(target == numbers[i]) {
				System.out.println("Element found at index: " + i);
				isFound = true;
				break;
			}
		}
		if(!isFound) {
			System.out.println("Element not found in the array.");
			{
		//you can also target strings etc but you need to use 
		Scanner scanner = new Scanner(System.in);
		boolean isFound2 = false;
		
		String[] fruits = {"apple", "orange", "banana"};
		System.out.print("Enter a fruit to search for: ");
		targetTwo = scanner.nextLine();		
		
		for(int i = 0; i < numbers.length; i++) {
			if(target2 == numbers[i]) {
				System.out.println("Element found at index: " + i);
				isFound2 = true;
				break;
}
	