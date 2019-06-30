package _04_simple_array_algorithms;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SimpleArrayMethodsTest {

	@Test
	public void testSum() {
		int[] arr = {0, 1, 2, 3};
		assertEquals(6, SimpleArrayMethods.sumIntArray(arr));
		
		int[] arr2 = {-4, 1, 2, 1, -3};
		assertEquals(-3, SimpleArrayMethods.sumIntArray(arr2));
	}
	
	@Test
	public void testAverage() {
		int[] arr = {0, 1, 2, 3, 4};
		assertEquals(2.0, SimpleArrayMethods.averageIntArray(arr), 0.001);

		int[] arr2 = {5, 3, 23, -6, 24};
		assertEquals(9.8, SimpleArrayMethods.averageIntArray(arr2), 0.001);
		
		int[] arr3 = {20, 1, -12, 93};
		assertEquals(25.5, SimpleArrayMethods.averageIntArray(arr3), 0.001);
		
	}
	
	@Test
	public void testContains() {
		int[] arr = {0, 0, 0, 0, 0, 0};
		assertTrue(SimpleArrayMethods.containsIntValue(arr, 0));

		int[] arr2 = {0, 0, 0, 0, 0, 0};
		assertFalse(SimpleArrayMethods.containsIntValue(arr2, 1));
		
		int[] arr3 = {0, 1, 2, 3, 4};
		assertTrue(SimpleArrayMethods.containsIntValue(arr3, 4));
	}
	
	@Test 
	public void testGetIndex(){
		int[] arr = {0, 0, 0};
		assertEquals(0, SimpleArrayMethods.getIndex(arr, 0));
		
		int[] arr2 = {1, 2, 3, 4};
		assertEquals(3, SimpleArrayMethods.getIndex(arr2, 4));
		
		int[] arr3 = {0, 0, 0};
		assertEquals(-1, SimpleArrayMethods.getIndex(arr3, 1));
	}

}
