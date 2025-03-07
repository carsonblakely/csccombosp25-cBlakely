 package scannerproj;

import java.util.Random;
public class random {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int number;
		//You can also do this with doubles and booleans
		
		number = random.nextInt(1, 6);
		//You set bounds in this ^ this will give 1-5 (inclusive, exclusive)
		
		System.out.println(number);
		
		boolean isHeads;
		
		isHeads = random.nextBoolean();
		
		if(isHeads) {
			System.out.println("HEADS");
		}
		else {
			System.out.println("TAILS");
		}
	}
}
