package Ej10;

public abstract class Shape {

    protected String color;
    protected Boolean filled;

 //   public abstract Shape();
    public Shape(String color, Boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){ return color;}
    public void setColor(String color) {
        this.color = color;
    }
    public Boolean isFilled(){ return filled;}
    public void setFilled(Boolean filled){
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    @Override
    public abstract String toString();
}
