package AloneExam160323;

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int daysCount = Integer.parseInt(scanner.nextLine());
        int hoursPerDay = Integer.parseInt(scanner.nextLine());

        double totalSum = 0;
        for (int day = 1; day <= daysCount ; day++) {

            double price = 0;
            double currentDaySum = 0;

            for (int hours = 1; hours <= hoursPerDay ; hours++) {

                if (day % 2 == 0 && hours % 2 != 0) {
                    price = 2.5;
                } else if (day % 2 != 0 && hours % 2 == 0) {
                    price = 1.25;
                } else {
                    price = 1;
                }

                currentDaySum += price;
            }

            totalSum += currentDaySum;
            System.out.printf("Day: %d - %.2f leva%n", day, currentDaySum);
        }

        System.out.printf("Total: %.2f leva", totalSum);
    }
}
