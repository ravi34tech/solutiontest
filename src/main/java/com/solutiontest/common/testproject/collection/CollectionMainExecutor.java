package com.solutiontest.common.testproject.collection;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.solutiontest.common.testproject.model.Student;

public class CollectionMainExecutor {
	
	public static void main(String[] args) {
		
		List<Student> list = StudentBuilder.studentList();
		
		Predicate<Student> marksPredicate = val -> (val.getMarks() >= 50);
		
		Predicate<Student> stuPred = stu -> (Integer.parseInt(stu.getFirstName().split("_")[1]) % 2 == 0);
		
//		System.err.println("---------------Name digit is even -----------------------------");
		List<Student> filterList = list.stream().filter(stuPred).collect(Collectors.toList());
		printStudent(filterList);
		System.out.println("Filter count : "+filterList.size());
		System.err.println("---------------Marks >= 50-----------------------------");
		list.stream().filter(marksPredicate).collect(Collectors.toList()).forEach(System.out::println);
		System.err.println("--------------- Sorting-----------------------------");
		sorting() ;
	}
	
	private static void printStudent(List<Student> list) {
	//	list.forEach(e -> System.out.println(e));
		list.forEach(System.out::println);
	} 
	
	private static long charCountInString(String str, char ch) {
		return str.chars().filter(c -> c == ch).count();
	}

	
	private static void sorting() {
		List<Student> list = StudentBuilder.studentList();
		
//		list.sort((Student s1, Student s2)-> s1.getFirstName().compareTo(s2.getFirstName()));  // ASC
//		list.sort((Student s1, Student s2)-> s2.getFirstName().compareTo(s1.getFirstName()));   // DEC
		
		
		
		list.sort(Comparator.comparing(Student :: getFirstName).reversed());
		list.forEach(System.out::println);
		
	//	list.sort((s1,s2)->	s1.getFirstName().compareTo(s2.getFirstName())); 
		
	}
}
