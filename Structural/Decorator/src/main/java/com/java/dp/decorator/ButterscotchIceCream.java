package decorator;

public class ButterscotchIceCream extends IceCream{

	public String getDescription() {
		return "Butter Scotch Ice Cream";
	}
	@Override
	public int cost() {
		return 50;
	}

}
