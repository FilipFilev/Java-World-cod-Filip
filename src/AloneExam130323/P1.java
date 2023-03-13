package AloneExam130323;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double rent = Double.parseDouble(scanner.nextLine());
        double cakePrice = rent * 0.2;
        double drinks = cakePrice * 0.55;
        double person = rent / 3;

        //Изход
        //Да се отпечата на конзолата какъв бюджет ще бъде необходим за организиране на тържеството.
        double totalPrice = rent + cakePrice + drinks + person;
        System.out.println(totalPrice);

    }
}
