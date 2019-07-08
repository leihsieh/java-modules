package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] stringArray = {"this", "is", "a", "string", "array"};
		
		//2. print the third element in the array
		System.out.println(stringArray[2]);

		//3. set the third element to a different value
		stringArray[2] = "new value";

		//4. print the third element again
		System.out.println(stringArray[2]);
		
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < stringArray.length; i++) {
			stringArray[i] = "my string";
		}
		
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}
		
		//7. make an array of 50 integers
		int[] intArray = new int[50];

		//8. use a for loop to make every value of the integer array a random number
		Random rand = new Random();
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = rand.nextInt();
		}

		//9. without printing the entire array, print only the smallest number on the array
		int smallestNumber = intArray[0];
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] < smallestNumber)
				smallestNumber = intArray[i];
		}
		System.out.println(smallestNumber);

		//10 print the entire array to see if step 8 was correct
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

		//11. print the largest number in the array.
		int largestNumber = intArray[0];
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] > largestNumber)
				largestNumber = intArray[i];
		}
		System.out.println(largestNumber);
		
		//12. print only the last element in the array
		System.out.println(intArray[intArray.length - 1]);
		
	}
}
