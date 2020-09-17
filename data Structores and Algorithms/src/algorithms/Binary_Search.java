package algorithms;

public class Binary_Search {

	public static void main(String[] args) {
		// MAIN REQUIEREMENTS-->THE ARRAY MUST BE SORTED ALREADY

		System.out.println(binaryMethod(new int[] { 2, 4, 5, 7, 8, 9, 10 }, 11));

	}

	public static int binaryMethod(int[] a, int x) {

		int r = a.length  - 1; // --> last position of the array 6th in case will be number '10'

		int p = 0; // --> first positon of the array in this case will be number '2'

		while (p <= r) {// as long as both variables dont avelap the condicion is true

			int q = (p + r) / 2; // --> divide the array in two taking a whole number in this case 7 index 3

			if (x < a[q]) { // --> if the required number is less than 7 or variable q
							// --> move 'r' one position before of the middle or 'q '
				r = q - 1;

			} else if (x > a[q]) {// --> if the require number is grater than the middle or 'q'
				p = q + 1; // --> move "P' one position after of the middle or q

			} else {
				return q; // --> if 'q' is in the middle

			}

		}

		return -1; // if anythins is returned

	}

}
