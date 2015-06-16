package methods.School;

import methods.School.Student;

public class School {
public static void main(String[] args) {
		
		Student studOne = new Student("Jack", 1001, 3, 63);
		studOne.printStudentInfo();
		studOne.printStudentInfo("Hello");
		System.out.println(studOne.getName());
		System.out.println(studOne.getRollNumber());

	}
}
