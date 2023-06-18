package decorator;

public class Runner {

	public static void main(String[] args) {

		IceCream iceCream = new ButterscotchIceCream();
		iceCream = new ChoclatesyrupDecorator(new ChoclatechipDecorator(iceCream));
		System.out.println(iceCream.getDescription());
		System.out.println(iceCream.cost());
	}

}
