package vehicles.inheritance;

public abstract class Vehicle {
	
	
	private String model;
    private int mileage;
    private int numberOfSeats;
    private int numberOfdoors ;
    private String transmission = "Manual";
    
    public Vehicle (String model, int mileage ) {
    	this.model =  model;
    	this.mileage = mileage;
    }
    
    
    public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getMileage() {
		return mileage;
	}


	public void setMileage(int mileage) {
		this.mileage = mileage;
	}


	public int getNumberOfSeats() {
		return numberOfSeats;
	}


	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}


	public int getNumberOfdoors() {
		return numberOfdoors;
	}


	public void setNumberOfdoors(int numberOfdoors) {
		this.numberOfdoors = numberOfdoors;
	}

	public String getTransmission() {
		return transmission;
	}


	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
    
	public abstract String onRoadTimings();
	
	public abstract void weight();
	
	public abstract String priceRange();
	
	
}
