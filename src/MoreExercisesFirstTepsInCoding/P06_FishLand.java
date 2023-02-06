package MoreExercisesFirstTepsInCoding;

import java.util.Scanner;

public class P06_FishLand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mackerelPrice = Double.parseDouble(scanner.nextLine());
        double sprinklePrice = Double.parseDouble(scanner.nextLine());
        double bonitoKgs = Double.parseDouble(scanner.nextLine());
        double safridKgs = Double.parseDouble(scanner.nextLine());
        double musselsKgs = Double.parseDouble(scanner.nextLine());

        double bonitoPrice = (mackerelPrice * 1.6) * bonitoKgs;
        double safridPrice = (sprinklePrice * 1.8) * safridKgs;
        double musselsPrice = musselsKgs * 7.5;

        double totalPrice = bonitoPrice + safridPrice + musselsPrice;

        System.out.printf("%.2f ", totalPrice);

    }
}
