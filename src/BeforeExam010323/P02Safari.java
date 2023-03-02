package BeforeExam010323;

import java.util.Scanner;

public class P02Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Бюджет – реално число в интервала [0.00… 10000.00]
        //•	Колко литра гориво ще са им нужни – реално число в интервала [1.00… 50.00]
        //•	Ден от седмицата – текст с възможности "Saturday" и "Sunday"

        double budget = Double.parseDouble(scanner.nextLine());
        double fuelLitters = Double.parseDouble(scanner.nextLine());
        String dayOfWeekend = scanner.nextLine();

        double totalSum = (fuelLitters * 2.10) + 100;

        if (dayOfWeekend.equals("Saturday")) {
            totalSum = totalSum * 0.90;
        } else if (dayOfWeekend.equals("Sunday")) {
            totalSum = totalSum * 0.80;
        }


        double moneyLeft = budget - totalSum;
        double moneyNeeded = totalSum - budget;
        if (budget >= totalSum) {
            System.out.printf("Safari time! Money left: %.2f lv. ", moneyLeft);
        }else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", moneyNeeded);
        }

    }
}
