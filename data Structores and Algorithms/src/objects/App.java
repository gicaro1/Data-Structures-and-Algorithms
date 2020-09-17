package objects;

public class App {

	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle(1.0,2.0);
		
		
	
		 double x = rec.getHeight();
		 System.out.println(x);
		 
		 //double x = r.height;
		 // ERROR because height is private in class Rectangle

	}

}
