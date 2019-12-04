package com.solutiontest.common.testproject;

import java.security.SecureRandom;

public class GenerateRandom 
{ 

	public static void main(String args[]) 
	{ 
		// create instance of SecureRandom class 
		SecureRandom rand = new SecureRandom(); 

		// Generate random integers in range 0 to 999 
		int rand_int1 = rand.nextInt(1000); 
		int rand_int2 = rand.nextInt(1000); 
        double rand_long = rand.nextDouble();

		// Print random integers 
		System.out.println("Random Integers: " + rand_int1); 
		System.out.println("Random Integers: " + rand_int2); 
       System.out.println("Random Double : " + rand_long);
       System.out.println("Random Long round : " + Math.round(rand_long));
	} 
} 