package AloneExam160323;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String years = scanner.nextLine();
        String typeContract = scanner.nextLine();
        String mobileInternet = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());

        double pricePerMonth = 0;
        if (years.equals("one")) {
            if (typeContract.equals("Small")) {
                pricePerMonth = 9.98;
            } else if (typeContract.equals("Middle")) {
                pricePerMonth = 18.99;
            } else if (typeContract.equals("Large")) {
                pricePerMonth = 25.98;
            } else if (typeContract.equals("ExtraLarge")) {
                pricePerMonth = 35.99;
            }

        } else if (years.equals("two")) {
            if (typeContract.equals("Small")) {
                pricePerMonth = 8.58;
            } else if (typeContract.equals("Middle")) {
                pricePerMonth = 17.09;
            } else if (typeContract.equals("Large")) {
                pricePerMonth = 23.59;
            } else if (typeContract.equals("ExtraLarge")) {
                pricePerMonth = 31.79;
            }
        }

        if (mobileInternet.equals("yes") && pricePerMonth <= 10.00) {
            pricePerMonth += 5.50;
        } else if (mobileInternet.equals("yes") && pricePerMonth <= 30) {
            pricePerMonth += 4.35;
        } else if (mobileInternet.equals("yes")) {
            pricePerMonth += 3.85;
        }


        if (years.equals("two")) {
            pricePerMonth *= 0.9625;
        }

        double totalPrice = months * pricePerMonth;
        System.out.printf("%.2f lv.",totalPrice);

    }

}

