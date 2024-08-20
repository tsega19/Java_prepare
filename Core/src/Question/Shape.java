package Question;

public abstract class Shape {
    public abstract void calculateArea();
}
class rectangle extends Shape{
    double length=232;
    double width = 21;
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;

    }
    @Override
    public void calculateArea(){
        System.out.println("Area of of rectangle is = "+ getLength()*getWidth());
    }
}
class Circle extends Shape{
    double radius=213;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public void calculateArea(){
        System.out.println("Area of rectangle is = "+ Math.PI*getRadius()*getRadius());
    }

    public static void main(String[] args) {
        Shape r= new rectangle();
        r.calculateArea();
       Shape c = new Circle();
       c.calculateArea();
    }
}
