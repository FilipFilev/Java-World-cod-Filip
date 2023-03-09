package BeforeExam080323;

import java.util.Scanner;

public class P03MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine(); // възможности "Dubai", "Sofia" и "London"
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (destination) {
            case "Dubai":
                if (season.equals("Winter")) {
                    price = 45000;
                } else if (season.equals("Summer")) {
                    price = 40000;
                }
                price = price * 0.70;
                break;
            case "Sofia":
                if (season.equals("Winter")) {
                    price = 17000;
                } else if (season.equals("Summer")) {
                    price = 12500;
                }
                price = price * 1.25;
                break;
            case "London":
                if (season.equals("Winter")) {
                    price = 24000;
                } else if (season.equals("Summer")) {
                    price = 20250;
                }

                break;
        }

        double totalPrice = price * days;
        double diff = Math.abs(budget - totalPrice);
        if (budget >= totalPrice) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", diff);
        } else
            System.out.printf("The director needs %.2f leva more!", diff);
    }
}
