package com.comlumbushs.unit5;

public class Unit5Main {

	public static void main(String[] args) {
		Unit5_1_3ClassesReview classRev = new Unit5_1_3ClassesReview();
		classRev.setWeight(15);
		int weightMain = classRev.getWeight();
		
		System.out.println(weightMain);
		
		int sum =0;
		for(int k =1;k<=30;k=k+2) {
			sum+=k;
		}
		System.out.println(sum);
		
		
		
	}

}
