package NestedLoops220223.Exercises;

import java.util.Scanner;

public class P03SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sumPrime = 0;
        int sumNonPrime = 0;

        while (!input.equals("stop")) {

            int currentNum = Integer.parseInt(input);
            boolean isPrime = true;

            if (currentNum < 0) {
                System.out.printf("Number is negative.%n");
                input = scanner.nextLine();
                continue;
            }

            for (int current = 2; current <= currentNum - 1; current++) {

                if (currentNum % current == 0) {
                    isPrime = false;
                    sumNonPrime += currentNum;
                    break;
                }
            }

            if (isPrime) {
                sumPrime += currentNum;

            }

            input = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d%n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d%n", sumNonPrime);
    }
}
