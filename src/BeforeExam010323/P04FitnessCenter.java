package BeforeExam010323;

import java.util.Scanner;

public class P04FitnessCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());

        int backCount = 0;
        int chestCount = 0;
        int legsCount = 0;
        int absCount = 0;
        int proteinShakeCount = 0;
        int proteinBarCount = 0;

        for (int i = 1; i <= people; i++) {
            String action = scanner.nextLine();

            switch (action) {
                case "Back":
                    backCount++;
                    break;
                case "Chest":
                    chestCount++;
                    break;
                case "Legs":
                    legsCount++;
                    break;
                case "Abs":
                    absCount++;
                    break;
                case "Protein shake":
                    proteinShakeCount++;
                    break;
                case "Protein bar":
                    proteinBarCount++;
                    break;
            }
        }
        System.out.printf("%d - back%n", backCount);
        System.out.printf("%d - chest%n", chestCount);
        System.out.printf("%d - legs%n", legsCount);
        System.out.printf("%d - abs%n", absCount);
        System.out.printf("%d - protein shake%n", proteinShakeCount);
        System.out.printf("%d - protein bar%n", proteinBarCount);

        int sumWorkout= backCount + chestCount + legsCount + absCount;
        System.out.printf("%.2f%% - work out%n", sumWorkout * 1.0  / people * 100 );

        int sumProtein = proteinShakeCount + proteinBarCount;
        System.out.printf("%.2f%% - protein%n", sumProtein * 1.0  / people * 100 );
    }
}
