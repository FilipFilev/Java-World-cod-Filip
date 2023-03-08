package BeofreExam070323;

import java.util.Scanner;

public class P05CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodInKgs = Integer.parseInt(scanner.nextLine()); //4
        int foodInGrams = foodInKgs * 1000;
        //•	На всеки следващ ред до получаване на команда Adopted ще получавате колко грама изяжда
        // кученцето на всяко хранене - цяло число в интервала [10 …1000]

        int wholeEatenFood = 0;
        String input = scanner.nextLine();
        while (!input.equals("Adopted")) {
            int currentFood = Integer.parseInt(input);

            wholeEatenFood += currentFood;

            input = scanner.nextLine();
        }

        int diff = Math.abs(foodInGrams - wholeEatenFood);
        if (foodInGrams >= wholeEatenFood) {
            System.out.printf("Food is enough! Leftovers: %d grams.%n", diff);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", diff);
        }
    }
}