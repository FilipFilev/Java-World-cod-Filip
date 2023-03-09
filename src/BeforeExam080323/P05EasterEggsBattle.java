package BeforeExam080323;

import java.util.Scanner;

public class P05EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Първоначално се четат два реда:
        //1.	Брой яйца, които има първият играч - цяло число в интервала [1 … 99]
        //2.	Брой яйца, които има вторият играч - цяло число в интервала [1 … 99]
        //След това до получаване на команда "End" се четe многократно един ред:
        //3.	Победител - текст - "one" или "two"
        int firstPlayerEggs = Integer.parseInt(scanner.nextLine());
        int secondPlayerEggs = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        boolean isFirstWin = false;
        boolean isSecondWin = false;
        while (!input.equals("End")) {

            if (input.equals("one")) {
                secondPlayerEggs--;
            } else if (input.equals("two")) {
                firstPlayerEggs--;
            }
            //дали яйцата му са свършили
            if (firstPlayerEggs == 0) {
                isSecondWin = true;
                break;
            }
            if (secondPlayerEggs == 0) {
                isFirstWin = true;
                break;
            }

            input = scanner.nextLine();
        }

        if (isSecondWin == true) {
            System.out.printf("Player one is out of eggs. Player two has %d eggs left.%n", secondPlayerEggs);

        } else if (isFirstWin == true) {
            System.out.printf("Player two is out of eggs. Player one has %d eggs left.%n", firstPlayerEggs);

        } else {
            System.out.printf("Player one has %d eggs left.%n", firstPlayerEggs);
            System.out.printf("Player two has %d eggs left.%n", secondPlayerEggs);
        }

    }
}
