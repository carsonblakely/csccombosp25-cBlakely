package scannerproj;
import java.util.Arrays;
public class arrays {
	
	public static void main(String[] args) {
		
		String[] fruits = {"apple", "orange", "banana", "coconut"};
		
		fruits[1] = "pineapple";
		int numOfFruits = fruits.length;
		
//		for(int i = 0; i < fruits.length; i++) {
//			System.out.println(fruits[i]);
//		}
//		Arrays.sort(fruits);
//		Arrays.fill(fruits, "pineapple");
		
		
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
	}
}
