package AloneExam130323;

import java.util.Scanner;

public class P6B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //В началото програмата получава желаната височина на летвата от Тихомир
        int goal = Integer.parseInt(scanner.nextLine());
        //летвата
        int theBar = goal - 30;

        //помощни променливи
        int jumpsCounter = 0;
        int failsCounter = 0;

        while (true) {
            int currentJump = Integer.parseInt(scanner.nextLine());
            jumpsCounter++;

            if (currentJump > theBar) {
                if (theBar == goal) {
                    System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", theBar,jumpsCounter);
                    break;
                }
                theBar += 5;
                failsCounter = 0;

            } else if (failsCounter < 2) {
                failsCounter++;

            } else {
                System.out.printf("Tihomir failed at %dcm after %d jumps.", theBar,jumpsCounter);
                break;
            }


        }


    }
}
