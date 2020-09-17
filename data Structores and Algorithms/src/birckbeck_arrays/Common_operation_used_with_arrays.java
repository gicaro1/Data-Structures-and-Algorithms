package birckbeck_arrays;

import java.util.Arrays;

public class Common_operation_used_with_arrays {

	public static void main(String[] args) {

		int[] values = new int[11];
		fillArrays(values);
		sum(values);
		average(values);
		largest(values);
		smallest(values);
		findElement(values, 36);
		findElement2(values, 4);
		deleteItem(values, 100);

	}

	// AVERAGE STATIC METHOD
	private static void average(int[] values) {
		int count = 0;
		for (int i = 0; i < values.length; i++) {
			count = count + i;

		}

		int average = count / values.length;
		System.out.println("the total is : " + count);
		System.out.println(" the average is:" + average);

	}

	// FILL ARRAY STATIC METHOD
	public static void fillArrays(int[] values) {

		for (int i = 0; i < values.length; i++) {
			values[i] = i * i;

		}
		 System.out.println(Arrays.toString(values));

	}

	// SUM STATIC METHOD
	public static void sum(int[] values) {

		int count = 0;
		for (int element : values) {

			count = count + element;
		}
		// System.out.print(count);
	}
	// FIND THE MAXIMUN VALUE WITHIN ARRAY

	public static void largest(int[] values) {
		int largestValue = values[0];

		for (int i : values) {
			if (i > largestValue) {
				largestValue = i;

			}

		}
		System.out.println(largestValue);
	}

	// FIND THE MINIMUN VALUE WITHIN ARRAY
	public static void smallest(int[] values) {
		int smallestValue = values[0];

		for (int i : values) {
			if (i < smallestValue) {
				smallestValue = i;
			}
		}
		System.out.println(smallestValue);
	}

	// LINEAR SEARCH 1
	public static void findElement(int[] values, int element) {

		for (int i : values) {
			if (i == element) {
				System.out.println("the element is found: " + i);

			}
		}

	}
	// LINEAR SEARCH 2 BIRCKBECK SLIDES 
public static void  findElement2(int []values, int element ) {
	
		boolean found = false;
		int pos = 0;
		while (pos < values.length && !found) {
			if(values[pos] == element) {
				
				found = true ;
			}else {
				pos++;
			}
			
		}
		if (found) {
			System.out.println("Found at position: " + pos + " number: " + element);
			} else {
			System.out.println("Not found");
			}		

		
	}

// REMOVING ELEMENT FROM THE ARRAY 
public static void deleteItem ( int [] values, int element  ) {
	int currentSize = values.length;
	
	
	for (int i = 0; i < currentSize -1; i++) {
				
		values[i] = values[i + 1];// shift the element to the right 
	}
	
	currentSize--; // DELETE THE FIRST ELEMENT OF THE ARRAY VALUES[0]
	
	System.out.println("the modified array:"+Arrays.toString(values));
	System.out.println("the current size is:" + currentSize);
	
	// RESULT: the modified array:[1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 100]
	
	
	
	
}




















}
