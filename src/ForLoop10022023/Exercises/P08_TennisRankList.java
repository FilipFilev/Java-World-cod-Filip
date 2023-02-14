package ForLoop10022023.Exercises;

import java.util.Scanner;

public class P08_TennisRankList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //От конзолата първо се четат два реда:
        //•	Брой турнири, в които е участвал – цяло число в интервала [1…20]
        //•	Начален брой точки в ранглистата - цяло число в интервала [1...4000]
        //За всеки турнир се прочита отделен ред:
        //•	Достигнат етап от турнира – текст – "W", "F" или "SF"

        int countTournament = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        int countWins = 0;
        int sumAllTournamentPoints = 0;
        for (int i = 1; i <= countTournament ; i++) {
            String currentStage = scanner.nextLine();

            if (currentStage.equals("W")) {
                countWins++;
                sumAllTournamentPoints += 2000;
            } else if (currentStage.equals("F")) {
                sumAllTournamentPoints += 1200;
            } else if (currentStage.equals("SF")) {
                sumAllTournamentPoints += 720;
            }

        }

        int finalPoints = startingPoints + sumAllTournamentPoints;
        int averagePoints = sumAllTournamentPoints / countTournament;
        double percentWins = (countWins * 1.0 / countTournament) * 100;

        System.out.printf("Final points: %d%n", finalPoints);
        System.out.printf("Average points: %d%n", averagePoints);
        System.out.printf("%.2f%%", percentWins);

    }

}
