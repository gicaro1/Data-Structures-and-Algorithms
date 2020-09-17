package interface_;

import java.util.ArrayList;



public class App {

	public static void main(String[] args) {
		
		Dog newDog = new Dog("poppy ", "Michael", 12345);
		
		ArrayList<Dog> DogHouse = new ArrayList<Dog>();
		
		DogHouse.add(newDog);
		newDog.walk();
		
		System.out.print(DogHouse);

	}

}