package ForLoop10022023.Lab;

import java.util.Scanner;

public class P08_NumbersSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) { // в скобите на for зависи колко итерации ще имаме (брой повторения на цикъл)
            int currentNum = Integer.parseInt(scanner.nextLine());

            if (currentNum > maxNum) {
                maxNum = currentNum;
            }
            if (currentNum < minNum) {
                minNum = currentNum;
            }

        }

        System.out.printf("Max number: %d%n", maxNum);
        System.out.printf("Min number: %d%n", minNum);
        
    }
}
