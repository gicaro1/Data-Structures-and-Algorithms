package birckbeck_arrays;

import java.util.Arrays;

public class InsertIntoArray {

	public static void main(String[] args) {
		//int[] a = new int[7];
		 int [] a = {2, 4, 6, 8, 10, };
		 insertItem (a, 4, 100);

	}

	public static void insertItem(int [] a, int pos, int element) {

		int[] b = new int[a.length + 1];
		
		 

	

	
		b[pos] =  element;

		System.out.println("originalrray:" + Arrays.toString(a));

		System.out.println("the modified array:" + Arrays.toString(b));


	}

}
