import java.util.Scanner;

/**
 * Created by vdabcursist on 15/06/2017.
 */


//** Hier maak je de classe aan met alle properties, niet gedefinieerd
// >>> definiering komt in de run class file met de instantie van je object/

public class Queen {

    private String name;
    private int power;
    private int hunger;
    private int eggs;

    // hier maak je een constructor aan zodat je in je class file een nieuwe instantie kan aanmaken.
    public Queen(String name, int power, int hunger) {

        this.name = name;
        this.power = power;
        this.hunger = hunger;   //deze propertie kan worden ingevuld in de class file /
        this.eggs = 5;             // deze propertie is vast

    }

    public boolean eatIfHunger() {
        if ((hunger <= 100) && (power <= 20)) {
            System.out.println(name + " needs to eat!");
            System.out.println(name + " starts to eat!") ;
            hunger = hunger*2;
            System.out.println(name + " hunger level is " + hunger);
            System.out.println(name + " is fed and ready to lay eggs!");



        } else {
            System.out.println(name + "has no hunger");
        }
        return false;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
