package ConditionalStatementsLab31012023;

import java.util.Scanner;

public class P02_GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        if (firstNum > secondNum) {
            System.out.println(firstNum);
        } else {
            System.out.println(secondNum);
        }
    }
}
