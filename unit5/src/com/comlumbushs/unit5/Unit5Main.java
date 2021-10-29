package com.comlumbushs.unit5;

public class Unit5Main {

	public static void main(String[] args) {
		Unit5_1_3ClassesReview classRev = new Unit5_1_3ClassesReview();
//		classRev.setWeight(15);
//		int weightMain = classRev.getWeight();
//		
//		System.out.println(weightMain);
		
		
		Unit5_4_5AccessorMutator methodRev = new Unit5_4_5AccessorMutator("Pepsi",67);
		//Set Name and Calories?
		//methodRev.setName("Coca Cola");
		//System.out.println(methodRev.getName());
		//methodRev.setCalories(45);
		//System.out.println(methodRev.getCalories());
		//Print out the name and calories?
		//System.out.println(methodRev);
		
		
		//Change name and calories
		
		
		Unit5_6_9MethodsScope scopeObj = new Unit5_6_9MethodsScope();
		
		scopeObj.setInt(5);
		System.out.println(scopeObj.getInt());
		
		Unit5_6_9MethodsScope scopeObj2 = new Unit5_6_9MethodsScope();
		scopeObj2.setInt(34);
		System.out.println(scopeObj2.getInt());
		
		Unit5_6_9MethodsScope.setStatInt(10);
		System.out.println(Unit5_6_9MethodsScope.getStatInt());
		
		
	}
	
	

}
