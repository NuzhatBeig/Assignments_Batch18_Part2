package basics;

 enum Months{
	JAN(1), FEB(2), MAR(3) , APRIL(4);
	
	public int value ;
	
   Months(int value) {
		
		this.value = value;
		
	}
	
	public int getValue(){
		return this.value;
	}
	
	
}
 
 enum Coffee {
	 SMALL(300), MEDIUM(400),TALL(500);
	 
	 public int value; //declaring a variable
	 
	 Coffee (int value){ // creating a constructor
	 this.value = value;
	 
	 }
	 public int getValue(){  // creating a method
		 return this.value;
	 }
 }
 
 
public class EnumExample {
	public static void main(String[] args) {
		

		
		EnumExample.printMonthNamesWithIndex(1);
		
		EnumExample.printMonthNamesWithIndex(4);//can misuse it. will show no error but wont print
        EnumExample.printMonthNamesWithEnum(Months.JAN);
        EnumExample.printMonthNamesWithEnum(Months.FEB);
        
       // EnumExample.printMonthNamesWithEnum(Months.JUNE);//cant misuse it
     //   EnumExample.orderCoffeeType(Coffee.SMALL);
			EnumExample ee = new EnumExample();
			//ee.orderCoffee(Coffee.TALL);
			ee.orderCoffee(Coffee.SMALL);
	}
	
	public static void printMonthNamesWithEnum(Months month){
		if(month ==Months.JAN) {
			System.out.println("January . so my lucky number is " + (78 + month.getValue()));
		}
		else if (month == Months.FEB) {
			System.out.println("Feb. so my lucky number is " + (78 + month.getValue()));
		}
	}
public static void printMonthNamesWithIndex(int index){
	if(index == 1) {
		System.out.println("January.so my lucky number is " + (15 + index));
	}
	else if (index == 2) {
		System.out.println("Feb");
	}

	}
  /*public static void orderCoffeeType(Coffee coffee){
	  if(coffee == Coffee.SMALL){
		  System.out.println("SMALL");
	  }
	  else if (coffee == Coffee.MEDIUM){
		  System.out.println("MEDIUM");
	  }
	  
  }*/
  
  public void orderCoffee(Coffee coffee){
	    //System.out.println(Coffee.TALL);  
	    if(coffee.getValue() == 500){
	    	System.out.println("It is TALL");
	    }else {
	    	System.out.println("It is not");
	    }
	
		System.out.println(coffee.getValue());
	}
}


