package ForLoop10022023.Lab;

import java.util.Scanner;

public class P06_VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //  буква	a	e	i	o	u
        //стойност	1	2	3	4	5

        String text = scanner.nextLine();


        int sum = 0;
        //hello
        for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);


            switch (currentSymbol) {
                case 'a':
                    sum = sum + 1;
                    break;
                case 'e':
                    sum = sum + 2;
                    break;
                case 'i':
                    sum = sum + 3;
                    break;
                case 'o':
                    sum = sum + 4;
                    break;
                case 'u':
                    sum = sum + 5;
                    break;

            }


        }


        System.out.println(sum);
    }
}
