package be.VDAB.mijn_oefeningen_InLes.Oef_Shapes;

/**
 * Created by vdabcursist on 19/06/2017.
 */
public class Circle extends Shape {
    private double radius = 1.0;

    // Constructor
    public Circle (){  //default constructor

    }
    // Constructor - this
    public Circle(double radius){
        this.radius= radius;
    }

    public Circle(double radius,String color, boolean filled){
        this.radius= radius;
    }


}

