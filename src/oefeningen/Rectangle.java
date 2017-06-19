package oefeningen;

/**
 * Created by vdabcursist on 19/06/2017.
 * geoptimaliseerd door Kevin
 */
public class Rectangle extends Shape {

    private double witdh;
    private double length;

    //default constructor
    public Rectangle() {
        this.witdh = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double witdh, double length) {
        this.witdh = witdh;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double witdh, double length) {
        super(color, filled);
        this.witdh = witdh;
        this.length = length;
    }

    //** de get - set kan je automatisch laten genereren door het programma
    // >> Go to Code > Generate  >> Get - Set >> selecteren
    public double getWitdh() {
        return witdh;
    }

    public void setWitdh(double witdh) {
        this.witdh = witdh;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return witdh * length;
    }


}