package com.solutiontest.common.testproject;

public class TryCatchBlocks {

	
	public static void main(String[] args) {
		testTry();
	}
	
	public static int testTry() {
		System.out.println("Hai Try");
		int val = 0;
		String str = null;
		try {
			System.out.println("In try....");
			str.getClass();
			 val = 1; 
			return val;
		}catch (NullPointerException e) {
			val = 6;
			System.err.println("\n Error Catched.. : "+e.getMessage());
		}
		catch (Exception e) {
			val = 2;
			System.err.println("\n Error Catched..");
		}finally {
			try {
			//	val = 3;
				System.err.println("in try of finally..");
			}catch (Exception e) {
				val =4;
				System.err.println("Error Catched at finally..");
			}
		}
		System.out.println("Value is : "+val);
		return val;
		
		
	}
}
