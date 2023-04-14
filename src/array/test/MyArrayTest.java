package array.test;

import static org.junit.jupiter.api.Assertions.*;
import static java.util.Arrays.binarySearch;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import static array.MyArray.*;

class MyArrayTest {
	int [] array = {10, 20, 30, 40, 100};
	@Test
	void testAddNumber() {
		int ar [] = {1,2,3};
		int res [] = {1,2,3,4};
		assertArrayEquals(res, addNumber(ar, 4));
	}

	@Test
	void testRemoveNumber() {
		int [] expNo10 = {20, 30, 40, 100};
		int [] expNo100 = {10, 20, 30, 40};
		int [] expNo30 = {10, 20, 40, 100};
		assertArrayEquals(expNo10, removeNumber(array, 0));
		assertArrayEquals(expNo100, removeNumber(array, 4));
		assertArrayEquals(expNo30, removeNumber(array, 2));
		assertArrayEquals(array, removeNumber(array, -2));
		assertArrayEquals(array, removeNumber(array, 5));
	}

	@Test
	void testInsertNumber() {
		int [] expInd0_1000 = {1000, 10, 20, 30, 40, 100};
		int [] expInd5_1000 = {10, 20, 30, 40, 100, 1000};
		int [] expInd2_1000 = {10, 20,  1000, 30, 40, 100};
		assertArrayEquals(expInd0_1000, insertNumber(array, 0, 1000));
		assertArrayEquals(expInd5_1000, insertNumber(array, 5, 1000));
		assertArrayEquals(expInd2_1000, insertNumber(array, 2, 1000));
		assertArrayEquals(array, insertNumber(array, -2, 1000));
		assertArrayEquals(array, insertNumber(array, 6, 1000));
	}
	@Test
	void testBinarySearchInt() {
	//Arrays.binarySearch(int[] array, int number);	
	//TODO
	//Write tests for standart method binarySearch of the class Arrays taking array of ints and int number
		
			assertEquals(0, binarySearch(array, 10));
			assertEquals(-1, binarySearch(array, 5));
			assertEquals(2, binarySearch(array, 30));
			assertEquals(-3, binarySearch(array, 25));
			assertEquals(4, binarySearch(array, 100));
			assertEquals(-6, binarySearch(array, 150));
			
	}
	

	@Test
	void testCopyOf() {
		int array[] = {1,2,3};
		int expected1 [] = {1, 2, 3};
		int expected2 [] = {1};
		int expected3 [] = {1,2,3,0,0,0};
		assertArrayEquals(expected1, Arrays.copyOf(array, array.length));
		assertArrayEquals(expected2, Arrays.copyOf(array, 1));
		assertArrayEquals(expected3, Arrays.copyOf(array, 6));
		 //Возвращает копию исходного массива, с указанной длиной. 
	}
	@Test
	void testArraycopy( ) {
	int array[] = {1,2,3};
	int expected[] = {5, 10, 1, 2, 20};
	int arrayDest [] = new int[5]; 
	int array1[]= {2 ,5,10};
	System.arraycopy(array, 0, arrayDest, 2, 2); 
	System.arraycopy(array1, 1, arrayDest, 0, 2);
	arrayDest[4]=20; 
	assertArrayEquals(expected	, arrayDest);


}
}