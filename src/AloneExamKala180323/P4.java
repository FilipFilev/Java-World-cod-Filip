package AloneExamKala180323;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        int countSerials = Integer.parseInt(scanner.nextLine());


        double neededMoney = 0;
        for (int i = 1; i <= countSerials ; i++) {
            String name = scanner.nextLine();
            double price = Double.parseDouble(scanner.nextLine());

            if (name.equals("Thrones")){
                price *= 0.50;
            } else if (name.equals("Lucifer")) {
                price *= 0.60;
            } else if (name.equals("Protector")) {
                price *= 0.70;
            } else if (name.equals("TotalDrama")) {
                price *= 0.80;
            } else if (name.equals("Area")) {
                price *= 0.90;
            }

            neededMoney = neededMoney + price;

        }

        double diff = Math.abs(budget - neededMoney);
        if (budget >= neededMoney){
            System.out.printf("You bought all the series and left with %.2f lv.", diff);
        } else {

            System.out.printf("You need %.2f lv. more to buy the series!", diff);
        }

    }
}
