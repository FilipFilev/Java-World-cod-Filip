package JavaExercises29012023;

import java.util.Scanner;

public class P02_RadianstoDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        четене на входа
        double radians = Double.parseDouble(scanner.nextLine());

//        изчисления
        double degrees = radians * 180 / Math.PI;
//        принтиране в конзолата

        System.out.println(degrees);
    }
}
