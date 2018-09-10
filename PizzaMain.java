
public class PizzaMain {

	public static void main(String[] args) {
		
		Pizza pizza1 = new Classic();
		System.out.println("Zamówiono: " + pizza1.getDesc() + ", koszt: " + pizza1.getPrice());

		pizza1 = new Ser(pizza1);	
		System.out.println("Zamówiono: " + pizza1.getDesc() + ", koszt: " + pizza1.getPrice());
	
		pizza1 = new Szynka(pizza1);
		System.out.println("Zamówiono: " + pizza1.getDesc() + ", koszt: " + pizza1.getPrice());

		pizza1 = new Oregano(pizza1);
		System.out.println("Zamówiono: " + pizza1.getDesc() + ", koszt: " + pizza1.getPrice());
	
	
		Pizza pizza2 = new Thick();
		pizza2 = new Ser(pizza2);
		pizza2 = new Szynka(pizza2);
		pizza2 = new Oregano(pizza2);
		System.out.println("Zamówiono: " + pizza2.getDesc() + ", koszt: " + pizza2.getPrice());
		
	}
}
