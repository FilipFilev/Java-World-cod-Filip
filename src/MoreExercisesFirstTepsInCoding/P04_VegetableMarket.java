package MoreExercisesFirstTepsInCoding;

import java.util.Scanner;

public class P04_VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Градинар продавал реколтата от градината си на зеленчуковата борса. Продава зеленчуци за N лева на килограм и плодове за M лева за килограм.
        // Напишете програма, която да пресмята приходите от реколтата в евро ( ако приемем, че едно евро е равно на 1.94лв).

        double vegePrice = Double.parseDouble(scanner.nextLine());
        double fruitsPrice = Double.parseDouble(scanner.nextLine());
        int totalVegeKg = Integer.parseInt(scanner.nextLine());
        int totalFruitsKg = Integer.parseInt(scanner.nextLine());

        double vegeTotalPrice = vegePrice * totalVegeKg;
        double fruitsTotalPrice = fruitsPrice * totalFruitsKg;

        double totalLeva = vegeTotalPrice + fruitsTotalPrice;
        double levaToEuro = totalLeva / 1.94;
        System.out.printf("%.2f", levaToEuro);

    }
}
