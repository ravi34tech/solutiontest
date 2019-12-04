package com.solutiontest.common.testproject.collection;

import java.util.ArrayList;
import java.util.List;

import com.solutiontest.common.testproject.model.Student;

public class StudentBuilder {

	public static List<Student> studentList(){
		List<Student> stuList = new ArrayList<>();
		
		for(int i=1; i<=10 ; i++) {
			stuList.add(new Student(i, "Ravi_"+i, "Kumar_"+i, "Andhara_"+i, "Vaagdevi_"+i, 10*i));
		}
		
		return stuList;
	}
}
