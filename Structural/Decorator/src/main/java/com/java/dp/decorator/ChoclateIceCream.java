package decorator;

public class ChoclateIceCream extends IceCream{

	public String getDescription() {
		return "Choclate Ice Cream";
	}
	
	@Override
	public int cost() {
		return 60;
	}

}
