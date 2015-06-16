package accessingFromDifferentPackage;

import methods.School.Student;
import methods.clients.Emp;

public class AccessInstvariablesFromDifferentPackage {
	
	static Student stud = new Student("Sam" , 1002, 5 , 65);
	
	public static void main(String[] args) {
		 Emp emp = new Emp("Steve",1002,65000,650);
			// Student stud = new Student("Sam" , 1002, 5 , 65);
			 System.out.println(stud.getHeight());
			System.out.println(emp.getSalary());
			System.out.println(emp.getName());
	}

}
