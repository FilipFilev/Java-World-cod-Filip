package ConditionalStatementsLab31012023;

import java.util.Scanner;

public class P03_EvenorOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }


    }
}
