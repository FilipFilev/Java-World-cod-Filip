package BeforeExam080323;

import java.util.Scanner;

public class P02FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int percentAdditional = Integer.parseInt(scanner.nextLine());

        if (nights > 7){
            pricePerNight = pricePerNight * 0.95;
        }
        double sumAllNights = nights * pricePerNight;
        double expenses = budget * percentAdditional / 100;

        double neededMoney = sumAllNights + expenses;

        double diff = Math.abs(budget - neededMoney);
        if (budget >= neededMoney) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.%n", diff);
        } else {
            System.out.printf("%.2f leva needed.", diff);
        }

    }
}
