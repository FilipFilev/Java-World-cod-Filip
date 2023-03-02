package BeforeExam010323;

import java.util.Scanner;

public class P01PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Първи ред – брой на хората. Цяло число в интервала [1…100]
        //•	Втори ред – такса вход. Реално число в интервала [0.00…50.00]
        //•	Трети ред – цена един за шезлонг. Реално число в интервала [0.00…50.00]
        //•	Четвърти ред – цена за един чадър. Реално число в интервала [0.00...50.00]

        int people = Integer.parseInt(scanner.nextLine());
        double taxEntrance = Double.parseDouble(scanner.nextLine());
        double chairPrice = Double.parseDouble(scanner.nextLine());
        double umbrellaPrice = Double.parseDouble(scanner.nextLine());

        double allTaxes = people * taxEntrance;
        double allChairs = Math.ceil(people * 0.75) * chairPrice;
        double allUmbrellas = Math.ceil(people * 0.50) * umbrellaPrice;

        double totalSum = allTaxes + allChairs + allUmbrellas;

        System.out.printf("%.2f lv. ", totalSum);
    }
}
