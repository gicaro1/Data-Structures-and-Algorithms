package birckbeck_arrays;

import java.util.Arrays;

public class DeleteArrayt {

	public static void main(String[] args) {
		
		
		String [] names = {"jhon", "Mary", "Nancy", "bob" };
		deleteItem(names, 1);
		

	}
	public static void deleteItem ( String [] names, int pos  ) {
		
		names[pos]= names[names.length-1];// HERE WE ASSIGN BOB TO MARY RESULT --> JOHN- BOB -NANCY -BOB
		
		String[] newNames =  new String[names.length-1];//  CREATE A NEW A ARRAY WITH THE SIZE OF THE ORIGINAL BUT WIHT ONE ELEMENT LESS		
		
		for (int i = 0; i < newNames.length; i++) {
			
			newNames[i] = names[i]; // COPY ELEMENTS INTO THE NEW ARRAY 
			
					
	
			
		}
		
		System.out.println("originalArray:"+Arrays.toString(names));
		 
		System.out.println("the modified array:"+Arrays.toString(newNames));
		
		
		/*
		 * -----> RESULTS <----- 
		 * originalArray:[john, bob, Nancy, bob] 
		 * the modified array:[john, bob, Nancy]
		 */
		
		
		
		
	}


}
