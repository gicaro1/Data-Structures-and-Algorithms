package comparable;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;



public class Main {

	public static void main(String[] args) {
		
		
		Person per1= new Person("Marco","Danitti",22);
		Person per2= new Person("Mar","tti",2);
		Person per3= new Person("Marc","ti",12);
		Person per4= new Person("Mirti","itti",21);
		Person per5= new Person("Marticos","itti",3);
		Person per6= new Person("Micorls","nitti",8);
		
		List<Person> listItems = new ArrayList<Person>();
		
		
		listItems.add(per1);
		listItems.add(per2);
		listItems.add(per3);
		listItems.add(per4);
		listItems.add(per5);
		listItems.add(per6);
		
		
	
		//System.out.println("originalArray:"+Arrays.toString(listItems));
		
	Collections.sort(listItems);  // ' HERE "COLLECTIONS.SORT" --> ORDER THE ITEMS THAT ARE INSIDE OF THE listItems ArrayList 
		
		
		for (Person element : listItems) {
			
		System.out.println(element.getAge() + " " + element.getName());
		
	
		/*
		 * BOTH PRINT-STATEMENT SHOW THE SAME RESULT THE ONLY DIFFERENCE IS THAT THE BELOW ONE DOESN'T NEED  'GETTERS' 
		 * System.out.print(element.age+ " ");
		 * System.out.print(element.name);
		 * System.out.print(element.surname);
		 * System.out.println();
		 */
			
			
		}
		

	}

}
