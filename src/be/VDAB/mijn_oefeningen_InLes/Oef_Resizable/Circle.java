package be.VDAB.mijn_oefeningen_InLes.Oef_Resizable;

/**
 * Created by vdabcursist on 20/06/2017.
 */
public class Circle implements GeometricObject {

    protected double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 *Math.PI* radius;

    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
}

