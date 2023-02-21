package ConditionalStatementsAdvanced070223.Lab;

import java.util.Scanner;

public class P011_FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());


        double sum = 0.0;

        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
            if (fruit.equals("banana")) {
                sum = count * 2.50;
                System.out.printf("%.2f", sum);
            } else if (fruit.equals("apple")) {
                sum = count * 1.20;
                System.out.printf("%.2f", sum);
            } else if (fruit.equals("orange")) {
                sum = count * 0.85;
                System.out.printf("%.2f", sum);
            } else if (fruit.equals("grapefruit")) {
                sum = count * 1.45;
                System.out.printf("%.2f", sum);
            } else if (fruit.equals("kiwi")) {
                sum = count * 2.70;
                System.out.printf("%.2f", sum);
            } else if (fruit.equals("pineapple")) {
                sum = count * 5.50;
                System.out.printf("%.2f", sum);
            } else if (fruit.equals("grapes")) {
                sum = count * 3.85;
                System.out.printf("%.2f", sum);
            } else {
                System.out.println("error");
            }
        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            if (fruit.equals("banana")) {
                sum = count * 2.70;
                System.out.printf("%.2f", sum);
            } else if (fruit.equals("apple")) {
                sum = count * 1.25;
                System.out.printf("%.2f", sum);
            } else if (fruit.equals("orange")) {
                sum = count * 0.90;
                System.out.printf("%.2f", sum);
            } else if (fruit.equals("grapefruit")) {
                sum = count * 1.60;
                System.out.printf("%.2f", sum);
            } else if (fruit.equals("kiwi")) {
                sum = count * 3.00;
                System.out.printf("%.2f", sum);
            } else if (fruit.equals("pineapple")) {
                sum = count * 5.60;
                System.out.printf("%.2f", sum);
            } else if (fruit.equals("grapes")) {
                sum = count * 4.20;
                System.out.printf("%.2f", sum);
            } else {
                System.out.println("error");
            }

        } else {
            System.out.println("error");
        }
    }

}


