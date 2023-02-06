package ConditionalStatements31012023.L02ConditionalStatements;

import java.util.Scanner;

public class P01SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstSeconds = Integer.parseInt(scanner.nextLine());
        int secondSeconds = Integer.parseInt(scanner.nextLine());
        int thirdSeconds = Integer.parseInt(scanner.nextLine());

        int sumSeconds = firstSeconds + secondSeconds + thirdSeconds;
        //123 % 60 = 2
        //120
        //
        int minutes = sumSeconds / 60;
        int seconds = sumSeconds % 60;

        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }

    }
}
