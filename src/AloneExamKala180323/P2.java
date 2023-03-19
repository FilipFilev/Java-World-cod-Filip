package AloneExamKala180323;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //1.	Цената на багаж над 20 кг - реално число в диапазона [10.0…80.0]
        //2.	Килограми на багажа - реално число в диапазона [1.0…32.0]
        //3.	Дни до пътуването - цяло число в диапазона [1…60]
        //4.	Брой багажи - цяло число в диапазона [1…10]

        double bagPriceAbove20kg = Double.parseDouble(scanner.nextLine());
        double bagKilograms = Double.parseDouble(scanner.nextLine());

        int daysTillTravel = Integer.parseInt(scanner.nextLine());
        int bagsCount = Integer.parseInt(scanner.nextLine());


        double priceBags = 0;

        if (bagKilograms < 10) {
            priceBags = bagPriceAbove20kg * 0.20;
        } else if (bagKilograms <= 20) {
            priceBags = bagPriceAbove20kg * 0.50;

        } else {
            priceBags = bagPriceAbove20kg;
        }


        if (daysTillTravel < 7) {
            priceBags = priceBags * 1.4;
        } else if (daysTillTravel <= 30) {
            priceBags *= 1.15;
        } else {
            priceBags *= 1.1;
        }


        System.out.printf("The total price of bags is: %.2f lv.", priceBags * bagsCount);
    }
}
