package Ej10;

public class Circle extends Shape {
    final float PI = 3.1416;
    protected double radius;
    public Circle();
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, Boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return PI * radius * radius;
    }
    public double perimeter(){
        return 2*PI*radius;
    }

    @Override
    public String toString() {
        return null;
    }
}
