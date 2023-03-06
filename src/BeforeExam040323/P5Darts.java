package BeforeExam040323;

import java.util.Scanner;

public class P5Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String player = scanner.nextLine();
        int startingPoints = 301;
        int unsuccessfulShots = 0;
        int successfulShots = 0;

        // 1. Поле – текст ("Single", "Double" или "Triple")
        String field = scanner.nextLine();

        while (!field.equals("Retire")) {
            //2.	Точки – цяло число в интервала [0… 100]
            int currentPoints = Integer.parseInt(scanner.nextLine());
            int points = 0;
            switch (field) {
                case "Single":
                    points = currentPoints;
                    break;

                case "Double":
                    points = 2 * currentPoints;
                    break;

                case "Triple":
                    points = 3 * currentPoints;
                    break;
            }
            // невалиден изстрел
            if (startingPoints >= points) {
                startingPoints = startingPoints - points;
                successfulShots++;

            } else {
                unsuccessfulShots++;
            }
            //ако точките са станали 0, прекъсваме цикъла
            if (startingPoints == 0) {
                break;
            }

            field = scanner.nextLine();
        }
        // Победилвхи
        if (startingPoints == 0) {
            System.out.printf("%s won the leg with %d shots.%n",player, successfulShots);
        } else {
            System.out.printf("%s retired after %d unsuccessful shots.%n", player, unsuccessfulShots);
        }


    }
}
