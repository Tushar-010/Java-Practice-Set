/*********************************************************************************
* (The Course class) Rewrite the Course class in Listing 10.6. Use an ArrayList  *
* to replace an array to store students. Draw the new UML diagram for the class. *
* You should not change the original contract of the Course class (i.e., the     *
* definition of the constructors and methods should not be changed, but the      *
* private members may be changed.)                                               *
*********************************************************************************/


import java.util.ArrayList;

public class TestCourse {

	public static void main(String[] args) {
		
		Course c1 = new Course("Java");
		Course c2 = new Course("Python");
		
		c1.addStudent("Tushar");
		c1.addStudent("Jitesh");
		c1.addStudent("Karan");
		
		c2.addStudent("Nitin");
		c2.addStudent("Sahil");
		c2.addStudent("Manali");
		c2.addStudent("Simran");
		
		ArrayList<String> student = c1.Students();
		for(int i=0;i<student.size();i++) {
			System.out.println(student.get(i));
		}
	
    }

}