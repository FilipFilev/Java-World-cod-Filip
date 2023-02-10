package ForLoop10022023.Lab;

import java.util.Scanner;

public class P06_VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //  буква	a	e	i	o	u
        //стойност	1	2	3	4	5

        String text = scanner.nextLine();


        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);

            System.out.println(currentSymbol);
        }


    }
}
