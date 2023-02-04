package JavaExercises29012023;

import java.util.Scanner;

public class P03_DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double API = Double.parseDouble(scanner.nextLine());
//        ИЗЧИСЛЕНИЯ---------
////      1. Изчисляваме натрупаната лихва: 200 * 0.057 (5.7%) = 11.40 лв. ---- За процент(лихвата) се дели на 100
//        2. Изчисляваме лихвата за 1 месец: 11.40 лв. / 12 месеца = 0.95 лв.
//        3. Общата сума е: 200 лв. + 3 * 0.95 лв. = 202.85 лв.
        double totalSum = deposit + months * ((deposit * API / 100) / 12);

//        ПРИНТ В КОНЗОЛАТА-------
        System.out.println(totalSum);

    }
}
