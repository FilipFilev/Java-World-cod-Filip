package NestedLoops220223.Exercises;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine()); // 123 % 10 = 3




        int lastDigit = number % 1;

        System.out.println(lastDigit);    }
}
