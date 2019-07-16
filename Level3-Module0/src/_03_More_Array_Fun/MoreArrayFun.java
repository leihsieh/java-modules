package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] strings = {"This", "is", "a", "String", "array"};
		
		System.out.println("Print all the Strings in the array:");
		printStringArray(strings);
		
		System.out.println("Print all the Strings in the array in reverse order:");
		printReverseStringArray(strings);
		
		System.out.println("Print every other String in the array:");
		printEveryOtherStringArray(strings);
		
		System.out.println("Print all the Strings in the array in a random order:");
		printRandomStringArray(strings);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void printStringArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("");
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public static void printReverseStringArray(String[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
		System.out.println("");
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void printEveryOtherStringArray(String arr[]) {
		for (int i = 0; i < arr.length; i+=2) {
			System.out.println(arr[i]);
		}
		System.out.println("");
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	public static void printRandomStringArray(String arr[]) {
		int index;
		String temp;
	    Random random = new Random();
	    for (int i = arr.length - 1; i > 0; i--) {
	        index = random.nextInt(i + 1);
	        temp = arr[index];
	        arr[index] = arr[i];
	        arr[i] = temp;
	    }
	    
	    for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	    System.out.println("");
	}
	
}
