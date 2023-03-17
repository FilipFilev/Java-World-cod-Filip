package AloneExam140323;

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        double totalGames = 0;
        double totalWins = 0;
        double totalLoses = 0;
        String input = scanner.nextLine();
        while (!input.equals("End of tournaments")) {

            int matches = Integer.parseInt(scanner.nextLine());

            int gamesCounter = 1;
            for (int i = 1; i <= matches; i++) {
                int allyPoints = Integer.parseInt(scanner.nextLine());
                int enemyPoints = Integer.parseInt(scanner.nextLine());


                int diff = Math.abs(allyPoints - enemyPoints);
                if (allyPoints > enemyPoints) {
                    totalWins++;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", gamesCounter, input, diff);
                } else {
                    totalLoses++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", gamesCounter, input, diff);
                }

                totalGames++;
                gamesCounter++;

            }

            input = scanner.nextLine();
        }

        double percentWins = totalWins / totalGames * 100;
        System.out.printf("%.2f%% matches win%n", percentWins);

        double percentLoses = totalLoses / totalGames * 100;
        System.out.printf("%.2f%% matches lost", percentLoses);

    }
}
