package sari;

public class Milk extends CondimentDecorator {

	public Milk(Beverage beverage){
		this.beverage = beverage;
	}
	public double cost(){
		return 0.49 + beverage.cost();
	}
	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}
}
