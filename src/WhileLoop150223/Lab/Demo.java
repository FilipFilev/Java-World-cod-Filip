package WhileLoop150223.Lab;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 5;

        while (a <= 10) {
//            if (a > 10) {
//                break;
//            }
            System.out.println("a = " + a);
            a++;
        }
    }
}