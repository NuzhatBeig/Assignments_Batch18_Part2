package Inheritance;

public class Hounds extends Animals{
	

public Hounds(String name, String  habitat) {
		
	super(name, habitat);
}

private String breed;
//private String color;

public String getBreed() {
	return breed;
}
public void setBreed(String breed) {
	this.breed = breed;
}
/*public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}*/

@Override  //if subclass has same method as a super class
public String getColor() {
	return "Color of hound is black";
}

}
