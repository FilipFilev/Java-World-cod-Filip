package JavaExercises29012023;

import java.util.Scanner;

public class P09_FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //IN
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        //BODY
        double volumeLitters = (length * width * height) * 0.001;
        double litersNeeded = volumeLitters * (1 - percent * 0.01);
        //OUT
        System.out.println(litersNeeded);

    }
}
