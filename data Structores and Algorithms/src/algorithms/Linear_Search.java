package algorithms;

// ALGORITHMS IS 0(n) BIG O  BECAUSE IT HAS GO THOUGHT ALL THE ELEMENTS WITHIN ARRAY 
public class Linear_Search {
	public static void main(String[] args) {

		int[] a = { 2, 4, 5, 7, 8, 9, 8 };

		linearMethod(a, 4);

	}

	public static int linearMethod(int[] a, int x) {
		// THE METHOD RETURNS THE POSITION OF THE NUMBER WHICH IS INTENTED TO FIND

		for (int i = 0; i < a.length; i++) {

			if (a[i] == x) {
				System.out.println("the number is: " + x +"  Then number is found at the position: "+i  );
				return i;
				// OPTIONAL RETURN X INSTEAD

			}
		}
		System.out.println("number is not found in the array ");
		// THE NUMBER -1 STANDS THAT EITHER ELEMENT IS FOUND INTO THE ARRAY 
		return -1;

	}

}
