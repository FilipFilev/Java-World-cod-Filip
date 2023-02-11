package ForLoop10022023.Lab;

import java.util.Scanner;

public class P08_NumbersSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        int maxNum = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            if (currentNum > maxNum) {
                maxNum = currentNum;

            }
        }

        System.out.printf("Mas number: %d", maxNum);
        
    }

}
