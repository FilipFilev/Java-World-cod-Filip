package AloneExam130323;

import java.util.Scanner;

public class P1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	1 биткойн = 1168 лева.
        //•	1 китайски юан = 0.15 долара.
        //•	1 долар = 1.76 лева.
        //•	1 евро = 1.95 лева.
        //•	На първия ред – броят биткойни. Цяло число в интервала [0…20]
        int bitcoin = Integer.parseInt(scanner.nextLine());
        //•	На втория ред – броят китайски юана. Реално число в интервала [0.00… 50 000.00]
        double yuan = Double.parseDouble(scanner.nextLine());
        //•	На третия ред – комисионната. Реално число в интервала [0.00 ... 5.00]
        double commission = Double.parseDouble(scanner.nextLine());


        double bitcoinInBGN = bitcoin * 1168;
        double yuanInBGN = yuan * 0.15 * 1.76;
        double sumInEuro = (bitcoinInBGN + yuanInBGN) / 1.95;

        double totalSum = sumInEuro - (sumInEuro * commission / 100 );


        System.out.printf("%.2f",totalSum);
    }
}
