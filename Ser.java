
public class Ser extends Addon {
	
	Pizza pizza;
	
	public Ser(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc() + " +Ser";
	}

	@Override
	public double getPrice() {
		return pizza.getPrice() + 2.5;
	}
}
