package basics;

import methods.School.Student;

public class VariablesExample {
    
	public static void main(String[] args) {
		Student sam = new Student("Sam",1001);
		Student ryan = new Student("Ryan",1002);
		Student mary = new Student("Mary",1003);
		Student bob = new Student("Bob",1004);
		System.out.println(Student.count);//we can use count directly since it is a class level
		                                 //variable and dont need to create an instance
			
		Student.callMe();// we dont need to create an instance since it is a class level variable
	}
	
	
 
}
