package ConditionalStatementsLab31012023.L01ConditionalStatements;

import java.util.Scanner;

public class P04_PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();

        if (pass.equals("s3cr3t!P@ssw0rd")) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }

    }
}
