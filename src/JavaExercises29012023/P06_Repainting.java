package JavaExercises29012023;

import java.util.Scanner;

public class P06_Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	Предпазен найлон - 1.50 лв. за кв. метър
//•	        Боя - 14.50 лв. за литър
//•     	Разредител за боя - 5.00 лв. за литър

//        IN
        int nylon = Integer.parseInt(scanner.next());
        int paint = Integer.parseInt(scanner.next());
        int thinner = Integer.parseInt(scanner.next());
        int hours = Integer.parseInt(scanner.next());
//      BODY(calculations)
        double nylonPrice = (nylon + 2) * 1.50;
        double paintPrice = (paint + (paint * 0.1)) * 14.50;
        double thinnerPrice = thinner * 5.00;
        double bagsPrice = 0.40;

        double materialsSum = nylonPrice + paintPrice + thinnerPrice + bagsPrice;
        double workersSum = (materialsSum * 0.3) * hours;
//        OUT
        System.out.println(materialsSum + workersSum);

    }
}

