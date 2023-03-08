package BeofreExam070323;

import java.util.Scanner;

public class testExam3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String size = scanner.nextLine();
        String color = scanner.nextLine();
        int counts = Integer.parseInt(scanner.nextLine());
        //проверка за дестинация


        //•	Първи ред – размер на яйцата – текст с възможности "Large", "Medium" или "Small"
        //•	Втори ред – цвят на яйцата – текст  с възможности "Red", "Green" или "Yellow"
        //•	Трети ред – брой партиди – цяло число в интервала [1… 350]
        double price = 0;
        switch (size) {
            case "Large":
                if (color.equals("Red")) {
                    price = 16;

                } else if (color.equals("Green")) {
                    price = 12;

                } else if (color.equals("Yellow")) {
                    price = 9;

                }
                break;
            case "Medium":
                if (color.equals("Red")) {
                    price = 13;

                } else if (color.equals("Green")) {
                    price = 9;

                } else if (color.equals("Yellow")) {
                    price = 7;

                }
                break;
            case "Small":
                if (color.equals("Red")) {
                    price = 9;

                } else if (color.equals("Green")) {
                    price = 8;

                } else if (color.equals("Yellow")) {
                    price = 5;

                }
                break;
        }

        double neededMoney = counts * price;
        double allProfit = neededMoney * 0.65;
        System.out.printf("%.2f leva.", allProfit);
    }
}
