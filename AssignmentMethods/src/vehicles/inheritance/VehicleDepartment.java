package vehicles.inheritance;

import vehicles.inheritance.commercialVehicles.CommercialVehicles;
import vehicles.inheritance.commercialVehicles.Trucks;
import vehicles.inheritance.personalVehicles.PersonalVehicles;
import vehicles.inheritance.personalVehicles.Sedan;
import vehicles.inheritance.personalVehicles.Suv;

public class VehicleDepartment {

	public static void main(String[] args) {
	/*	PersonalVehicles pv = new PersonalVehicles("Sedan", 35 );
	   // System.out.println(pv.toString());
		System.out.println(pv.getMileage());
		pv.setNumberOfdoors(4);
		System.out.println(pv.getNumberOfdoors());
		System.out.println(pv.getTransmission());
		System.out.println(pv.onRoadTimings());

		CommercialVehicles cv = new CommercialVehicles("Bus",15);
		System.out.println(cv.getModel());
		System.out.println(cv.getTransmission());
		System.out.println(cv.onRoadTimings());
		
		CommercialVehicles cv1 = new CommercialVehicles("Tractor",11){
		
		@Override 
		public String getTransmission() {
			return "Dual";
		}
		
		};
		System.out.println(cv1.getTransmission());*/
		
	/*	Vehicle sed = new Sedan("Sedan", 35 );
		printInfo(sed);
		Vehicle trucks = new Trucks("Bus",15);
		printInfo(trucks);
		
	}
	
	public static void printInfo(Vehicle veh){
		System.out.println("The model is " + veh.getModel() + " with the mileage of " + veh.getMileage() + " m/gal" + " can travel on street roads between " +  veh.onRoadTimings() );
	System.out.println(veh.priceRange());
	}*/ 
		
		Vehicle veh = new Sedan("BMW", 25 );
		printInfo(veh);
		veh = new Suv("Ford",12);
		printInfo(veh);
	}
public static void printInfo(Vehicle veh){
	System.out.println(veh.priceRange());
}
	}

