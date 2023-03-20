package Exam190323;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //•	Първи ред – дни за престой – цяло число в интервала [0...365]
        //•	Втори ред –  вид помещение –  "room for one person",  "apartment" или "president apartment"
        //•	Трети ред –  оценка - "positive"  или "negative"

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String feedBack = scanner.nextLine();
        int nights = days -1;

        double price = 0;
        double discount = 0.00;

        boolean isDiscount = false;
        double finalSum = 0;
        if (roomType.equals("room for one person")){
            if ( days < 10){
                price = nights * 18.00;
            } else if (nights <= 15) {
                price = nights * 18;
            } else if  (nights > 15) {
                price = nights * 18;
            }
            finalSum = price;
        } else if (roomType.equals("apartment")) {
            if ( days < 10){
                price = nights * 25.00;
                discount = 0.3;
            } else if (days <= 15) {
                price =  nights * 25;
                discount = 0.35;
            } else if ( days > 15) {
                price = nights * 25;
                discount = 0.5;
            }
            finalSum = price - (price * discount);
        } else if (roomType.equals("president apartment")) {
            if ( days < 10){
                price = nights * 35.00;
                discount = 0.10;
            } else if (days <= 15) {
                price = nights * 35;
                discount = 0.15;
            } else if ( days > 15) {
                price = nights * 35;
                discount = 0.20;
            }
            finalSum = price - (price * discount);
        }

        if (feedBack.equals("positive")){
            finalSum *= 1.25;
        } else if (feedBack.equals("negative")) {
            finalSum *= 0.9;
        }


        System.out.printf("%.2f", finalSum);


    }
}
