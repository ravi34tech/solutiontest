package com.solutiontest.common.testproject.model;


public class Student {

	private int id;
	private String firstName;
	private String lastName;
	private String state;
	private long marks;
	private String collageName;
	
	public Student() {

	}

	public Student(int id, String firstName, String lastName, String state, String collageName, long marks) {
		this.id = id ;
		this.firstName = firstName;
		this.lastName = lastName;
		this.state = state;
		this.collageName = collageName;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getMarks() {
		return marks;
	}

	public void setMarks(long marks) {
		this.marks = marks;
	}

	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	
	static final String SEPERATOR = ", ";
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[ ");
		sb.append("id:"+this.id).append(SEPERATOR)
		  .append("firstName:"+this.firstName).append(SEPERATOR)
		  .append("lastName:"+this.lastName).append(SEPERATOR)
		  .append("state:"+this.state).append(SEPERATOR)
		  .append("collageName:"+this.collageName).append(SEPERATOR)
		  .append("marks:"+this.marks).append(" ]");
		
		return sb.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((collageName == null) ? 0 : collageName.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + (int) (marks ^ (marks >>> 32));
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (collageName == null) {
			if (other.collageName != null)
				return false;
		} else if (!collageName.equals(other.collageName)) {
			return false;
		}
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName)) {
			return false;
		}
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName)) {
			return false;
		}
		if (marks != other.marks)
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state)) {
			return false;
		}
		return true;
	}
	
}
