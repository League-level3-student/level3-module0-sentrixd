package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] strings = new String[5];
		
		strings[0] = "yes 1";
		strings[1] = "mahbe";
		strings[2] = "eeee";
		strings[3] = "oo";
		strings[4] = "reeeeeeeeeeeeee";
		
		//printArrayOfStrings(strings);
		//printArrayOfStringsReversed(strings);
		//printArrayOfStringsEveryOther(strings);
		printArrayOfStringsRandomly(strings);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	static void printArrayOfStrings(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i] + ""); // Just in case
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	static void printArrayOfStringsReversed(String[] strings) {
		for (int i = strings.length; i > 0; i--) {
			System.out.println(strings[i - 1] + "");
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	static void printArrayOfStringsEveryOther(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i] + "");
			if (strings.length > i) {
				i++;
			}
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	static void printArrayOfStringsRandomly(String[] strings) {
		String[] foundStrings = new String[strings.length];
		int nextSpot = 0;
		
		while (true) {
			int randomIndex = new Random().nextInt(strings.length);
			boolean found = false;
			
			for (int i = 0 ; i < foundStrings.length; i++) {
				if (strings[randomIndex].equals(foundStrings[i])) {
					found = true;
				}
			}
			
			if (!found) {
				System.out.println(strings[randomIndex]);
			
				foundStrings[nextSpot] = strings[randomIndex];
				nextSpot++;
			}
			
			if (foundStrings[foundStrings.length - 1] != null) {
				break;
			}
		}
	}
	
}
