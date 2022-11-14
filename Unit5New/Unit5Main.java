
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Unit5Main {

	public static void main(String[] args) {
		Unit5_1_3ClassesReview classRev = new Unit5_1_3ClassesReview();
        System.out.println("-----------------------");

        String nameTest = classRev.getName("Applesauce");
        // System.out.println(nameTest);
        // classRev.setWeight(45);
        // System.out.println(classRev.getWeight());
        

// 		classRev.setWeight(15);
// 		int weightMain = classRev.getWeight();
// //		
// 		System.out.println(weightMain);
		
		
		Unit5_4_5AccessorMutator methodRev = new Unit5_4_5AccessorMutator("Pepsi",67);
		//Set Name and Calories?
		//methodRev.setName("Coca Cola");
		//System.out.println(methodRev.getName());
		//methodRev.setCalories(45);
		//System.out.println(methodRev.getCalories());
		//Print out the name and calories?
		//System.out.println(methodRev);
		
		
		//Change name and calories
		dogClass dog1 = new dogClass(3, "Bob", 45, 12);
//		//Not Static
		Unit5_6_9MethodsScope scopeObj = new Unit5_6_9MethodsScope("Something", 5);
//		//call non static methods from the object
		scopeObj.setInt(5);
		System.out.println(scopeObj.getString(dog1));
//		
		// System.out.println(scopeObj.getStatInt());

//		Unit5_6_9MethodsScope scopeObj2 = new Unit5_6_9MethodsScope();
//		scopeObj2.setInt(34);
//		System.out.println(scopeObj2.getInt());
//		
		// dogClass dog2 = new dogClass(45, "tim", 6, 67);
		// System.out.println(dogClass.getSomething(5,6));

		// dogClass dog1 = new dogClass(3, "Bob", 45, 12);

		// System.out.println(dogClass.getSomething(6,7));

//		
//		//Static - called from the class
//		Unit5_6_9MethodsScope.setStatInt(45);
//		
//		
//		System.out.println(Unit5_6_9MethodsScope.getStatInt());
		
		

		

		 /** Returns the number of leap years between year1 and year2, inclusive.
		  * Precondition: 0 <= year1 <= year2
		 */
		 

		 /** Returns true if year is a leap year and false otherwise. */
		 

		 String apple = "Apple";
		//  System.out.println(apple.indexOf("p",2));
		

		 //int answer = numberOfLeapYears(2000, 2050);
	     //System.out.println("Your answer should be 13: " + answer);
	
         System.out.println("-----------------------");



	}
	
	// public static int numberOfLeapYears(int year1, int year2)
	//  {
	// 	int numLeapYears = 0;
	//    for(int i = year1;i<=year2;i++) {
	// 	   if(isLeapYear(i)) {
	// 		   numLeapYears++;
	// 	   }
	//    }
	//    return numLeapYears;
	//  }
	
	// private static boolean isLeapYear(int year)
	//  {
	//      return new GregorianCalendar().isLeapYear(year);
	//  }

     

}