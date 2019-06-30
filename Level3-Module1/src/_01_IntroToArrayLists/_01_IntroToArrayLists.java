package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> list = new ArrayList<String>();
		//2. Add five Strings to your list
		list.add("Hello World!");
		list.add("e");
		list.add("3.14");
		list.add("1.618");
		list.add("crowbar");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		} 
		
		System.out.println("");
		//4. Print all the Strings using a for-each loop
		for(String s : list) {
			System.out.println(s);
		}
		
		System.out.println("");
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < list.size(); i=i+2) {
			System.out.println(list.get(i));
		}
		
		System.out.println("");
		//6. Print all the Strings in reverse order.
		for (int i = list.size()-1; i >= 0; i--) {
			System.out.println(list.get(i));
		} 
		
		System.out.println("");
		//7. Print only the Strings that have the letter 'e' in them.
		for(String s : list) {
			if(s.contains("e")) {
				System.out.println(s);
			}
		}
	}
}
