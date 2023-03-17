package AloneExam140323;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Резултат от първия мач – текст
        //2.	Резултат от втория мач – текст
        //3.	Резултат от третия мач – текст

        String firstMatch = scanner.nextLine();
        String secondMatch = scanner.nextLine();
        String thirdMatch = scanner.nextLine();

        int wins = 0;
        int loses = 0;
        int draws = 0;

        char firstGameHost =  firstMatch.charAt(0);
        char firstGameGuest =  firstMatch.charAt(2);
        if (firstGameHost > firstGameGuest) {
            wins++;
        } else if (firstGameGuest > firstGameHost) {
            loses++;
        } else {
            draws++;
        }

        char secondGameHost =  secondMatch.charAt(0); //Резултатите ще са в следния формат:// "2:0", "0:1", "1:1"
        char secondGameGuest =  secondMatch.charAt(2);
        if (secondGameHost > secondGameGuest) {
            wins++;
        } else if (secondGameGuest > secondGameHost) {
            loses++;
        } else {
            draws++;
        }

        char thirdGameHost =  thirdMatch.charAt(0);
        char thirdGameGuest =  thirdMatch.charAt(2);
        if (thirdGameHost > thirdGameGuest) {
            wins++;
        } else if (thirdGameGuest > thirdGameHost) {
            loses++;
        } else {
            draws++;
        }


        System.out.printf("Team won %d games.%n", wins);
        System.out.printf("Team lost %d games.%n", loses);
        System.out.printf("Drawn games: %d%n", draws);

    }
}
