package decorator;

public class ChoclatechipDecorator extends IcecreamDecorator {

	IceCream iceCream;
	
	
	public ChoclatechipDecorator(IceCream iceCream) {
		super();
		this.iceCream = iceCream;
	}

	public String getDescription() {
		return iceCream.getDescription() + " " + "With Choclate chip";
	}
	
	
	@Override
	public int cost() {
		return iceCream.cost() + 50;
	}

}
