package WhileLoop150223.Exercises;

import java.util.Scanner;

public class P04Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //входни данни -> String
        //while -> command.equals("Going home")
        //прочитаме колко стъпки е минала за 1 излизане


        String command = scanner.nextLine();
        int countSteps = 0;

        while (!command.equals("Going home")) {
            int currentSteps = Integer.parseInt(command);
            countSteps += currentSteps;
            if (countSteps >= 10000) {
                break;
            }
            command = scanner.nextLine();
        }

        if (command.equals("Going home")) {
            int stepsToHome = Integer.parseInt(scanner.nextLine());
            countSteps += stepsToHome;
        }

        if (countSteps < 10000){
            System.out.printf("%d more steps to reach goal.", 10000 - countSteps);
        } else {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", countSteps - 10000);
        }
    }
}
