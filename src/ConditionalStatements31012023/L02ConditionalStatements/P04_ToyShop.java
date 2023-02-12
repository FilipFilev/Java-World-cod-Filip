package ConditionalStatements31012023.L02ConditionalStatements;

import java.util.Scanner;

public class P04_ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	Пъзел - 2.60 лв.
//•	Говореща кукла - 3 лв.
//•	Плюшено мече - 4.10 лв.
//•	Миньон - 8.20 лв.
//•	Камионче - 2 лв.

        //1. Прочитане от конзолата
        //2. Пресмятаме общия брой играчки
        //3. Пресмятаме колко струват играчките без отстъпка
        //4. Проверяваме дали играчките са над 50 -> правим отстъпка от 25% от общата цена
        //5. Изваждаме от общата сума 10% наем.
        //6. Проверяваме дали парите стигат за екскурзия.

        double tripPrice = Double.parseDouble(scanner.nextLine());

        int puzzlesCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int teddyBearsCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int trucksCount = Integer.parseInt(scanner.nextLine());

        int totalToysCount = puzzlesCount + dollsCount + teddyBearsCount + minionsCount + trucksCount;
        double totalSum = puzzlesCount * 2.6 + dollsCount * 3 + teddyBearsCount * 4.10 + minionsCount * 8.20 + trucksCount * 2;

        if (totalToysCount >= 50) {
            totalSum = totalSum * 0.75;
        }

        totalSum = totalSum * 0.9;

        if (totalSum >= tripPrice) {
            double moneyLeft = totalSum - tripPrice;
            System.out.printf("Yes! %.2f lv left.", moneyLeft);
        } else {

            double moneyNeeded = tripPrice - totalSum;
            System.out.printf("Not enough money! %.2f lv needed.", moneyNeeded);
        }

    }
}
