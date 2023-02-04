package L02ConditionalStatements;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 40;
        int num2 = 50;
        int num3 = 30;

        if (num1 <= 10) {
            System.out.println(num1);
        } else if (num2 <= 20) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }


    }

}
