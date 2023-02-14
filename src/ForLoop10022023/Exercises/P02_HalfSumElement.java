package ForLoop10022023.Exercises;

import java.util.Scanner;

public class P02_HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int maxNum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= number; i++) {

            int currentNum = Integer.parseInt(scanner.nextLine());

            sum += currentNum; //по този начин sum = sum + currentNum

            if (currentNum > maxNum) {
                maxNum = currentNum;
            }
        }
        int sumWithoutMaxNumber = sum - maxNum;

        if (sumWithoutMaxNumber == maxNum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumWithoutMaxNumber);

        } else {
            int diff = Math.abs(sumWithoutMaxNumber - maxNum);
            System.out.println("Noо");
            System.out.printf("Diff = %d%n", diff);
        }
    }
}
