package ForLoop10022023.Lab;

import java.util.Scanner;

public class P04_EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        //n 7 -> 0 2 4 6
        int num = 1;
        for (int i = 0;  i <= n; i += 2) {
            System.out.println(num);
            num = num * 2 * 2;





        }

        



    }

}
