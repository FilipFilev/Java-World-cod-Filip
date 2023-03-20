package Exam190323;

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int k = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        int count = 0;
        boolean isEnough = false;

        for (int i = k; i <= 8; i++) {
            for (int j = 9; j >= l; j--) {
                for (int o = m; o <= 8; o++) {
                    for (int p = 9; p >= n; p--) {
                        if (i % 2 == 0 && j % 2 != 0 && o % 2 == 0 && p % 2 != 0) {
                            boolean isValid = true;
                            int firstNum = i * 10 + j;
                            int secondNum = o * 10 + p;
                            if (isValid && firstNum != secondNum) {
                                System.out.printf("%d - %d%n", firstNum, secondNum);
                                count++;
                                if (count == 6) {
                                    return;
                                }
                            } else if (isValid && firstNum == secondNum) {
                                System.out.println("Cannot change the same player.");
                            }
                        }
                    }
                }
            }
        }
    }
}