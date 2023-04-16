public class FactoryProducer {
    public static AbstractFactoryMethod getType(String type) {
        if (type == "shape") {
            return new ShapeFactory();
        } else if (type == "color") {
            return new ColorFactory();
        }
        return null;
    }
}