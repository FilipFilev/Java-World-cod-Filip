package NestedLoops220223.Lab;

import java.util.Scanner;

public class P01_Clock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        boolean flag = false;
        for (int h = 0; h <= 23; h++) {
            for (int m = 0; m <= 59; m++) {
                if (h == 0 && m == 5) {
                    flag = true;
                    break;
                }
                System.out.printf("%d:%d%n", h, m);
            }
            if (flag) {
                break;
            }

        }
    }
}
