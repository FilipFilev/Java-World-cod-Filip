package NestedLoops220223.Exercises;

import java.util.Scanner;

public class P02EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        for (int currentNumber = firstNum; currentNumber <= secondNum ; currentNumber++) {

            int firstDigit = currentNumber / 100000;
            int secondDigit = currentNumber / 10000 % 10;
            int thirdDigit = currentNumber / 1000 % 10;
            int fourthDigit = currentNumber / 100 % 10;
            int fifthDigit = currentNumber / 10 % 10;
            int sixthDigit = currentNumber  % 10;

            int evenSum = secondDigit + fourthDigit + sixthDigit;
            int oddSum = firstDigit + thirdDigit + fifthDigit;

            if (evenSum == oddSum) {
                System.out.printf("%d ", currentNumber);
            }








        }
    }
}
