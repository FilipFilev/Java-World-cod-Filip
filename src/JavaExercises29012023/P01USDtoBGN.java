package JavaExercises29012023;

import java.util.Scanner;

public class P01USDtoBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//четенe от конзолата(въвеждаме стойност
        double usd = Double.parseDouble(scanner.nextLine());
//       Изчисления
        double bgn = usd * 1.79549;
//      Принтираме на конзолата system.out
        System.out.println(bgn);


    }
}
