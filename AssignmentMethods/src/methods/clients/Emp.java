package methods.clients;

public class Emp {
	public String name;
	private int emp_id;//I don't want this to be public but how do I access it from a subpackage then?
	private int salary;
	private int bonus;
	private String designation;
	private String ssn;//I tried to make it long but it didn't work?
	private int age;
	
	
	// to access the name if encapsulated.we use get method
	
	public String getName(){
		return name;
	}
	
	public int getEmp_id(){
		
		return emp_id;
	}
	
	public int getSalary(){
		return salary;	

	}
	
	public int getBonus(){
		return bonus;
	
	}

	public int getGrossSalary(){
		return salary + bonus;
	}
	
    //create a constructor
	
	public Emp(String name,int emp_id){
		this.name = name;
		this.emp_id = emp_id;
		
	}
	
	public Emp(String assignedName,int assignedEmp_id,int assignedSalary){
		this(assignedName,assignedEmp_id);
		salary = assignedSalary;
		
		
	}
	
	public Emp(String name,int emp_id,int salary ,int bonus){
		this(name,emp_id,salary);
		this.bonus = bonus;
	}
	
	public Emp(String name,int emp_id,int salary, int bonus, String designation){
		this(name,emp_id,salary,bonus);
		this.designation = designation;
		
	}
	
	/*public Employee(String assignedName,int assignedEmployee_id, 
			int assignedSalary,int assignedBonus, String assignedDesignation){
		this(assignedName,assignedEmployee_id,assignedSalary,saaignedBonus);
		designation = assignedDesignation;
		
	}*/
	public Emp(String name,int emp_id,int salary, int bonus ,String designation , String ssn, int age){
		this(name,emp_id,salary,bonus,designation);
		this.ssn= ssn;	
		this.age = age;
		
		}
	
	public void printEmpInfo(){
	//	System.out.println(this.name +" " +emp_id + " " + salary);
		System.out.println(getInfo());
		
	}
	
	//adding a message to method-overloading a method
	public void printEmpInfo(String message){
		//System.out.println(message + " " + this.name + " " + this.emp_id + " " + salary);
		System.out.println(message + " " + getInfo());
		
	}
	
	public String getInfo() {
		return this.name +" " + emp_id + " " + salary + " " + bonus;
		
	}
	
	public void grossSalary(String message){
		System.out.println(message + " " + getName() + " " + getGrossSalary());
		
		
	}
	

}
