package Exam190323;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        //•	Първи ред – брой дни, в които Дядо Коледа отсъства – цяло число в интервала [1…5000]
        //•	Втори ред – оставена храна в килограми – цяло число в интервала [0…100000]
        //•	Трети ред – храна на ден за първия елен в килограми – реално число в интервала [0.00…100.00]
        //•	Четвърти ред – храна на ден за втория елен в килограми– реално число в интервала [0.00…100.00]
        //•	Пети ред – храна на ден за третия елен в килограми – реално число в интервала [0.00…100.00]
        int days = Integer.parseInt(scanner.nextLine());

        int foodInKG = Integer.parseInt(scanner.nextLine());

        double firstDeerFoodKG = Double.parseDouble(scanner.nextLine());
        double secondDeerFoodKG = Double.parseDouble(scanner.nextLine());
        double thirdDeerFoodKG = Double.parseDouble(scanner.nextLine());


        double firstTotal = days * firstDeerFoodKG;
        double secondTotal = days * secondDeerFoodKG;
        double thirdTotal = days * thirdDeerFoodKG;

        double totalFoodKG = firstTotal + secondTotal + thirdTotal;




        if (foodInKG >= totalFoodKG) {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodInKG - totalFoodKG));
        }
        else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(totalFoodKG - foodInKG));
        }

    }
}
