package AloneExamKala180323;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double tennisRacketPrice = Double.parseDouble(scanner.nextLine());
        int tennisRacketsCount = Integer.parseInt(scanner.nextLine());
        int runners = Integer.parseInt(scanner.nextLine()); // count



        double racketsTotalSum = tennisRacketsCount * tennisRacketPrice;

        double runnersPrice = tennisRacketPrice / 6;
        double  runnersTotalSum = runners * runnersPrice;

        double otherEquip = (runnersTotalSum + racketsTotalSum) * 0.20;

        double totalPrice = racketsTotalSum + runnersTotalSum + otherEquip;
        double djokovic = totalPrice / 8;
        double sponsors = totalPrice  * 7 / 8;


        System.out.printf("Price to be paid by Djokovic %.0f%n",Math.floor(djokovic));
        System.out.printf("Price to be paid by sponsors %.0f%n",Math.ceil(sponsors));

    }
}
