package entities;

public class retangulo {
    public double width;
    public double height;

    public double area(){
        return width * height;
    }
    public double perimeter(){
        return 2 * (height + width );
    }
    public double diagonal(){
        return Math.sqrt(height * height + width * width);
    }
}
