package vehicles.inheritance;

import vehicles.inheritance.commercialVehicles.CommercialVehicles;
import vehicles.inheritance.personalVehicles.Sedan;

public class InterfaceClient {

	public static void main(String[] args) {
		
		RoadMaster rdmstr = new CommercialVehicles("Truck", 12);
		printRoadMasterDetails(rdmstr);
		RoadMaster rdmstr1 = new Sedan("BMW", 25 );
		printRoadMasterDetails(rdmstr1);
	}

	public static void printRoadMasterDetails(RoadMaster rdmstr){
		
		rdmstr.heavyUtilityVehicle();
		
	}
	
}
