package ConditionalStatementsAdvanced070223.Exercises;

import java.util.Scanner;

public class P03_NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. прочитаме от конзолата
        //2. Правим един switch за всяко цвете
        //2а цената за обещия брой цветя
        //2б вложена проверка, за смятане на отстъпка.
        //3. допълнителна проверка извън switch-a , дали бюджета е достатъчен

        String flowersType = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        //•	Ако Нели купи повече от 80 Рози - 10% отстъпка от крайната цена
        //•	Ако Нели купи повече от 90  Далии - 15% отстъпка от крайната цена
        //•	Ако Нели купи повече от 80 Лалета - 15% отстъпка от крайната цена
        //•	Ако Нели купи по-малко от 120 Нарциса - цената се оскъпява с 15%
        //•	Ако Нели Купи по-малко от 80 Гладиоли - цената се оскъпява с 20%
        double price = 0;
        switch (flowersType) {
            case "Roses":
                price = countFlowers * 5;
                if (countFlowers > 80) {
                    price = price * 0.9;
                }

                break;
            case "Dahlias":
                price = countFlowers * 3.80;
                if (countFlowers > 90) {
                    price = price * 0.85;
                }
                break;

            case "Tulips":
                price = countFlowers * 2.8;
                if (countFlowers > 80) {
                    price = price * 0.85;
                }
                break;

            case "Narcissus":
                price = countFlowers * 3;
                if (countFlowers < 120) {
                    price = price * 1.15;
                }
                break;

            case "Gladiolus":
                price = countFlowers * 2.5;
                if (countFlowers < 80) {
                    price = price * 1.20;
                }
                break;
        }

        double difference = Math.abs(budget - price);

        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, flowersType, difference);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", difference);
        }




            //•	Ако бюджета им е достатъчен - "Hey, you have a great garden with {броя цвета} {вид цветя} and {останалата сума} leva left."
        //•	Ако бюджета им е НЕ достатъчен - "Not enough money, you need {нужната сума} leva more."
    }
}
