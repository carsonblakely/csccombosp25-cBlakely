package scannerproj;

public class stringMethods {
	public static void main(String[] args) {
		
		String name = "Carson";
		
		int length = name.length();
		//Gives the number of characters
		char letter = name.charAt(0);
		//Gives the first letter
		int index = name.indexOf("o");
		//Gives the first index of that character
		int lastIndex = name.lastIndexOf("o");
		//Gives the last index of that character
		
		name = name.toUpperCase();
		//makes all characters uppercase
		name = name.toLowerCase();
		//makes all characters lowercase
		name = name.trim();
		//Gets rid of white space
		name = name.replace("o", "a");
		//Replaces characters with others
		System.out.println(name.isEmpty());
		//Checks if the name has a value (can be used in ifs etc)
		name.contains("");
		//Checks if name has a space in it (boolean)
		name.equals("password");
		//Checks if name has the exact same characters as "password"
		//Case sensitive
		//name.equalsIgnoreCase will not be case sensitive	
	}
}