public class ShapeFactory extends AbstractFactoryMethod {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType == "circle") {
            return new Circle();
        } else if (shapeType == "square") {
            return new Square();
        }

        return null;
    }

    public Color getColor(String colorType) {
        return null;
    }

}