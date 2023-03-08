package BeforeExam080323;

import java.util.Scanner;

public class P01FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double strawberriesPrice = Double.parseDouble(scanner.nextLine());
        double bananasKgs = Double.parseDouble(scanner.nextLine());
        double orangesKgs = Double.parseDouble(scanner.nextLine());
        double raspberriesKgs = Double.parseDouble(scanner.nextLine());
        double strawberriesKgs = Double.parseDouble(scanner.nextLine());


        double raspberriesPrice = strawberriesPrice / 2;
        double orangesPrice = raspberriesPrice * 0.60;
        double bananasPrice = raspberriesPrice * 0.20;


        double totalPrice = (strawberriesPrice * strawberriesKgs) +
                (bananasPrice * bananasKgs) +
                (orangesPrice * orangesKgs) +
                (raspberriesPrice * raspberriesKgs);

        System.out.printf("%.2f", totalPrice);


    }
}
