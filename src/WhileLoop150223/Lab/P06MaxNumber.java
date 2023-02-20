package WhileLoop150223.Lab;

import java.util.Scanner;

public class P06MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(); // "100" или "Stop"

        int maxNum = Integer.MIN_VALUE;
        while (!input.equals("Stop")) {
            int currentNum = Integer.parseInt(input); //

            if (currentNum > maxNum) {
                maxNum = currentNum;
            }

            input = scanner.nextLine();
        }

        System.out.println(maxNum);
    }
}
