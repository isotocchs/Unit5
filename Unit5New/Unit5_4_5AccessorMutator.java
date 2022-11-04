
public class Unit5_4_5AccessorMutator {
	
	//private (instance) variables
		private String name;
		private int calories;
		
		
		//default constructor 
		public Unit5_4_5AccessorMutator() {
			name = "";
			calories = 0;
			
		}
		
		//overloaded constructor 
		
		public Unit5_4_5AccessorMutator(String a, int b) {
			name = a;
			calories = b;
			
		}
		
		//Accessor method - must be public - known as get methods
		public String getName() {
			return name;
		}
		public int getCalories() {
			return calories;
		}
		
			
		//mutator methods - must be public - known as set methods
		public void setName(String b) {
			name = b;
		}
		
		public void setCalories(int c) {
			calories = c;
		}
		
		//Variation of mutator method.
		public void addCalorie() {
			//calories=calories+1;
			calories++;
		}
		
		
		
		
		
		//toString Method - called when you try to print the object.
		//header must always be the same - public String toString()
		
		public String toString() {
			return "Product: "+name+"\nCalories: "+calories;
		}
		
		

}