package be.vdab.mijn_oefeningen_InLes.TREADS;

/**
 * Created by vdabcursist on 29/06/2017.
 */
public class Car {

    private int countWash;
    private String color;
    private int doors;

       /* Car car = new Car();
        car.toString();
        System.out.println("This is the class" + car);*/


       public Car (int countWash, String color, int doors ){


           this.countWash = countWash;
           this.color = color;
           this.doors = doors;
       }

    public int getCountWash() {
        return countWash;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public String toString () {
          return "This is a " + color + " Car"+ " with " + doors +" doors";
       }

       /*        *//*public void wash () {
                   int countWash = 0;
               System.out.println(countWash);*//*



           }*/


}

