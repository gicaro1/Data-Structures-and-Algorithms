package recursion;

public class RecursionP {

	public static void main(String[] args) {

		// substractByOne(10);
//		int[] a = { 2, 3, 4, 5, 7, 8, 9 };
//		recursiveLinearSearch(a, 0, 3);
	

		//System.out.println(recursiveLinearSearch(new int[] { 2, 3, 4, 5, 7, 8, 9 }, 0, 3)); // CALLING FOR LINEAR SEARCH
		System.out.println(recursiveBinarySearch(new int[] { 2, 3, 4, 5, 7, 8, 9 }, 0,6, 8)); // CALLING FOR BINARY  SEARCH

	}

	public static void substractByOne(int n) {

		if (n > 0) {
			substractByOne(n - 1);

		}
		//System.out.println("call the method until the conditions is fulfilled " + n);

	}
	
	//************************** RECURSIVE LINEAR SEARCH ***********************************//

	public static int recursiveLinearSearch(int[] a, int i, int x) {

		if (i > a.length - 1) {

			return -1;
			
		} else if (a[i] == x) {
			return i;

		} else {
			System.out.println("index at: " + i);
			return recursiveLinearSearch(a, i + 1, x);
		}

	}
	//************************** RECURSIVE BINARY SEARCH ***********************************/
	
			//	P----------Q-------------R
	
	public static int recursiveBinarySearch( int []a, int p, int r, int x) {
		if(p > r) {
			return -1;
		}
		else {
			int q = (p+r)/2;
			
			if (a[q]==x) {
				return q;
				
			}else if( a[q]>x) {
				
				
				//								 a array      initial             last           value
				//											  positon '0'       position-1
				return recursiveBinarySearch(     a,          p,				 q-1,              x        ); //  SEARCH AT ON THE LEFT 
																		//q-1 = BECOMES TO BE 'R'
				
				
				
			}else {	//						array	   	intial			 last			values
				//										positon			position
				return recursiveBinarySearch( a, 		  q+1,			 r, 			x); // SEARCH ON THE RIGHTH
					//									q+1 becomes P
				
				
			}
		}
		
		
	}

}

























