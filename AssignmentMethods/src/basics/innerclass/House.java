package basics.innerclass;

public class House {
	String name = "HI";
	public House(String name){
		this.name = name;
	}
	class HousePainter{
		String color;
		public HousePainter(String color){//constructor
			this.color = color;
		}
		public void painter(){
			
			System.out.println(" I am painting" + name + "with the color" + color);
		}
	
	}
	
	
}
