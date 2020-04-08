package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] arrayOfStrings = new String[5];
		
		arrayOfStrings[0] = "yay";
		arrayOfStrings[1] = "deperssion";
		arrayOfStrings[2] = "not yay";
		arrayOfStrings[3] = "ok boomer";
		arrayOfStrings[4] = "reeee";
		
		//2. print the third element in the array
		System.out.println(arrayOfStrings[2]);
		//3. set the third element to a different value
		arrayOfStrings[2] = "not depression"; 
		//4. print the third element again
		System.out.println(arrayOfStrings[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < arrayOfStrings.length; i++) {
			arrayOfStrings[i] = "yay";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < arrayOfStrings.length; i++) {
			System.out.println(arrayOfStrings[i]);
		}
		//7. make an array of 50 integers
		int[] manyInts = new int [50];
		//8. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < manyInts.length; i++) {
			manyInts[i] = new Random().nextInt(50) + 1;
		}
		//9. without printing the entire array, print only the smallest number on the array
		int smallestInt = 0;
		
		for (int i = 0; i < manyInts.length; i++) {
			if (smallestInt == 0) {
				smallestInt = manyInts[i];
			} else if (smallestInt > manyInts[i]) {
				smallestInt = manyInts[i];
			}
		}
		
		System.out.println(smallestInt + " - Smallest number");
		//10 print the entire array to see if step 8 was correct
		for (int i = 0; i < manyInts.length; i++) {
			System.out.println(manyInts[i]);
		}
		//11. print the largest number in the array.
		int biggestInt = 0;
		
		for (int i = 0; i < manyInts.length; i++) {
			if (biggestInt == 0) {
				biggestInt = manyInts[i];
			} else if (biggestInt < manyInts[i]) {
				biggestInt = manyInts[i];
			}
		}
		
		System.out.println(biggestInt + " - Biggest number");
		//12. print only the last element in the array
		System.out.println(manyInts[manyInts.length - 1]);
	}
}
