public class ColorFactory extends AbstractFactoryMethod{
    public Color getColor(String colorType){
        if(colorType == null) {return null;}
    if(colorType == "red"){
        return new Red();
    } else if(colorType == "blue"){
        return new Blue();
    } 
    return null;
    }

    public Shape getShape(String shapeType){
        return null;
    }

    

}