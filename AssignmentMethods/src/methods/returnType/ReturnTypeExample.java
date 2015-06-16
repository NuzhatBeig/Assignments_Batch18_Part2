package methods.returnType;
import methods.clients.Emp;

public class ReturnTypeExample {

	public static void main(String[] args) {
		ReturnTypeExample rte =  new ReturnTypeExample();
		Calculations calc = new Calculations();
		Emp emp1 = new Emp("Jack",1001,120000,1200);
		calc.doCalculation(15,4,5);
		calc.doCalculation(20, 6, 4, 3);
		String dou = calc.add(2,3) + " "; // converting int to string
		
		//using multiple messages
		
	  
	  System.out.println("Hi" + " " + calc.getName("Nuzhat", "Beig") + " " + "How are you");
		
	
		System.out.println(); 
		
	   System.out.println(emp1.getSalary());
	}



	}


