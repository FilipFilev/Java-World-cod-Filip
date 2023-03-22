package AloneExamKala180323;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //•	Бюджет за актьори - реално число в интервала [1000.0... 2 100 000.0]
        double budget = Double.parseDouble(scanner.nextLine());

        String actorName = scanner.nextLine();

        while (!actorName.equals("ACTION")) {
            double salary = 0;
            if (actorName.length() > 15){
                salary = budget * 0.20;
            } else {
                 salary = Double.parseDouble(scanner.nextLine());
            }
            budget -= salary;

            if (budget <= 0){
                break;
            }
            actorName = scanner.nextLine();

        }


        if (budget <= 0){
            System.out.printf("We need %.2f leva for our actors.", Math.abs(budget));
        } else {
            System.out.printf("We are left with %.2f leva.", Math.abs(budget));
        }


    }
}