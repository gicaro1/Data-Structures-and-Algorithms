package algorithms;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
	int [] a = { 3, 2, 7, 4, 23, 67, 1 };
	sortElementBubble(a);
		

	}

	public static int[] sortElementBubble(int[] a) {
		

		for (int i = 0; i < a.length - 1; i++) { // ---> a.length-1 doesn't need to the last element so that before last  element made the comparison before 
			int minimum = i;
		
			for (int j = i + 1; j < a.length; j++) {
					
				if (a[j] < a[minimum]) {
					minimum = j; // ---> this condition assign el minimum value to the variable MINIMUM  if the next values is grater than the current value 
								// ---> once all the comparison between all the element is finish 
								//---> the loop will star going through from the second element
					
				}

			}
			//---> when the inner loop is finish the minimum value for the first loop is catch it  and then must be assign to the first position into the array
			// ---first loop analysis
			int temp = a[i]; //  I DONT UNDERSTAND THIS PART REVIEW IT 
			
			a[i] = a[minimum];//  
			
			a[minimum] = temp; // 
		

		}
		System.out.println("originalArray:"+Arrays.toString(a));
		return a;

	}

}
