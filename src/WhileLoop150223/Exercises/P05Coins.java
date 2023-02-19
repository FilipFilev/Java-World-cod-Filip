package WhileLoop150223.Exercises;

import java.util.Scanner;

public class P05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //прочитаме ресто, което да върнем
        //превръщаме рестото в стотинки
        //while -> totalSum > 0
        //проверка за totalSum -> възможно най-голямата монета
        double sum = Double.parseDouble(scanner.nextLine());

        double totalSum = sum * 100;
        int countCoins = 0;

        while (totalSum > 0) {

            if (totalSum >= 200) {
                totalSum -= 200;
                countCoins++;
            } else if (totalSum >= 100) {
                totalSum -= 100;
                countCoins++;
            } else if (totalSum >= 50) {
                totalSum -= 50;
                countCoins++;
            } else if (totalSum >= 20) {
                totalSum -= 20;
                countCoins++;
            } else if (totalSum >= 10) {
                totalSum -= 10;
                countCoins++;
            } else if (totalSum >= 5) {
                totalSum -= 5;
                countCoins++;
            } else if (totalSum >= 2) {
                totalSum -= 2;
                countCoins++;
            } else if (totalSum >= 1) {
                totalSum -= 1;
                countCoins++;
            }

        }

        System.out.println(countCoins);


    }
}
