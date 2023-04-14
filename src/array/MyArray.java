package array;

import java.util.Arrays;

public class MyArray {
	public static int [] addNumber (int[] array, int num) {
		int[] ar = Arrays.copyOf(array, array.length+1);
		ar[array.length] = num;
		return ar;
		
	}
	
	public static int[] removeNumber (int[] array, int index) {
		//TODO
		//remove element at a given index for right idnex value [0 - array.length-1] and returns new array with no the removed one
		//returns the source array for a wrong index value (less than 0 or greater array.length-1)
		//using the standart method System.arraycopy
		int [] result = array;
		if (index > -1 && index < array.length) {
			result = new int[array.length - 1];
			System.arraycopy(array, 0, result, 0, index);
			System.arraycopy(array, index + 1, result, index, result.length - index);
		}
		return result;
	}

	public static int [] insertNumber(int[] array, int index, int num) {
		//TODO
		//inserts a given num at a given index for right value of the index [0 - array.length] and returns new array with the inserted number
		//returns the source array for a wrong index value (less than 0 or greater array.length)
		//using the standart method System.arraycopy
		int [] result = array;
		if (index > -1 && index <= array.length) {
			result = new int[array.length + 1];
			System.arraycopy(array, 0, result, 0, index);
			System.arraycopy(array, index, result, index + 1, array.length - index);
			result[index] = num;
		}
		return result;
	}
	 public static int [] insertNumberSorted (int [] array, int num) {
		 int index = Arrays.binarySearch(array, num);
		 if (index < 0 ) {
			 index = -index -1;
		 }
		 return insertNumber(array, index, num);
	 }
}

