package AloneExam130323;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се четат 3 реда:
        //1.	Плод - текст с възможности: "Watermelon", "Mango", "Pineapple" или "Raspberry"
        String fruit = scanner.nextLine();
        //2.	Размерът на сета - текст с възможности: "small" или "big"
        String size = scanner.nextLine();
        //3.	Брой на поръчаните сетове - цяло число в интервала [1 … 10000]
        int setsCount = Integer.parseInt(scanner.nextLine());
        //Watermelon Mango Pineapple Raspberry
        //	                   Диня 	      Манго	        Ананас	           Малина
        //2 броя (small)	56 лв./бр.	    36.66 лв./бр.   42.10 лв./бр.	20 лв./бр.
        //5 броя (big)	    28.70 лв./бр.	19.60 лв./бр.	24.80 лв./бр.	15.20 лв./бр.


        double priceSmall = 0;
        double priceBig = 0;
        double totalPrice = 0;

        switch (size) {
            case "big":
                if (fruit.equals("Watermelon")) {
                    priceBig = 5 * 28.70;
                    totalPrice = priceBig * setsCount;

                } else if (fruit.equals("Mango")) {
                    priceBig = 5 * 19.60;
                    totalPrice = priceBig * setsCount;

                } else if (fruit.equals("Pineapple")) {

                    priceBig = 5 * 24.80;
                    totalPrice = priceBig * setsCount;
                } else if (fruit.equals("Raspberry")) {

                    priceBig = 5 * 15.20;
                    totalPrice = priceBig * setsCount;
                }
                break;

            case "small":
                if (fruit.equals("Watermelon")) {
                    priceBig = 2 * 56.00;
                    totalPrice = priceBig * setsCount;

                } else if (fruit.equals("Mango")) {
                    priceBig = 2 * 36.66;
                    totalPrice = priceBig * setsCount;

                } else if (fruit.equals("Pineapple")) {

                    priceBig = 2 * 42.10;
                    totalPrice = priceBig * setsCount;
                } else if (fruit.equals("Raspberry")) {

                    priceBig = 2 * 20;
                    totalPrice = priceBig * setsCount;
                }

                break;
        }


       if (totalPrice >= 400 && totalPrice <= 1000) {
           totalPrice *= 0.85;
       } else if (totalPrice > 1000) {
           totalPrice *= 0.5;
       }

        System.out.printf("%.2f lv.", totalPrice);

    }

}

