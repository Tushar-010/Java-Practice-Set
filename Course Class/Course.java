/**************************************
*               Course                *
*-------------------------------------*
* -courseName: String                 *
* -students: ArrayList<String>        *
* -numberOfStudents: int              *
* +Course(courseName: String)         *
* +getCourseName(): String            *
* +addStudent(student: String): void  *
* +dropStudent(student: String): void *
* +getStudents(): String[]            *
* +getNumberOfStudents(): int         *
**************************************/


import java.util.ArrayList;

public class Course {

	private String courseName;
	private ArrayList<String> student;
	private int noOfStudents;
	
	Course(String courseName) {
		this.courseName = courseName;
		student = new ArrayList<>();
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void addStudent(String name) {
		student.add(name);
		noOfStudents++;
	}
	
	public void dropStudent(String name) {
		student.remove(name);
		noOfStudents--;
	}
	
	public ArrayList<String> Students() {
		return student;
	}
	
	public int getNoOfStudent() {
		return noOfStudents;
	}

}