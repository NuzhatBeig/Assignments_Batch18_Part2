package methods.returnType;

public class Calculations {
	public int variableNumber(int a){
		return a;
	}
	
	public int add(int b, int c){
		int val = (b+c);
		return val;
		
	}
	
	//overloading the method
	public double add(int b, int c, int d){
		return (double) (b+c+d);
		
	}
	
    public String getName(String firstName, String lastName){
		
		return firstName+ " " + lastName;
	}
	
	//calling/invoking add method directly from doCalculation.here we need not to create an instance rte
	//since it belongs to the same class as add.
	public void doCalculation(int a ,int b , int c){
	 
	int finalValue = variableNumber(a)-add(b,c);
	 
    System.out.println(finalValue);
	 
	}
	public void doCalculation(int a ,int b , int c, int d){
	
		double finalValue = variableNumber(a)-add(b,c,d);
	 
	 System.out.println(finalValue);
		 
	}


}
