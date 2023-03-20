package Exam190323;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        //•	На първия ред – N – броят дни  – цяло число в интервала [1...300]
                         //•	За всеки един ден на отделен ред:
                    //	количество на ракията – реално число в интервала [1.00...500.00]
                    //	градус на получената напитка - реално число в интервала [10.00...99.00]

        int days = Integer.parseInt(scanner.nextLine());

        double rakiaSum = 0;
        double degreesSum = 0.00;
        for (int i = 1; i <= days ; i++) {
            double rakiaLitters = Double.parseDouble(scanner.nextLine());
            double degrees = Double.parseDouble(scanner.nextLine());


           rakiaSum += rakiaLitters;


           degreesSum = degreesSum + (rakiaLitters * degrees);


        }

        double averageDegree = degreesSum / rakiaSum;



        System.out.printf("Liter: %.2f%n", rakiaSum);
        System.out.printf("Degrees: %.2f%n", averageDegree);


        if (averageDegree < 38) {
            System.out.printf("Not good, you should baking!");
        } else if (averageDegree >= 38 && averageDegree <= 42) {
            System.out.printf("Super!");
        } else {
            System.out.printf("Dilution with distilled water!");
        }


    }
}
