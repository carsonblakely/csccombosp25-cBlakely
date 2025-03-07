package scannerproj;

public class printF {

	public static void main(String[] args) {
		// printf() is a method used to format the output
		
		// %[flags][width][.precision][specifier-character]
		
		String name = "Spongebob";
		char firstLetter = 'S';
		int age = 30;
		double height = 60.5;
		boolean isEmployed = true;
		
		// For specifier-character
		
		System.out.printf("Hello %s\n", name);
		//%s for strings
		System.out.printf("Your name starts with a %c\n", firstLetter);
		//%c for chars
		System.out.printf("Your age is %d years old\n", age);
		//%d for ints
		System.out.printf("You are %f inches tall\n", height);
		//%f for doubles
		System.out.printf("Employed: %b\n", isEmployed);
		//%b for booleans
		System.out.printf("%s is %d years old", name, age);
		
		// For precision
		// + = output a plus before positive numbers
		// , = comma grouping separator (at thousand places)
		// ( = negative numbers are enclosed in ()
		// space = display a minus if negative, space if positive
		
		double price1 = 9.99;
		double price2 = 100.15;
		double price3 = -54.01;
		
		System.out.printf("%.2f\n", price1);
		System.out.printf("%.2f\n", price2);
		System.out.printf("%.2f\n", price3);
		//normally this displays 6 didget
		//to limit you put .1, .2, etc. after the %
		
		// For width
		
		// 0 = zero padding
		// number = right justified padding
		// negative number = left justified padding
		
		int id1 = 1;
		int id2 = 23;
		int id3 = 456;
		int id4 = 7890;
		
		System.out.printf("%04d\n", id1);
		System.out.printf("%04d\n", id2);
		System.out.printf("%04d\n", id3);
		System.out.printf("%04d\n", id4);
		//Each number is now 0 padded up to 4 numbers
		
		System.out.printf("%4d\n", id1);
		System.out.printf("%4d\n", id2);
		System.out.printf("%4d\n", id3);
		System.out.printf("%4d\n", id4);
		//Each number is now right justified
		
		System.out.printf("%-4d\n", id1);
		System.out.printf("%-4d\n", id2);
		System.out.printf("%-4d\n", id3);
		System.out.printf("%-4d\n", id4);
		//Each number is now left justified
		
	}

}
