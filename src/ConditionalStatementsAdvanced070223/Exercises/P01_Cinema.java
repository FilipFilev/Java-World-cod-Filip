package ConditionalStatementsAdvanced070223.Exercises;

import java.util.Scanner;

public class P01_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //•	Premiere – премиерна прожекция, на цена 12.00 лева.
        //•	Normal – стандартна прожекция, на цена 7.50 лева.
        //•	Discount – прожекция за деца, ученици и студенти на намалена цена от 5.00 лева.

        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double income = 0;

        if (projection.equals("Premiere")) {
            income = rows * columns * 12;
        } else if (projection.equals("Normal")) {
            income = rows * columns * 7.50;
        } else if (projection.equals("Discount")) {
            income = rows * columns * 5;
        }

        System.out.printf("%.2f leva", income);
    }
}
