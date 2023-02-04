package L02ConditionalStatements;

import java.util.Scanner;

public class P03_TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        // най-лесно се всичко се обръща в една мерна единица. Примерно в минути

        int totalMinutes = hours * 60 + minutes + 15;
        int finalHours = totalMinutes / 60;
        int finalMinutes = totalMinutes % 60;

        if (finalHours < 24) {

            System.out.printf("%d:%02d", finalHours, finalMinutes);
        } else {
            finalHours = 0;
            System.out.printf("%d:%02d", finalHours, finalMinutes);
        }


    }
}
