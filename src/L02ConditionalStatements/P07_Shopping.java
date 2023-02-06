package L02ConditionalStatements;

import java.util.Scanner;

public class P07_Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double peterBudget = Double.parseDouble(scanner.nextLine());
        int videoCardsCount = Integer.parseInt(scanner.nextLine());
        int processorsCount = Integer.parseInt(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());

        double totalPriceForVideoCards = videoCardsCount * 250;
        double totalPriceForProcessors = processorsCount * (totalPriceForVideoCards * 0.35);
        double totalPriceForRam = ramCount * (totalPriceForVideoCards * 0.1);

        double totalPrice = totalPriceForVideoCards + totalPriceForProcessors + totalPriceForRam;


        if (videoCardsCount > processorsCount) { //Ако броя на видеокартите е по-голям от този на
            // процесорите получава 15% отстъпка от крайната сметка.
            double discount = totalPrice * 0.15;
            totalPrice = totalPrice - discount;
        }

        double moneyLeft = peterBudget - totalPrice;

        if (totalPrice <= peterBudget) {
            System.out.printf("You have %.2f leva left!%n", moneyLeft);
        } else {
            moneyLeft = totalPrice - peterBudget;
            System.out.printf("Not enough money! You need %.2f leva more!%n", moneyLeft);
        }
    }
}
