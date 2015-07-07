package vehicles.inheritance.personalVehicles;

import vehicles.inheritance.RoadMaster;

public final class Sedan extends PersonalVehicles implements RoadMaster {//final means no further extension

	public Sedan(String model, int mileage) {
		super(model, mileage);
		

}
	public String getLenght(){
		return " Lenght of sedan is 211 in ";
	}

	@Override
	public String priceRange() {
		return "Starting price is 15000";
	}
	@Override
	public void heavyUtilityVehicle() {
		System.out.println(" Not really good for heavy snow");
		
	}
	
}


