package sari;

public class Mocha extends CondimentDecorator {

	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	public double cost(){
		return 0.29 + beverage.cost();
	}
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
}
