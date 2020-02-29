package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] test0 = {"Taco", "Nacho", "Toquito"};
		assertEquals(0, _00_LinearSearch.linearSearch(test0, "Taco"));
		assertEquals(1, _00_LinearSearch.linearSearch(test0, "Nacho"));
		assertEquals(2, _00_LinearSearch.linearSearch(test0, "Toquito"));
		
		String[] test1 = {"Once", "upon", "a", "time", "in", "the", "East"};
		assertEquals(6, _00_LinearSearch.linearSearch(test1, "East"));
		
		String[] test2 = {"Taco", "Nacho", "Toquito"};
		assertEquals(-1, _00_LinearSearch.linearSearch(test2, "Loco"));	
	}

	@Test
	void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] arr0 = {0, 1, 2, 3, 4, 5};
		assertEquals(0, _01_BinarySearch.binarySearch(arr0, 0, arr0.length - 1, 0));
		assertEquals(1, _01_BinarySearch.binarySearch(arr0, 0, arr0.length - 1, 1));
		assertEquals(2, _01_BinarySearch.binarySearch(arr0, 0, arr0.length - 1, 2));
		assertEquals(3, _01_BinarySearch.binarySearch(arr0, 0, arr0.length - 1, 3));
		
		assertEquals(-1, _01_BinarySearch.binarySearch(arr0, 0, arr0.length - 1, 99));
		
		int[] arr1 = {0, 43, 209, 388, 401, 599};
		assertEquals(2, _01_BinarySearch.binarySearch(arr1, 0, arr0.length - 1, 209));
		assertEquals(-1, _01_BinarySearch.binarySearch(arr1, 0, arr0.length - 1, 45));
	}
	
	@Test
	void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] arr0 = {0, 1, 2, 3, 4, 5};
		assertEquals(0, _02_InterpolationSearch.interpolationSearch(arr0, 0));
		assertEquals(1, _02_InterpolationSearch.interpolationSearch(arr0, 1));
		assertEquals(2, _02_InterpolationSearch.interpolationSearch(arr0, 2));
		assertEquals(3, _02_InterpolationSearch.interpolationSearch(arr0, 3));
		assertEquals(4, _02_InterpolationSearch.interpolationSearch(arr0, 4));
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(arr0, 55));
		
		int[] arr1 = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39};
		assertEquals(0, _02_InterpolationSearch.interpolationSearch(arr1, 3));
		assertEquals(1, _02_InterpolationSearch.interpolationSearch(arr1, 6));
		assertEquals(2, _02_InterpolationSearch.interpolationSearch(arr1, 9));
		assertEquals(3, _02_InterpolationSearch.interpolationSearch(arr1, 12));
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(arr1, 4));
	}
	
	@Test
	void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] arr0 = {0, 1, 2, 3, 4, 5};
		assertEquals(0, _03_ExponentialSearch.exponentialSearch(arr0, 0));
		assertEquals(1, _03_ExponentialSearch.exponentialSearch(arr0, 1));
		assertEquals(2, _03_ExponentialSearch.exponentialSearch(arr0, 2));
		assertEquals(3, _03_ExponentialSearch.exponentialSearch(arr0, 3));
		assertEquals(4, _03_ExponentialSearch.exponentialSearch(arr0, 4));
		assertEquals(-1, _03_ExponentialSearch.exponentialSearch(arr0, 6));
		
		int[] arr1 = {0, 43, 209, 388, 401, 599};
		assertEquals(2, _03_ExponentialSearch.exponentialSearch(arr1, 209));
		assertEquals(-1, _03_ExponentialSearch.exponentialSearch(arr1, 6));
	}
}
