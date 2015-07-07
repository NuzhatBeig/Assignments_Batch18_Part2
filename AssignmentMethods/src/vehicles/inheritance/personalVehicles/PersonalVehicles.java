package vehicles.inheritance.personalVehicles;

import vehicles.inheritance.Vehicle;

public abstract class PersonalVehicles extends Vehicle {
	private String trunkSpace;
	
	public PersonalVehicles(String model, int mileage) {
		super(model, mileage);
		//super.setModel("rr"); // Invoking super method
	}

	public String getTrunkSpace() {
		return trunkSpace;
	}

	public void setTrunkSpace(String trunkSpace) {
		this.trunkSpace = trunkSpace;
	}

@Override
public String getTransmission() {
	return "automatic";
}
@Override
public String onRoadTimings(){
	return "No Restrictions";
}

@Override
public void weight() {
	System.out.println("Total weight of less than 8000lbs");
	
}

/*@Override
public String priceRange() {
	return "20000 to 35000";
}*/
}
