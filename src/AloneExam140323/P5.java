package AloneExam140323;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //	W - ако е победител получава 2000 точки
        //	F - ако е финалист получава 1200 точки
        //	SF - ако е полуфиналист получава 720 точки
        int tournamentsCount = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        double currentPoints = 0;
        int placePoints = 0;
        int winsCounter = 0;
        for (int i = 1; i <= tournamentsCount; i++) {
            String place = scanner.nextLine();

            if (place.equals("W")) {
                winsCounter++;
                placePoints = 2000;
                currentPoints += placePoints;

            } else if (place.equals("F")) {
                placePoints = 1200;
                currentPoints += placePoints;

            } else if (place.equals("SF")) {
                placePoints = 720;
                currentPoints += placePoints;

            }
        }

        double totalPoints = currentPoints + startingPoints;
        double averagePoints =Math.floor( currentPoints / tournamentsCount);
        double percentWins = (winsCounter * 1.0 / tournamentsCount) * 100;

        System.out.printf("Final points: %.0f%n", totalPoints);
        System.out.printf("Average points: %.0f%n", averagePoints);
        System.out.printf("%.2f%%", percentWins);

    }
}