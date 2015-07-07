package vehicles.inheritance;

import vehicles.inheritance.personalVehicles.Sedan;
import vehicles.inheritance.personalVehicles.Suv;

public class InstanceOfExample {

	public static void main(String[] args) {

		Vehicle veh = new Sedan("BMW", 25 );
		printInfo(veh);
		veh = new Suv("Ford",12);
		printInfo(veh);
	}
	public static void printInfo(Vehicle veh){
		System.out.println(veh.getModel());
		
	if (veh instanceof Sedan){  //casting
		Sedan se = (Sedan) veh;
		System.out.println(se.getLenght());
	}else if(veh instanceof Suv){
		Suv suv = (Suv) veh;
		System.out.println(suv.getWheelDrive());
	}
	
	}

}
