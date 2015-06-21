package callbyexample;

import methods.School.Student;

public class CallByExample {

	public static void main(String[] args) {
		CallByExample cbe = new CallByExample();
		cbe.print(3); //...1
		Student stud = new Student("Sam", 102);//....2...4
		stud.setGrade(4);//..4
		System.out.println("Before 1 :" + stud.getGrade());//...4
		
		cbe.printStudentInfo(stud);//...4
		System.out.println("After 1 : " + stud.getGrade());//...4
	//	cbe.printStudentInfo(stud);	//....2
		int val = 3;//...3
		cbe.printval(val);//....3
		System.out.println("Final :" + " " + val);//...3 for primitives types, final value is same as initial
		
	}
	
	
	// call by primitive....1
	public void print(int a){
		System.out.println(a);
	}
	
	//call by reference 
	
	/*public void printStudentInfo(Student stud){
		System.out.println(stud.getName() + " " + stud.getRollNumber() );//....2
	}
	*/
	public void printval(int val){
		System.out.println("Before :" +" " + val);
		val = 10;
		System.out.println("After :" +" " +val);
	}
	
	//passing on a reference, changes made will be reflected unlike primitives....4
	public void printStudentInfo(Student stud){
		System.out.println("Before :" + stud.getGrade());
		stud.setGrade(5);
		
	}
	
}


