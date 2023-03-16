package AloneExam140323;

import java.util.Scanner;

public class P4B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playerOne = scanner.nextLine();
        String playerTwo = scanner.nextLine();

        int player1Points = 0;
        int player2Points = 0;
        boolean isNumberWars = false;

        int playerOneCard = 0;
        int playerTwoCard = 0;

        String input = scanner.nextLine();

        while (!input.equals("End of game")) {

            playerOneCard = Integer.parseInt(input);
            playerTwoCard = Integer.parseInt(scanner.nextLine());

            if (playerOneCard > playerTwoCard) {
                player1Points += playerOneCard - playerTwoCard;

            } else if (playerOneCard == playerTwoCard) {
                playerOneCard = Integer.parseInt(scanner.nextLine());
                playerTwoCard = Integer.parseInt(scanner.nextLine());
                isNumberWars = true;
                break;

            } else {
                player2Points += playerTwoCard - playerOneCard;
            }
            input = scanner.nextLine();
        }


        if (isNumberWars) {

            if (playerOneCard > playerTwoCard) {
                System.out.printf("Number wars!%n%s is winner with %d points", playerOne, player1Points);
            } else {
                System.out.printf("Number wars!%n%s is winner with %d points", playerTwo, player2Points);
            }

        } else {
            System.out.printf("%s has %d points%n", playerOne, player1Points);
            System.out.printf("%s has %d points", playerTwo, player2Points);
        }
    }
}
