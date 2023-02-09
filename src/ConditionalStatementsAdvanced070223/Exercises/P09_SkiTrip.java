package ConditionalStatementsAdvanced070223.Exercises;

import java.util.Scanner;

public class P09_SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Прочитаме входни данни
        //2. пресмятаме точно колко нощувки ще има
        //3. switch в зависимост от типа стая - пресмятаме цената
         //3а Проверка дали ще има отстъпкла
        //3б пресмятаме отстъпката
        //4 Проверкана оценката
        //5 крайнат цена се смята спрямо оценката
        //6 принтираме крайната сума

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String feedBack = scanner.nextLine();

        int nights = days - 1;
        double price =0;

        switch (roomType) {
            case "room for one person" -> price = nights * 18;
            case "apartment" -> {
                price = nights * 25;
                if (nights < 10) {
                    price = price * 0.7; // price = price - price * 0.3
                } else if (nights <= 15) {
                    price = price * 0.65;

                } else {
                    price = price * 0.50;
                }
            }
            case "president apartment" -> {
                price = nights * 35;
                if (nights < 10) {
                    price = price * 0.9; // price = price - price * 0.1
                } else if (nights <= 15) {
                    price = price * 0.85;

                } else {
                    price = price * 0.80;
                }
            }
        }

        if (feedBack.equals("positive")){
            price = price * 1.25;
        } else if (feedBack.equals("negative")) {
            price = price * 0.9;

        }

        System.out.printf("%.2f", price);

    }
}
