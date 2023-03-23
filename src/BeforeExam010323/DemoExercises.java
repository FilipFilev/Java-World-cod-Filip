package BeforeExam010323;

import java.util.Scanner;

public class DemoExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        //java
        //0123
        for (int i = 0; i <text.length() ; i++) {
            char symbol = text.charAt(i);
            System.out.print(symbol);

        }

    }
}
