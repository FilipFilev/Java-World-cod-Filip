package AloneExam140323;

import java.util.Scanner;

public class P1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double rocketsPrice = Double.parseDouble(scanner.nextLine());
        int rocketsCount = Integer.parseInt(scanner.nextLine());

        int runnersCount = Integer.parseInt(scanner.nextLine());
        double runnersPrice = rocketsPrice / 6;


        double totalRocketsPrice = rocketsPrice * rocketsCount;
        double totalRunnersPrice = runnersPrice * runnersCount;

        double anotherSpends = (totalRocketsPrice + totalRunnersPrice) * 0.20;

        double totalPrice = totalRocketsPrice + totalRunnersPrice + anotherSpends;

        double djokovicSum = Math.floor(totalPrice * 0.125);
        double sponsorsSum = Math.ceil(totalPrice * 0.875);

        System.out.printf("Price to be paid by Djokovic %.0f%n",djokovicSum);
        System.out.printf("Price to be paid by sponsors %.0f", sponsorsSum);
    }
}
