package BeforeExam040323;

import java.util.Scanner;

public class P6EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int clients = Integer.parseInt(scanner.nextLine());
        double totalSpentMoney = 0;

        for (int i = 1; i <= clients; i++) {


            String command = scanner.nextLine();
            double spentMoney = 0;
            int productCount = 0;


            while (!command.equals("Finish")) {
                productCount++;
                //Цените на продуктите са:
                //•	кошничка за яйца (basket) – 1.50 лв.
                //•	великденски венец (wreath) – 3.80 лв.
                //•	шоколадов заек (chocolate bunny) – 7 лв.

                switch (command) {
                    case "basket":
                        spentMoney += 1.50;

                        break;
                    case "wreath":
                        spentMoney += 3.80;
                        break;
                    case "chocolate bunny":
                        spentMoney += 7;
                        break;
                }

                command = scanner.nextLine();
            }
            // всеки клиент закупил четен брой продукти,
            // ще получи 20% отстъпка от крайната цена
            if (productCount % 2 == 0) {
                spentMoney = spentMoney * 0.80;
            }

            System.out.printf("You purchased %d items for %.2f leva.%n", productCount, spentMoney);
            totalSpentMoney = totalSpentMoney + spentMoney;


        }
        double averageMoney = totalSpentMoney / clients;
        System.out.printf("Average bill per client is: %.2f leva.",averageMoney );

    }
}
