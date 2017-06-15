import java.util.Scanner;

public class Beehive {
    public static void main(String[] args) {

        // Hier worden nieuwe instanties gemaakt van het object Queen.class   >>>zie Queen.java
        Queen q = new Queen("Khalifa", 50, 10);
        Queen r = new Queen("Theresa", 15, 50);

        // Hier worden de scripts gerunt die beschreven zijn in je Queen.java
        q.eatIfHunger();

        r.eatIfHunger();

        Scanner s = new Scanner (System.in);
        r.
        System.out.println ("Geef het power niveau van Bee Kahlifa");
        int power = s.nextInt();

        //** als je queen al gedefinieerd is (zoals hierboven is gebeurd) moet je een setPower aanmaken (in je queen class definitie zie
        //file  queen.java om de power te kunnen veranderen /

        q.setPower(power);
        System.out.println ("Geef het power niveau van Theresa");
        int power = s.nextInt();
        r.setPower (power);






    }
}
