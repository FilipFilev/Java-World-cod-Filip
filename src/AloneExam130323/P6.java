package AloneExam130323;

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Първоначално от конзолата се прочита броя дни на турнира – цяло число в интервала [1… 20]
        //До получаване на командата "Finish" се чете:
        //•	Спорт  – текст
        //За всеки спорт се прочита:
        //o	Резултат  – текст с възможности: "win" или "lose"

        int days = Integer.parseInt(scanner.nextLine());


        int totalWins = 0;
        int totalLoses = 0;
        double totalEarnings = 0;
        for (int i = 1; i <= days; i++) {

            int winsCounter = 0;
            int losesCounter = 0;
            double earningsPerDay = 0;
            String input = scanner.nextLine();
            while (!input.equals("Finish")) {

                if (input.equals("win")) {
                    earningsPerDay += 20;
                    winsCounter++;
                } else if (input.equals("lose")) {
                    losesCounter++;
                }

                input = scanner.nextLine();
            }

            if (winsCounter > losesCounter) {
                earningsPerDay *= 1.1;
            }

            totalWins += winsCounter;
            totalLoses += losesCounter;
            totalEarnings += earningsPerDay;

        }

        if (totalWins > totalLoses) {

            System.out.printf("You won the tournament! Total raised money: %.2f", totalEarnings * 1.2);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalEarnings);
        }
    }
}