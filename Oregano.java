
public class Oregano extends Addon{
	Pizza pizza;
	
	public Oregano(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc() + " +Oregano";
	}

	@Override
	public double getPrice() {
		return pizza.getPrice() + 1.5;
	}
}
