package AloneExam140323;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int taxPerYear = Integer.parseInt(scanner.nextLine());

        double runners = taxPerYear * 0.60;
        double suit = runners - (runners * 0.20);
        double ball = suit * 0.25;
        double acc = ball * 0.20;

        double totalPrice = taxPerYear + runners + suit + ball + acc;

        System.out.printf("%.2f", totalPrice);

    }
}
