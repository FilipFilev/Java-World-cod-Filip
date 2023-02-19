package WhileLoop150223.Exercises;

import java.util.Scanner;

public class P06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int countAllPieces = width * length;

        while (!command.equals("STOP")) {

            int currentCountPieces = Integer.parseInt(command);
            countAllPieces -= currentCountPieces;

            if (countAllPieces <= 0){
               // System.out.printf("No more cake left! You need %d pieces more.", Math.abs(countAllPieces));
                break;
            }


            command = scanner.nextLine();
        }

        if (countAllPieces > 0) {
            System.out.printf("%d pieces are left.", countAllPieces);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(countAllPieces));

        }
    }
}
