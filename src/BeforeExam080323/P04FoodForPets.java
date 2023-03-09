package BeforeExam080323;

import java.util.Scanner;

public class P04FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int days = Integer.parseInt(scanner.nextLine());
        double allFood = Double.parseDouble(scanner.nextLine());


        double biscuits = 0;
        double eatenFood = 0;
        double dogEaten = 0;
        double catEaten = 0;
        for (int i = 1; i <= days ; i++) {
            int dogFood = Integer.parseInt(scanner.nextLine());
            int catFood = Integer.parseInt(scanner.nextLine());


            eatenFood += dogFood + catFood;
            dogEaten += dogFood;
            catEaten += catFood;
            if (i % 3 == 0) {
                double dayFood = dogFood + catFood;
                biscuits = biscuits + (dayFood * 0.10);
            }
        }


        double foodEatenPercent = eatenFood / allFood * 100;
        double dogEatenPercent = dogEaten / eatenFood * 100;
        double catEatenPercent = catEaten / eatenFood * 100;

        System.out.printf("Total eaten biscuits: %.0fgr.%n", biscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n", foodEatenPercent);
        System.out.printf("%.2f%% eaten from the dog.%n", dogEatenPercent);
        System.out.printf("%.2f%% eaten from the cat.%n", catEatenPercent);


    }
}
