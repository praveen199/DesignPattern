package decorator;

public class ChoclatesyrupDecorator extends IcecreamDecorator {

	IceCream iceCream;
	
	public ChoclatesyrupDecorator(IceCream iceCream) {
		super();
		this.iceCream = iceCream;
	}
	
	public String getDescription() {
		return iceCream.getDescription() + " " + "With Choclate Scrup";
	}

	@Override
	public int cost() {
		return iceCream.cost() + 50;
	}

}
