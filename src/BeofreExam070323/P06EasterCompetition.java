package BeofreExam070323;

import java.util.Scanner;

public class P06EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterBreadCount = Integer.parseInt(scanner.nextLine());

        int maxScores = Integer.MIN_VALUE;
        for (int i = 1; i <= easterBreadCount ; i++) {
            String name = scanner.nextLine();





            int totalScores = 0;
            String input = scanner.nextLine();
            while (!input.equals("Stop")) {
                int scores = Integer.parseInt(input);

                totalScores += scores;

                input = scanner.nextLine();
            }

            if (totalScores > maxScores) {
                maxScores = totalScores;
                System.out.printf("%s is the new number 1!", name);
            }

            System.out.printf("%s has %d points.%n", name, totalScores);

        }




    }
}
