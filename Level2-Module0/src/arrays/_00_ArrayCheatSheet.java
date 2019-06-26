package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] strings = { "String 0", "String 1", "String 2", "String 3", "String 4" };
		// 2. print the third element in the array
		System.out.println(strings[3]);
		// 3. set the third element to a different value
		strings[3] = "Example";
		// 4. print the third element again
		System.out.println(strings[3]);
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}

		System.out.println("");

		// 6. make an array of 50 integers
		int[] ints = new int[50];
		// 7. use a for loop to make every value of the integer array a random number
		Random rand = new Random();
		for (int i = 0; i < ints.length; i++) {
			ints[i] = rand.nextInt(1000);
		}
		// 8. without printing the entire array, print only the smallest number in the
		// array
		
		int smallest = Integer.MAX_VALUE;
		for (int i = 0; i < ints.length; i++) {
			if (ints[i] < smallest) {
				smallest = ints[i];
			}
		}
		System.out.println(smallest);
		
		System.out.println("");
		
		// 9 print the entire array to see if step 8 was correct
		for (int i = 0; i < ints.length; i++) {
			System.out.println(ints[i]);
		}
		
		System.out.println("");
		
		// 10. print the largest number in the array.
		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < ints.length; i++) {
			if (ints[i] > largest) {
				largest = ints[i];
			}
		}
		System.out.println(largest);
	}
}
