package WhileLoop150223.Exercises;

import java.util.Scanner;

public class P07Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int availableSpace = width * length * height;
        String command = scanner.nextLine();

        while (!command.equals("Done")) {
            int currentBoxes = Integer.parseInt(command);
            availableSpace -= currentBoxes; // availableSpace = availableSpace - currentBoxes

            if (availableSpace <= 0){
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(availableSpace));
                break;
            }

            command = scanner.nextLine();
        }

        if (availableSpace > 0) {
            System.out.printf("%d Cubic meters left.", availableSpace);
        }
    }
}
