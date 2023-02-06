package ConditionalStatements31012023.L02ConditionalStatements;

import java.util.Scanner;

public class testForDaci {
    public static void main(String[] args) {
        Scanner ConsoleReader = new Scanner(System.in);

        double inch = Double.parseDouble(ConsoleReader.nextLine());

        double cm = inch * 2.54;

        System.out.println(cm);

    }
}

