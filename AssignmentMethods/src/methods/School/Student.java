package methods.School;

public class Student {
	private String name;
	private int rollNumber;
	private int grade;
	private int height;
	 
	public String getName(){
		return name;
	}

	public int getRollNumber(){
		return  rollNumber;
		
	}

	public int getGrade(){
		return grade;
	}

	 public int getHeight(){
		 return height;
		 
	 }
	  // creating a constructor
	 
	 public Student(String name, int rollNumber){
		 this.name = name;
		 this.rollNumber = rollNumber;
	 }
	 
	 //Overloading the constructor
	 public Student(String assignedName, int assignedRollNumber, int assignedGrade){
		 this(assignedName, assignedRollNumber);
		 grade = assignedGrade;
		 
	 }
		 
		 
	 public Student(String assignedName, int assignedRollNumber, int assignedGrade , int assignedHeight){
		 this(assignedName, assignedRollNumber , assignedGrade);
		 height = assignedHeight;
	 }
			
	 // creating a Method
	 
	 public void printStudentInfo(){
		 System.out.println(getInfo());
	 }
	 
	 //Method Overloading
	 
	 public void printStudentInfo(String message){
		 System.out.println(message + " " +getInfo());
	 }
	 
	 private String getInfo(){
		 return this.name+ " " + " " + this.rollNumber + " " + this.grade ;
	 }
	 

}
