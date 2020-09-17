package merge_sort_;





public class MergeSort {

	public void sort(int[] inputArray) {
		sort(inputArray, 0, inputArray.length - 1);

	}

	public static void sort(int[] inputArray, int star, int  end) {

		if (end <= star) {
			return;

		}

		int mid = (star + end) / 2;
		sort(inputArray, star,mid); // sort method is executed until the  the condition end <= star doesn't met 
		sort(inputArray,mid + 1, end);
		merge(inputArray, star,mid, end);
	}
	

	private static void merge(int[] inputArray, int star, int mid, int end) {

		// <--'P' = 0 ------------------'Q' = (p+q)/2 -------------------'R' =
		// a.lenght-1-->

		int[] tempArray = new int[end - star + 1]; // calculate the number of slot that the old array has

		int leftSlot = star;
		int rightSlot =mid + 1;
		int k = 0;
		/*
		* when the leftSlot position exceeds 'mid' means that left part is already
	    * sorted same for rightSlot <= end means that the right array is already sorted
		*/
		while (leftSlot <= mid && rightSlot <= end) {
			
			if (inputArray[leftSlot] < inputArray[rightSlot]) {
				/*
				 * compare the index of both array left and right if the left number is less
				 * than the right one the condition meets and the number place within
				 *  imputArray[leftSlot] is stored into the tempArray[k] and leftSlot is incremented by 1
				 * 'leftSlot++'
				 */

				tempArray[k] = inputArray[leftSlot];
				leftSlot = leftSlot + 1;

			} else {
				/*
				 * if the number store into the inputArray[leftSlot] LEFT ARRAY is grater than
				 * the number store in the inputArray[leftSlot] --> RIGHT ARRAY the conditions
				 * met and the the number stored within the inputArray[rightSlot] is store into
				 * the tempArray[k]
				 */
				tempArray[k] = inputArray[rightSlot];
				rightSlot = rightSlot + 1;

			}
			k++;
			

		}
		
		/*
		 * WHEN IT GET'S TO HERE, THAT MEANS THE ABOVE LOOP HAS COMPLETED SO BOTH THE
		 * RIGHT AND THE LEFT SIDE OF THE SUB-ARRAY CAN BE CONSIDERED SORTED
		 */
	

		if (leftSlot <= mid) { // consider the right side done being sorted. left must be sorted already 
			while (leftSlot <= mid) {
				tempArray[k] = inputArray[leftSlot];
				leftSlot++;
				k++;
			}

		} else if (rightSlot <= end) {
			
			while (rightSlot <= end) {
				tempArray[k] = inputArray[rightSlot];
				rightSlot++;
				k++;

			}

		}
		for (int i = 0; i < tempArray.length; i++) {
			inputArray[star+i] = tempArray[i];
			
		}

	}

}
