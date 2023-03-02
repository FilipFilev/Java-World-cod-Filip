package BeforeExam010323;

import java.util.Scanner;

public class P03TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        String typePackage = scanner.nextLine();
        String VIP = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        boolean isValid = true;
        double price = 0;
        if (town.equals("Bansko") || town.equals("Borovets")) {
            if (typePackage.equals("noEquipment")) {
                price = 80;
                if (VIP.equals("yes")) {
                    price = price * 0.95;
                }
            } else if (typePackage.equals("withEquipment")) {
                price = 100;
                if (VIP.equals("yes")) {
                    price = price * 0.90;
                }
            } else {
                isValid = false;
            }

        } else if (town.equals("Varna") || town.equals("Burgas")) {
            if (typePackage.equals("noBreakfast")) {
                price = 100;
                if (VIP.equals("yes")) {
                    price = price * 0.93;
                }
            } else if (typePackage.equals("withBreakfast")) {
                price = 130;
                if (VIP.equals("yes")) {
                    price = price * 0.88;
                }
            } else {
                isValid = false;
            }

        } else {
            isValid = false;
        }

        if (days <= 0) {
            System.out.println("Days must be positive number!");
        } else if (!isValid) {
            System.out.println("Invalid input!");
        } else {
            if (days > 7) {
                days = days - 1;
            }
            double totalPrice = price * days;
            System.out.printf("The price is %.2flv! Have a nice time!", totalPrice);
        }
    }
}