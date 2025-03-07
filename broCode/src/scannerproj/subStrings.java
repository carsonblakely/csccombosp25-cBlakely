package scannerproj;

import java.util.Scanner;
public class subStrings {
	public static void main(String[] args) {
		
		// .substring() used to extract a portion of a string
		// string.substring(start, end)
		
		Scanner scanner = new Scanner(System.in);
		
		String email;
//		String username;
//		String domain;
		
		System.out.print("Enter your email: ");
		email = scanner.nextLine();
		
		if(email.contains("@")) {

//			String email = "carsonjblakely@gmail.com";
////		String username = email.substring(0, 14);
////		String domain = email.substring(15);
//		//This isn't flexible fix this:
			String username = email.substring(0, email.indexOf("@"));
			String domain = email.substring(email.indexOf("@") + 1);
		
			System.out.println(username);
			System.out.println(domain);
		
		scanner.close();
		}
		else {
			System.out.println("Email must contain @");
		}
		
	}
}
