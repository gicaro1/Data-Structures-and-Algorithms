package merge_sort_;

public class App {
	
	public static void main(String[] args) {
		
		 int [] inputArray = {9,7,5,4,2,45};
		 MergeSort sorter= new MergeSort();
		 
	
		 sorter.sort(inputArray);
		 
		 for (int i = 0; i < inputArray.length; i++) {
			 System.out.println(inputArray[i]);
			
		}
		
		
		
		
	}
	

	
	

}
