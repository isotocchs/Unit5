
public class Unit5_1_3ClassesReview {
	
	//private (instance) and public variables
	private String name;
	private int height;
	private int weight;
	
	//default constructor 
	public Unit5_1_3ClassesReview() {
		name = "";
		height = 0;
		weight = 0;
	}
	
	//overloaded constructor 
	
	public Unit5_1_3ClassesReview(String a, int b, int c) {
		name = a;
		height = b;
		weight = c;
	}
	
	//Accessor method
	public String getName() {
		return name;
	}
	public int getWeight() {
		return weight;
	}
	
	//private method
	private int getHeight() {
		return height;
	}
	
	//mutator methods
	public void setWeight(int c) {
		weight = c;
		apples();
	}
	
	//Encapsulation
	
	public void apples() {
		System.out.println("Apples");
	}
	

}