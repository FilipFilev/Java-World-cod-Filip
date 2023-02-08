package ConditionalStatementsAdvanced070223.Lab;

import java.util.Scanner;

public class P12_TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double income = Double.parseDouble(scanner.nextLine());


        double bonus = 0;

        if (town.equals("Sofia")) {
            if (income >= 0 && income <= 500) {
                bonus = income * 0.05;
            } else if (income > 500 && income <= 1000) {
                bonus = income * 0.07;
            } else if (income > 1000 && income <= 10000) {
                bonus = income * 0.08;
            } else if (income > 10000) {
                bonus = income * 0.12;
            } else {
                System.out.println("error");
            }

        } else if (town.equals("Varna")) {
            if (income >= 0 && income <= 500) {
                bonus = income * 0.045;
            } else if (income > 500 && income <= 1000) {
                bonus = income * 0.075;
            } else if (income > 1000 && income <= 10000) {
                bonus = income * 0.10;
            } else if (income > 10000) {
                bonus = income * 0.13;
            } else {
                System.out.println("error");
            }

        } else if (town.equals("Plovdiv")) {
            if (income >= 0 && income <= 500) {
                bonus = income * 0.055;
            } else if (income > 500 && income <= 1000) {
                bonus = income * 0.08;
            } else if (income > 1000 && income <= 10000) {
                bonus = income * 0.12;
            } else if (income > 10000) {
                bonus = income * 0.145;
            }else {
                System.out.println("error");
            }

        } else {
            System.out.println("error");
        }

        if (bonus > 0) {
            System.out.printf("%.2f", bonus);
        }

    }
}
