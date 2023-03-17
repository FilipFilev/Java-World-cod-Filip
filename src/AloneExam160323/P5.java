package AloneExam160323;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double countP1 = 0;
        double countP2 = 0;
        double countP3 = 0;

        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            if (currentNum % 2 == 0) {
                countP1++;
            }
            if (currentNum % 3 == 0) {
                countP2++;
            }
            if (currentNum % 4 == 0) {
                countP3++;
            }


        }

        double p1 = countP1 / n * 100;
        double p2 = countP2 / n * 100;
        double p3 = countP3 / n * 100;

        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);

    }
}
