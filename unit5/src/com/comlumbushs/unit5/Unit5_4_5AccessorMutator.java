package com.comlumbushs.unit5;

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
		
		public Unit5_4_5AccessorMutator(String a, int b, int c) {
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
		
		

}
