
public class Unit5_1_3ClassesReview {
	
	//private (instance) and public variables
	private String name;
	private int height;
	private int weight;
	
	//default constructor 
	public Unit5_1_3ClassesReview() {
		name = "Tomas";
		height = 0;
		weight = 0;
	}
	
	//overloaded constructor 
	
	public Unit5_1_3ClassesReview(String a, int b, int c) {
		name = a;
		height = b;
		weight = c;
	}

    public Unit5_1_3ClassesReview(int ap, String ce, int tg) {
		name = ce;
		height = tg;
		weight = tg;
	}
	
	//Accessor method
	public String getName(String pass) {
        if(pass.equals("Applesauce")){
            return name;
        } else {
            return "wrong password";
        }
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