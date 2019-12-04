package com.solutiontest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        isSeverityField("ASDHASID");
        System.out.println("================================");
        isSeverityField("1");
    }
    
    private static boolean isSeverityField(String searchTerm) {
		boolean isSeverity = false;
		try {
			Integer.parseInt(searchTerm);
			System.out.println("Search term {} is a severity field. so we are going to filtering based on severity : "+searchTerm);
			isSeverity = true;
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Search term {} is not a severity field. "+searchTerm);
		}
		
		return isSeverity;
	}
}
