package AloneExam140323;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();


        String input = scanner.nextLine();
        String winner = "";

        int winnerPoints = 0;
        int firstPoints = 0;
        int secondPoints = 0;

        boolean hasNumberWars = false;

        while (!input.equals("End of game")) {
            int firstPlayerCard = Integer.parseInt(input);
            int secondPlayerCard = Integer.parseInt(scanner.nextLine());;

            if (firstPlayerCard > secondPlayerCard) {
                firstPoints += firstPlayerCard - secondPlayerCard;

            } else if (secondPlayerCard > firstPlayerCard ){
                secondPoints += secondPlayerCard - firstPlayerCard;

            }

            if (firstPlayerCard == secondPlayerCard) {
                firstPlayerCard = Integer.parseInt(scanner.nextLine());
                secondPlayerCard = Integer.parseInt(scanner.nextLine());

                if (firstPlayerCard > secondPlayerCard) {
                    winner = firstName;
                    winnerPoints = firstPoints;
                } else {
                    winner = secondName;
                    winnerPoints = secondPoints;
                }

                System.out.println("Number wars!");
                System.out.printf("%s is winner with %d points%n", winner, winnerPoints);
                hasNumberWars = true;
                break;
            }



            input = scanner.nextLine();
        }


        if (!hasNumberWars) {
            System.out.printf("%s has %d points%n", firstName, firstPoints);
            System.out.printf("%s has %d points%n", secondName, secondPoints);

        }
    }
}
