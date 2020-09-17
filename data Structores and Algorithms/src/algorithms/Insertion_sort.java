package algorithms;

import java.util.Arrays;

public class Insertion_sort {

	public static void main(String[] args) {
		
//		int []a = insertionSortMethod(new int[] {813, 45, 32, 22, 11, 78, 3, 5, 2 });
//		
//		for (int i = 0; i < a.length; i++) {
//			
//			System.out.println(a[i]);
//			
//		}

		int[] a = { 813, 45, 32, 22, 11, 78, 3, 5, 2 };
		insertionSortMethod(a);
		

		
	}

	public static int[] insertionSortMethod(int[] a) {

		for (int i = 1; i < a.length; i++) {
			
			
			int element = a[i]; // loop 1:  element is equal to 45 position '1'  a[1]

			int j = i - 1; //   loop1:  j is equal to 813  first  position  within array '0'

			while (j >= 0 && a[j] > element) { // j must be grater than 0 AND    a[j] = 813  > element = 45 if it's true get into the while loop

				a[j + 1] = a[j]; //  RE-ASSIGN  --> a[j + 1} correspond to  45   EQUAL TO  a[j] correspond to 813
				j--;   // j become -1  and the  condition  into the while J>=0   doesn't met  and get off of the loop 

			}
			
			a[j + 1] = element;  // a[i + j] correspond  to duplicate  813 = element which correspon to 45

		}
	System.out.println(Arrays.toString(a));
		return a;

	}

}
