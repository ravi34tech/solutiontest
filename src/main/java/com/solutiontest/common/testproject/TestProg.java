package com.solutiontest.common.testproject;

import java.util.Date;

public class TestProg {


	private static void sum(){
		// 1 to 99 sum
		// n* (n+1) / 2 ------------- sum of natural numbers.
		int sum = 99 * (99+1)/2;
		System.out.println(sum);
	// 	sum = sum-5;
		for(int i=1;i<100 ;i ++){
			sum = sum-i;
		}
		System.out.println("missing : "+sum);
	}
	
	 // Function to ind missing number
    static int getMissingNo (int a[]) {
        int i, total;
        int len = a.length + 1; 
        // 1 added for length because in array missing number is not there so 1 added for length.
        total  = (len)*(len+1)/2;   
        for ( i = 0; i< a.length ; i++){
        	total = total - a[i];
        }
        return total;
    }
      
    /* program to test above function */
    public static void sum2(String args[]) {
        int a[] = {1,2,4,5,6};
        int miss = getMissingNo(a);
        System.out.println(miss);   
    }
    
    public static void main(String[] args) {
		Long ii = 400l;
    	Integer i = 3;
    	Date d1 = new Date();
    	
    	for(int j =0; j < 100000000 ; j++) {
    		
    	}
    	
    	String ss = i.toString();
    	System.out.println("int valu is :"+ss);
    	System.out.println("Long value is :"+Integer.parseInt(ii.toString()));
    	Date d2 = new Date();
    	
    	Long time = d2.getTime() - d1.getTime();
    	System.out.println("Time Long is  : "+time);
    	System.out.println("Time is now : "+Integer.parseInt(time.toString()));
    	
    	Double dei = Math.ceil(ii/i);
    	System.out.println("Double vlaue : "+dei);
    	System.out.println("Integer vlaue : "+dei.intValue());
    	
	}

}
