package BeforeExam010323;

import java.util.Scanner;

public class P04FitnessCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Вход
        //•	На първия ред – броят на посетителите във фитнеса – цяло число в интервала [1...1000]
        //•	За всеки един посетител на отделен ред – дейността във фитнеса – текст ("Back", "Chest", "Legs", "Abs", "Protein shake" или "Protein bar")
        int people = Integer.parseInt(scanner.nextLine()); //5
        //("Back", "Chest", 'Legs", "Abs"
        //("Protein shake", "Protein bar"
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

    }
}
