package comparator_;

import java.util.Comparator;


// Comparator is a interface
// this class must implements Comparator interface and Override the compare method
public class AgeComparator implements Comparator<Personas> {

	@Override
	// this method compares persons by age 
	public int compare(Personas per1, Personas per2) {

		if (per1.age == per2.age) {

			return 0; // are equals return 0 

		} else if (per1.age > per2.age) {
			
			return 1; // grater than  returns 1 
			

		} else {

			return -1; // less than retuns -1 
		}

	}

}
