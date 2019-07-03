package _00_sorted_array_checker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortedArrayCheckerTest {

	@Test
	void testIntArray() {
		int[] unsorted = {3, 2, 9, 3, 1, 0};
		int[] sorted = {0, 1, 2, 2, 3, 4};
		
		assertFalse(SortedArrayChecker.intArraySorted(unsorted));
		assertTrue(SortedArrayChecker.intArraySorted(sorted));
	}
	
	@Test
	void testDoubleArray() {
		double[] unsorted = {3, 2, 9, 3, 1, 0};
		double[] sorted = {0, 1, 2, 2, 3, 4};
		
		assertFalse(SortedArrayChecker.doubleArraySorted(unsorted));
		assertTrue(SortedArrayChecker.doubleArraySorted(sorted));
	}
	
	@Test
	void charDoubleArray() {
		char[] unsorted = {'c', 'F', 'p', 'A'};
		char[] sorted = {'a', 'b', 'c', 'd', 'e'};
		
		assertFalse(SortedArrayChecker.charArraySorted(unsorted));
		assertTrue(SortedArrayChecker.charArraySorted(sorted));
	}
	
	@Test
	void stringDoubleArray() {
		String[] unsorted = {"carrot", "pineapple", "mango", "pear"};
		String[] sorted = {"apple", "banana", "carrot", "grape"};
		
		assertFalse(SortedArrayChecker.stringArraySorted(unsorted));
		assertTrue(SortedArrayChecker.stringArraySorted(sorted));
	}

}
