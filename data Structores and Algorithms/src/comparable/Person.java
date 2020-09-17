package comparable;

public class Person implements Comparable<Person> {
	
	/*
	 * main difference is that class person must implement the comparable interface
	 * and Override its method "  COMPARE TO "
	 */

		
		String name;
		String surname;
		int age;
		
		
		public Person(String name, String surname, int age) {
			super();
			this.name = name;
			this.surname = surname;
			this.age = age;
		}
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSurname() {
			return surname;
		}
		public void setSurname(String surname) {
			this.surname = surname;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		
		


		@Override
		public String toString() {
			return "Person [name=" + name + ", surname=" + surname + ", age=" + age + "]";
		}


		@Override
		public int compareTo(Person per) {
			
			
	
			return  this.age - per.getAge(); // this retrieve the age sorted in descending order 2 --> 22
			
		//	return  per.getAge() - this.age ; // this retrieve the age sorted in ascending order 22 ---> 2
			
		}




}
