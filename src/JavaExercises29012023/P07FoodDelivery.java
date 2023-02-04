package JavaExercises29012023;

import java.util.Scanner;

public class P07FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//      •	Пилешко меню –  10.35 лв.
//•	        Меню с риба – 12.40 лв.
//•	        Вегетарианско меню  – 8.15 лв/ обща 94.75
//        IN
        int chickenMenuCount = Integer.parseInt(scanner.nextLine());
        int fishMenuCount = Integer.parseInt(scanner.nextLine());
        int vegiMenuCount = Integer.parseInt(scanner.nextLine());
        double delivery = 2.5;
//            BODY
        double chickenPrice = chickenMenuCount * 10.35;
        double fishPrice = fishMenuCount * 12.40;
        double vegiPrice = vegiMenuCount * 8.15;

        double totalMenuPrice = chickenPrice + fishPrice + vegiPrice;
        double desertPrice = totalMenuPrice * 0.20;
        double totalSum = totalMenuPrice + desertPrice + 2.50;


//            OUT
        System.out.println(totalSum);
    }
}
