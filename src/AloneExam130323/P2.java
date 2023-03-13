package AloneExam130323;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	На първия ред - минути разходка на ден - цяло число в интервала [1...50]
        int minutesWalk = Integer.parseInt(scanner.nextLine());
        //•	На втория ред - броят на разходките дневно - цяло число в интервала [1…10]
        int walks = Integer.parseInt(scanner.nextLine());
        //•	На третия ред - приетите от котката калории на ден – цяло число в интервала [100…4000]
        int calories = Integer.parseInt(scanner.nextLine());

        int totalMinutesWalk = minutesWalk * walks;
        int burnedCalories = totalMinutesWalk * 5;

        int neededCalories = calories / 2;

        if (burnedCalories >= neededCalories) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", burnedCalories);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", burnedCalories);
        }

    }
}
