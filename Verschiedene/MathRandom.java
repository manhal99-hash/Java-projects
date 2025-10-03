import java.util.Scanner;
import java.util.Random;

public class MathRandom {
    public static void main(String[]args){
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double epsilon = Double.parseDouble(args[2]);
        double betrag = Math.abs(y-x);
        double random;

        double zahl1;
        double zahl2;

        do {
            random = Math.random();
            zahl1 = x + random * (y-x);
            zahl2 = x + random *(y-x);
        } while(Math.abs(zahl2 - zahl1) < epsilon);
        System.out.println(zahl1 + " "+zahl2);

    }
}
