package BeforeExam010323;

import java.util.Scanner;

public class P06EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterBreadCount = Integer.parseInt(scanner.nextLine());

        int maxPoints = Integer.MIN_VALUE;
        String winnerName = "";

        for (int i = 1; i <= easterBreadCount ; i++) {
            String bakerName = scanner.nextLine();

            int sumCurrentPoints = 0;
            String input = scanner.nextLine();
            while (!input.equals("Stop")) {
                int currentPoints = Integer.parseInt(input);

                sumCurrentPoints += currentPoints;

                input = scanner.nextLine();
            }

            System.out.printf("%s has %d points.%n", bakerName, sumCurrentPoints);

            if (sumCurrentPoints > maxPoints) {
                maxPoints = sumCurrentPoints;
                System.out.printf("%s is the new number 1!%n", bakerName);
                winnerName = bakerName;
            }
        }

        System.out.printf("%s won competition with %d points!%n", winnerName, maxPoints);
    }
}
