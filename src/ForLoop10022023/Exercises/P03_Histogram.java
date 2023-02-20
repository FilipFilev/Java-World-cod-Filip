package ForLoop10022023.Exercises;

import java.util.Scanner;

public class P03_Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. Прочетем n на брой числа - потребителя да ни каже колко числа да прочетем
        //1а Да направим променливи за всички интервали ->  бройката числа за определен интервал
        //1б Правим for loop n на брой повторения (итерации)
        //2. Прочитаме число
        //3. Проверяваме в кой дизапазон е числото
        //4. Пресмятаме процента за всеки диапазон
        //5. Принтираме

        int n = Integer.parseInt(scanner.nextLine());

        int p1Count = 0;
        int p2Count = 0;
        int p3Count = 0;
        int p4Count = 0;
        int p5Count = 0;

        for (int i = 1; i <= n; i++) {

            int currentNum = Integer.parseInt(scanner.nextLine());

            if (currentNum < 200) {
                p1Count++; //p1Count = p1Count + 1;
            } else if (currentNum <= 399) {
                p2Count++;

            } else if (currentNum <= 599) {
                p3Count++;
            } else if (currentNum <= 799) {
                p4Count++;

            } else {
                p5Count++;
            }
        }
        double percentP1 = (p1Count * 1.0 / n) * 100;
        double percentP2 = (p2Count * 1.0 / n) * 100;
        double percentP3 = (p3Count * 1.0 / n) * 100;
        double percentP4 = (p4Count * 1.0 / n) * 100;
        double percentP5 = (p5Count * 1.0 / n) * 100;

        System.out.printf("%.2f%%%n",percentP1);
        System.out.printf("%.2f%%%n",percentP2);
        System.out.printf("%.2f%%%n",percentP3);
        System.out.printf("%.2f%%%n",percentP4);
        System.out.printf("%.2f%%%n",percentP5);

    }
}
