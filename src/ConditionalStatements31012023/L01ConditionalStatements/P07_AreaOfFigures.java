package ConditionalStatements31012023.L01ConditionalStatements;

import java.util.Scanner;

public class P07_AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        double area = 0.0;
        if (type.equals("square")) {

            double sideSquare = Double.parseDouble(scanner.nextLine());
            area = sideSquare * sideSquare;

        } else if (type.equals("rectangle")) {
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());
            area = sideA * sideB;

        } else if (type.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());

            area = Math.PI * radius * radius;

        } else if (type.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());

            area = (a * h) / 2;

        }

        System.out.printf("%.3f", area);
    }

}
