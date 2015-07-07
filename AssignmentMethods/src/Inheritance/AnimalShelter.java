package Inheritance;

import Inheritance.tigersclass.American;
import Inheritance.tigersclass.Tiger;

public class AnimalShelter {

	public static void main(String[] args) {
		/*Tiger tiger = new Tiger("Siberian", "Russia");
		System.out.println(tiger.getName());
		tiger.setSound("Roar");
		System.out.println(tiger.getSound());
		System.out.println(tiger.getColor());
		
		Tiger tiger2 = new Tiger("Bengal", "India"){
		@Override
		public String getColor(){
			return " Bengal Tigers are striped black";
		}
	
	};
	
	System.out.println(tiger2.getColor());
	
		Hounds hound = new Hounds("Leopard Dogs","USA");
		System.out.println(hound.getColor());
		
		Animals animals = new Tiger("Siberian", "Russia");
		System.out.println(animals.getName());*/
		
		Animals ta = new American("Siberian", "Russia");
		printInfo(ta);
		ta.height();
		
		Animals ha = new Hounds("Leopard Dogs","USA");
		printInfo(ha);
		
		
	}
		
		public static void printInfo(Animals animals){
			System.out.println(animals.getName());
			System.out.println(animals.getHabitat());
			System.out.println(animals.getColor());	
	}
}
