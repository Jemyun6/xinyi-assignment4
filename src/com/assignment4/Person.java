package com.assignment4;


public class Person  {
	private Integer StudentID;
	private String name;
	private String courseName;
	private Integer grade;
 	
	
	@Override
	public String toString() {
		return StudentID + "," + name + "," + courseName + "," + grade
				;
	}



	public Person() {
		super();
	}



	public Person(Integer studentID, String name, String courseName, Integer grade) {
		super();
		StudentID = studentID;
		this.name = name;
		this.courseName = courseName;
		this.grade = grade;
	}



	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public Integer getStudentID() {
		return StudentID;
	}

	public void setStudentID(Integer studentID) {
		StudentID = studentID;
	}


 
	
	
	

	
    

}
