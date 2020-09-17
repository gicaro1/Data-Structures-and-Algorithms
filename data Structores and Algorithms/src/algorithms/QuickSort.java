package algorithms;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {

		int[] inputArray = { 12, 3, 4, 56, 7, 78, 9, 68 };
		quickSort(inputArray, 0, inputArray.length - 1);
		System.out.println(Arrays.toString(inputArray));

	}

	private static void quickSort(int[] inputArray, int start, int end) {
		if (start < end) { // WHEN THE 'START' POSITION "OVERTAKEN" THE 'END' POSITION

			// THE PARTITION METHOD VALUE RETRIEVES THE PIVOT POSSITON USUALLY IN THE MIDDLE
			// OF THE ARRAY
			int pp = partition(inputArray, start, end);

			// RECURSIVE METHOD WHICH SORT THE ARRAY IN TWO SIDE 'RIGHT' AND 'LEFT' BASED ON
			// THE PIVOT NUMBER

			quickSort(inputArray, start, pp - 1);
			quickSort(inputArray, pp + 1, end);

		}

	}

	/*
	 * RETRIEVES THE CORRECT POSITON OF THE PIVOT WHERE ON ITS LEFT ALL THE NUMBERS
	 * ARE LESS THAN IT AND ON ITS RIGHT ALL THE NUMBER ARE GRATER THAN IT
	 */
	private static int partition(int[] inputArray, int start, int end) {

		int pivot = inputArray[end];// PIVOT IS THE LAST ELEMENT OF THE ARRAY
		int i = start - 1; // IN THE FIRST ITERATION 'I' STAR AT -1

		for (int j = start; j < end - 1; j++) {// 'end-1' UNTIL ONE POSITION BEFORE THE PIVOT

			if (inputArray[j] <= pivot) { // 'inputArray[j]'FIRST ELEMENT IN THE ARRAY LESS OR EQUAL TO THE LAS ELEMENT
											// 'pivot'

				i++;

				// WE ARE SWAPPING BELOW
				int ival = inputArray[i]; // inputArray[i] IS -1 EQUAL TO POSITON '0' SO THAT IT WAS INCREMENTED BY ONE
											// BEFORE 'i++'
				int jval = inputArray[j];
				inputArray[i] = jval;
				inputArray[j] = ival;

			}

		}

		// HERE --> THE PIVOT VALUE IS AT THE CORRECT SLOT

		int ival = inputArray[i + 1]; // AFTER THE LOOP ITERATION 'inputArray[4+1]' is equal to 78 index '4' is equal to 7 in the array
		inputArray[end] = ival;       // 'inputArray[end]' IS  '68' IS EQUAL TO '78' SWAPPING 
		inputArray[i + 1] = pivot;//   78 IS EQUAL IS THE CURRENT PIVOT 

		return i + 1; // RETURNS '78'
	}

}
