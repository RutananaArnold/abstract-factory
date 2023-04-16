public class FactoryMain{
    public static void main(String[] args){
        AbstractFactoryMethod fp = FactoryProducer.getType("shape");
        Shape shape1 = fp.getShape("square");
        shape1.draw();

        Shape shape2 = fp.getShape("circle");
        shape2.draw();


        AbstractFactoryMethod fs = FactoryProducer.getType("color");
        Color color1 = fs.getColor("red");
        color1.fill();

        Color color2 = fs.getColor("blue");
        color2.fill();
    }
}