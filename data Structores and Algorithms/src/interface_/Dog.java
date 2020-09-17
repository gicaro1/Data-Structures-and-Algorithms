package interface_;

public class Dog implements Walking  {
	private String name ;
	private String  ownerName;
	private int Idchip;
	
	
//	CONSTRUCTOR 
	public Dog(String name, String ownerName, int idchip) {
		super();
		this.name = name;
		this.ownerName = ownerName;
		Idchip = idchip;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getOwnerName() {
		return ownerName;
	}


	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}


	public int getIdchip() {
		return Idchip;
	}


	public void setIdchip(int idchip) {
		Idchip = idchip;
	}


	@Override
	public String toString() {
		return "Dog [name=" + name + ", ownerName=" + ownerName + ", Idchip=" + Idchip + "]";
	}


	@Override
	public void walk() {
	System.out.println("here is the overrriden  method placed  into the interface ");
		
	}
	
	
	
	
	
	
	

}
