package ConditionalStatements31012023.L01ConditionalStatements;

import java.util.Scanner;

public class P01_ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //IN
        int grade = Integer.parseInt(scanner.nextLine());
        //BODY
        if (grade >= 5) {
            System.out.println("Excellent!");
        } else {
            System.out.println("Poor");
        }
    }
}

