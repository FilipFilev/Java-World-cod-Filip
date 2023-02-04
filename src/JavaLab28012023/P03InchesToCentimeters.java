package JavaLab28012023;

import java.util.Scanner;

public class P03InchesToCentimeters {
    public static void main(String[] args) {
        Scanner ConsoleReader = new Scanner(System.in);

        double inch = Double.parseDouble(ConsoleReader.nextLine());

        double cm = inch * 2.54;

        System.out.println(cm);

    }
}
