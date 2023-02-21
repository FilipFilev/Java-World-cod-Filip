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
        String grade = scanner.nextLine();

        double sum = 0;
        int nights = days - 1;
        if (roomType.equals("room for one person")) {
            sum = nights * 18.00;

        } else if (roomType.equals("apartment")) {
            sum = nights * 25.00;

            if (days < 10) {
                //sum = sum * 0.70;
                sum *= 0.70;
            } else if (days <= 15) {
                sum = sum * 0.65;
            } else {
                sum = sum * 0.50;
            }
        } else if (roomType.equals("president apartment")) {
            sum = nights * 35.00;

            if (days < 10) {
                sum = sum * 0.90;
            } else if (days <= 15) {
                sum = sum * 0.85;
            } else {
                sum = sum * 0.80;
            }
        }

        if (grade.equals("positive")) {
            sum = sum * 1.25;
        } else {
            sum = sum * 0.90;
        }

        System.out.printf("%.2f", sum);

    }
}
