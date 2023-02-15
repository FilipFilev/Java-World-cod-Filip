package WhileLoop150223.Lab;

import java.util.Scanner;

public class P03SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        while (sum < num) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum += currentNum;
        }

        System.out.println(sum);

    }
}
