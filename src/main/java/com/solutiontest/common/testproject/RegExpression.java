package com.solutiontest.common.testproject;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpression {
	private static String validSyslogRegex = "(.*)\\s*(%[0-9A-Za-z\\-_]+-[01234567]-+[0-9A-Za-z\\-_]+)\\s*:\\s*(.*)";
//	private static String validSyslogRegex = "\\s*(%[0-9A-Za-z\\-_]+[01234567]+[0-9A-Za-z\\-_]+)\\s*:\\s*(.*)";
	private static List<String> inValidsignatureList = new ArrayList<>();
	private static int validCount = 0;
	private static int TotalCount = 0;
	private static String signatureformat = "%[0-9A-Za-z\\-_]+-[01234567]-+[0-9A-Za-z\\-_*]";
	
	public static void main(String[] args) throws Exception {
		testRegx();
		
	/*	File file = new File("C:\\Users\\rmummadu\\Desktop\\Note_files\\Signature_Pattrens.txt"); 
	    Scanner sc = new Scanner(file); 
	    // we just need to use \\Z as delimiter 
	    sc.useDelimiter("\\Z"); 
	    while (sc.hasNextLine()) {
	        validateSyslogs(sc.nextLine());
	    }
	    
		System.out.println("Valid count : "+validCount);
		System.out.println("Total count : "+TotalCount);
		for (String string : inValidsignatureList) {
			System.out.println(string);
		}
	*/
		
	//	$scope.menonicPattern = "%?[0-9A-Za-z\\-_]+-[01234567]-+[0-9A-Za-z\\-_]+.*";
	}

	private static void testRegx() throws Exception {
	// 	String regx1 ="%?[0-9A-Za-z\\-_]+-[01234567]-+[0-9A-Za-z\\-_]+.*"; 
	//	String regx = "%[0-9A-Za-z\\.*-_]+\\-_[01234567]\\-_+[0-9A-Za-z\\-_]+.*";
		String regx = "%[a-zA-Z][a-zA-Z0-9*._ -\\\\]+-[0-7]-[a-zA-Z][a-zA-Z0-9+*._ -:\\\\]+";
		File file = new File("C:\\Users\\rmummadu\\Desktop\\Note_files\\Signature_Pattrens.txt"); 
	    Scanner sc = new Scanner(file); 
	  
	    // we just need to use \\Z as delimiter 
	    sc.useDelimiter("\\Z"); 
	    
	    List<String> validSignatureFormats = new ArrayList<String>();
	    List<String> inValidSignatureFormats = new ArrayList<String>();
	     System.out.println(regx);
		while (sc.hasNextLine()) {
	        String signature = sc.nextLine();
			if(Pattern.matches(regx,signature)){
				validSignatureFormats.add(signature);
			}else{
				inValidSignatureFormats.add(signature);
			}
		}
		
		System.out.println("Total Valid Signatures Count is : "+validSignatureFormats.size());
		System.out.println("Total IN-Valid Signatures Count is : "+inValidSignatureFormats.size());
		inValidSignatureFormats.forEach(System.out::println);
		
		
		StringBuffer sbf = new StringBuffer();
		
		for(String str : inValidSignatureFormats){
			sbf.append(str).append(",").append("\n");
		}
		Files.write(Paths.get("C:\\Users\\rmummadu\\Desktop\\Note_files\\invalid_Signature_Pattrens.csv"), sbf.toString().getBytes());
	}
	
	private static void validateSyslogs(String signature) {
		Pattern sysLogPattern = Pattern.compile(validSyslogRegex);
		String sampleMessage = "Oct 31 12:00:08 <<ipaddress>> RP/0/RP0/CPU0: "
				+ "lpts_pa[203]: "+signature+": 'pa_fm_handle_dl_timeouts: IFIB update of slice BGP6_FM to node 1000 timed out";
		Matcher matcher = sysLogPattern.matcher(sampleMessage);
		boolean val = matcher.matches();
		//System.out.println("is Valid syslog format : "+val);
		if(val) {
			//System.out.println("Group 0 : "+matcher.group(0));
		//	System.out.println("Group 1 : "+matcher.group(1));
			System.out.println(sampleMessage);
			validCount++;
		}else {
			inValidsignatureList.add(signature);
		}
		TotalCount++;
		/*System.out.println("Group 1 : "+matcher.group(1));
		System.out.println("Group 2 : "+matcher.group(2));
		System.out.println("Group 3 : "+matcher.group(3));*/
	}
}
