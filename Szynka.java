
public class Szynka extends Addon{
	Pizza pizza;

	public Szynka(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public double getPrice() {
		return pizza.getPrice() + 3;
	}

	@Override
	public String getDesc(){
		return pizza.getDesc() + " +Szynka";
	}	
}
