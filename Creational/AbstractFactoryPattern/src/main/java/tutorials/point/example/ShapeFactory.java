package tutorials.point.example;

public class ShapeFactory extends AbstractFactory {

	Shape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();         
		}else if(shapeType.equalsIgnoreCase("SQUARE")){
			return new RoundedSquare();
		}
		return null;
	}

}
