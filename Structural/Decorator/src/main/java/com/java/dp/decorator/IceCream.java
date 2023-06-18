package decorator;

public abstract class IceCream {

	public String description;

	public String getDescription() {
		return  description;
	}
	
	public abstract int cost();
}
