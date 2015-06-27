package basics.innerclass;

import basics.innerclass.House.HousePainter;

public class InnerClassExample {

	public static void main(String[] args) {
		House house = new House("Nuzhat's");
		System.out.println(house.name);
		//HousePainter hp = house.new HousePainter();
		HousePainter hp = new House("Nuzhat's").new HousePainter("Blue");//if only need housePainter details
		hp.painter();

	}

}
