
public class Unit5_6_9MethodsScope {
	
	//Method Header
	
	//1. Access Level - public or private
	//2. Ownership - static or not - static = class owns the method, 
	//							   - not static = object instance owns the method
	//3. Return type - if the method returns anything you have to specify the type
	//					void if nothing is returned
	//4. Identifier - method name - should be meaningful as to what the method does
	//5. Parameter list - what the method takes in if anything.
	
	public boolean methodID(String parameter, int apple, boolean someth) {
		return parameter.equals("Apple");
	}
	

	// Static methods - they belong to the class not the object
	//				  - do not have access to the instance variables because those 
	//						belong to the object
	//				  - only have access to static variables
	// 				  - does not have access to 'this' reference
	
	private String name;
	private int age;
	private static int classInt = 1;
	
	public void setString(String a) {
		name=a;
	}
	
	public void setInt(int b) {
		age=b;
	}

	public int getString(dogClass some) {
		return some.getAge();
	}
//	
	public int getInt() {
		return age;
	}
	
	public static int getStatInt() {
		return classInt;
	}
	
	public static void setStatInt(int c) {
		classInt=c;
	}
	
	//this keyword -refers to the current object using the method or constructor.
	
	//constructor example
	public Unit5_6_9MethodsScope(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//call a method
	public void addOne() {
		
		String addedOne = this.name;
		
	}
	
	
	
	
	

}