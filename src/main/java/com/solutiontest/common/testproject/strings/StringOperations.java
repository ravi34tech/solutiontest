package com.solutiontest.common.testproject.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringOperations {

	public static void main(String[] args) {
		stringContains();
		StringOperations op = new StringOperations();
		op.call(null);
		
		op.stringBuilder();
	}
	
	public static void stringContains() {
		
		Map<String,String> map = new HashMap<>();
		map.put("p1-emergency", "1");
		map.put("p2-critical", "2");
		map.put("p3-major", "3");
		map.put("p4-minor", "4");
		map.put("p5-warning", "5");
		
		String compStr = "minor";
		String comparedValue = null;
		
		for(Entry<String, String> entry : map.entrySet()) {
			//System.out.println("String Contains : "+entry.getKey().contains(compStr));
			if(entry.getKey().contains(compStr)) {
				comparedValue = entry.getValue();
				break;
			}
		}
		System.out.println("Compared return value is : "+comparedValue);
	/*	String s1 = "Hello";
		s1.concat(" World");
		System.out.println(s1);
		*/
		String s2 = new String("Ravi ");
		s2.concat(" World....");
		System.out.println(s2);
		
		

	}
	
/*	private void call(Student s) {
		System.out.println("Student...");
	}
	*/
	private void call(String s) {
		System.out.println("String.....");
	}
	
	private void call(Object o) {
		System.out.println("Object");
	}
	
	private void stringBuilder() {
		StringBuilder sb1 = new StringBuilder("Hello "); 
		StringBuilder sb2 = sb1;
		sb2.append("World...");
		
		System.out.println("sb1 value is : "+sb1);
		System.out.println("sb2 value is : "+sb2);
		
		System.out.println(sb1.hashCode()+" - "+sb2.hashCode());
		
		
		double d = -1.0/0.0;
		System.out.println("d values is : "+d);
	}
}
