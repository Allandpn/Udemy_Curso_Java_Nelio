package s13.entities;

import s13.enums.Color;

public class Circle extends Shape{
    private Double radius;

    public Circle(){
        super();
    }

    public Circle(double radius, Color color){
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
