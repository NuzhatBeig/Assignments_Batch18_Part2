package Inheritance;

public class Animals {
 private String name;
 private String habitat;
 private int weight;
 private int speed;
 private String sound;
 private String color = " The color is brown ";
 
 
public Animals(String name,String habitat){
	 this.name = name;
	 this.habitat = habitat;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getHabitat() {
	return habitat;
}


public void setHabitat(String habitat) {
	this.habitat = habitat;
}


public int getWeight() {
	return weight;
}


public void setWeight(int weight) {
	this.weight = weight;
}


public int getSpeed() {
	return speed;
}


public void setSpeed(int speed) {
	this.speed = speed;
}


public String getSound() {
	return sound;
}


public void setSound(String sound) {
	this.sound = sound;
}


public String getColor() {
	return color;
}


public void setColor(String color) {
	this.color = color;
}




}
