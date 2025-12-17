package s13.entities;


import s13.enums.Color;

public abstract class Shape {
    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    protected Shape(Color color) {
        this.color = color;
    }

    protected Shape() {
    }

    public abstract double area();
}
