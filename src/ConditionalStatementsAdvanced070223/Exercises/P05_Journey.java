package ConditionalStatementsAdvanced070223.Exercises;

import java.util.Scanner;

public class P05_Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Четене от конзолата.
        //2. Проверка, къде ще почива, колко ще изхарчи, дали ще е на хотел или къмпинг
        //3. Принтираме

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String restType = "";
        double spentMoney = 0;

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                restType = "Camp";
                spentMoney = budget * 0.30;
            } else if (season.equals("winter")) {
                restType = "Hotel";
                spentMoney = budget * 0.70;
            }

        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                restType = "Camp";
                spentMoney = budget * 0.40;
            } else if (season.equals("winter")) {
                restType = "Hotel";
                spentMoney = budget * 0.80;
            }

        } else {
            destination = "Europe";
            restType = "Hotel";
            spentMoney = budget * 0.9;

        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s – %.2f", restType, spentMoney);

    }

}
