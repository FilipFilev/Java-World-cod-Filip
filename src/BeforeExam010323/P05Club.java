package BeforeExam010323;

import java.util.Scanner;

public class P05Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double totalSum = 0;
        String input = scanner.nextLine();

        while (!input.equals("Party!")) {
            String cocktailName = input;
            int cocktailsCount = Integer.parseInt(scanner.nextLine());
            double sumCurrentCocktail = cocktailName.length() * cocktailsCount;

            if (sumCurrentCocktail % 2 != 0 ) {
                sumCurrentCocktail = sumCurrentCocktail * 0.75;
            }
            totalSum = totalSum + sumCurrentCocktail;

            if (totalSum >= income) {
                break;
            }
            input = scanner.nextLine();
        }

        if (income > totalSum) {
            double diff = income - totalSum;
            System.out.printf("We need %.2f leva more.%n", diff);
            System.out.printf("Club income - %.2f leva.", totalSum);
        } else {
            System.out.println("Target acquired.");
            System.out.printf("Club income - %.2f leva.", totalSum);
        }

    }
}
