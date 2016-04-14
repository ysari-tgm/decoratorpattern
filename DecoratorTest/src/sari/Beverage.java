package sari;

public abstract class Beverage {

	String description;
	
	public Beverage(){
		this.description = "Unkown Beverage";
	}
	public String getDescription(){
		return description;
	}
	public abstract double cost();
}
