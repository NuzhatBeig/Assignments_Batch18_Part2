package Inheritance.tigersclass;

import Inheritance.Animals;

public abstract class Tiger extends Animals {
	
public Tiger(String name, String  habitat) {
	
		super(name, habitat);
		//super.setName(name);//invoking super method
	}

private String type;
private String stripetype;

public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getStripetype() {
	return stripetype;
}
public void setStripetype(String stripetype) {
	this.stripetype = stripetype;
}
/*
@Override  //if subclass has same method as a super class
public String getColor() {
	return "Color of tiger is brown with black and white stripes";
}
*/
/*
@Override
public void height(){
	System.out.println(" Height is 13");
	
}*/

}
