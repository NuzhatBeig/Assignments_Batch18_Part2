package vehicles.inheritance.personalVehicles;

public class Suv extends PersonalVehicles {

	public Suv(String model, int mileage) {
		super(model, mileage);
		
	}
	
	public String getWheelDrive(){
		return " Suvs are four wheel drive";
	}

	@Override
	public String priceRange() {
		return "Starting range 35000";
	}
	

}
