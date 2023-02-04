package JavaExercises29012023;

import java.util.Scanner;

public class P05_SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        ВХОД
        int pensCount = Integer.parseInt(scanner.nextLine());
        int markersCount = Integer.parseInt(scanner.nextLine());
        int cleanerLitters = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());
//        изчисления
        double pensPrice = pensCount * 5.80;
        double marketsPrice = markersCount * 7.20;
        double cleanerPrice = cleanerLitters * 1.20;
        double allMaterials = pensPrice + marketsPrice + cleanerPrice;
        double finnalPrice = allMaterials - (allMaterials * discount / 100);
//        Print in Console
        System.out.println(finnalPrice);

    }
}
