
public class Thick extends Pizza{

	
	public Thick() {
		super();
		desc = "Grube ciasto";
	}

	@Override
	public double getPrice() {
		return 13;
	}

	@Override
	public String getDesc() {
		return desc;
	}

}
