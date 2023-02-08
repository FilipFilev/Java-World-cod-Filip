package ConditionalStatementsAdvanced070223.Exercises;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());

        switch (number) {
            case 1:
                System.out.println("The number is " + 1);

            case 2:
                System.out.println("The number is " + 2);
                break;
        }
    }
}
