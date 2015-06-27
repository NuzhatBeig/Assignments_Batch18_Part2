package basics;

public class StringExample {

	public static void main(String[] args) {
		stringExample();
		
	}
		
		static public void stringExample(){
			String name = new String("Nuzhat");
			String name1 = new String("Nuzhat");
			String name2 = new String("Nuzhat");
			String name3 = new String("Nuzhat");
			
			String name4 = "NuzhatB";//recommended
			String name5 = "NuzhatB"; //in this case here same object will refer to new variable
			
			System.out.println(name == name1); //with new different objects are created,thats why false
			System.out.println(name.equals(name1));
			System.out.println("=====================");
			System.out.println(name4 == name5); //here all string go to the same string pool inside VM
			System.out.println(name4.equals(name5));
			
			String myFirstName = "Nuzhat";
			String myLastName = " Beig";
			
			System.out.println(myFirstName.concat(myLastName));
			
			String[] names = {"1","2"};
			//StringBuffer finalname = new StringBuffer();//it doesnt create multiple objects
			StringBuilder finalname = new StringBuilder();//it doesnt create multiple objects
			for(String name7 :names){
				finalname.append(name7);
			}
				System.out.println(finalname);
			
			
		}
		
	}


