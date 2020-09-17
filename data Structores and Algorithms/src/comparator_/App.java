package comparator_;

import java.util.*;

/*	
 	A comparison function, which imposes a total ordering on some collection of objects.
	Comparators can be passed to a sort method (such as Collections.sort or Arrays.sort) 
	to allow precise control over the sort order. Comparators can also be used to control 
	the order of certain data structures (such as sorted sets or sorted maps), or to provide 
	an ordering for collections of objects that don't have a natural ordering.
*/

public class App {
	
	/*TIP - SHORTCUT 
	 * How to get Eclipse to move cursor across words on Ctrl+Alt+<arrow-key>?
	 */
	public static void main(String[] args) {
		
		Personas per1 = new Personas("Gio", "Cardenas", 39);
		Personas per2 = new Personas("Gio", "Cardenas", 2);


		
		List<Personas> listItems = new ArrayList <Personas>();
		
		listItems.add(per1);
		listItems.add(per2);

	
		
		/*
		 * collecrtions.sort receives two parameters one is the List where all the
		 * objects are stored and the second  the class AgeComparator.java
		 * its main functionality is compare to object and sort them 
		 */
		Collections.sort(listItems, new AgeComparator());
		
		
		for (Personas element : listItems) {
			System.out.println(element.name+ "  "+ element.age);
			
			
		}
		
		
		
	}

}
