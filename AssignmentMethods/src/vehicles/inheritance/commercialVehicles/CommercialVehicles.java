package vehicles.inheritance.commercialVehicles;

import vehicles.inheritance.RoadMaster;
import vehicles.inheritance.Vehicle;

public class CommercialVehicles extends Vehicle implements RoadMaster{
	private int threeOrMorenoOfAxles;
	
	
	public CommercialVehicles(String model, int mileage) {
		super(model, mileage);
	
	}

	public int getNoOfAxles() {
		return threeOrMorenoOfAxles;
	}

	public void setNoOfAxles(int noOfAxles) {
		this.threeOrMorenoOfAxles = noOfAxles;
	}

	@Override
	public void weight() {
		System.out.println(" Gross vehicle weight of more than 26000lbs");
	}

	@Override
	public String onRoadTimings() {
		return "9AM to 5PM";
	}

	@Override
	public String priceRange() {
		return " 50,000 to 100,000";
	}

	@Override
	public void heavyUtilityVehicle() {
		System.out.println("Perfect for bad weather");
		
	}
	
}
