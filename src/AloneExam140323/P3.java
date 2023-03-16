package AloneExam140323;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //•	Над 4000 лири има 25% отстъпка и безплатни снимки с трофея
        // (ако  опцията за снимки е избрана, таксата от 40 лири за билет не се включва)
        //•	Над 2500 лири има 10% отстъпка

        //вход
        String tournamentStage = scanner.nextLine();
        String typeTicket = scanner.nextLine();
        int countTickets = Integer.parseInt(scanner.nextLine());
        String trophyPhoto = scanner.nextLine();

        double price = 0;
        if (typeTicket.equals("Standard")) {
            if (tournamentStage.equals("Quarter final")){
                price = 55.50;
            } else if (tournamentStage.equals("Semi final")) {
                price = 75.88;
            } else if (tournamentStage.equals("Final")) {
                price = 110.10;
            }
        } else if (typeTicket.equals("Premium")) {
            if (tournamentStage.equals("Quarter final")){
                price = 105.20;
            } else if (tournamentStage.equals("Semi final")) {
                price = 125.22;
            } else if (tournamentStage.equals("Final")) {
                price = 160.66;
            }
        } else if (typeTicket.equals("VIP")) {
            if (tournamentStage.equals("Quarter final")){
                price = 118.90;
            } else if (tournamentStage.equals("Semi final")) {
                price = 300.40;
            } else if (tournamentStage.equals("Final")) {
                price = 400;
            }
        }

        double allTicketSum = price * countTickets;

        if (allTicketSum > 4000) {
            allTicketSum = allTicketSum * 0.75;
        } else if (allTicketSum > 2500) {
            allTicketSum = allTicketSum * 0.90;
            if (trophyPhoto.equals("Y")) {
                allTicketSum = allTicketSum + (countTickets * 40);
            }
        } else {
            if (trophyPhoto.equals("Y")) {
                allTicketSum = allTicketSum + (countTickets * 40);
            }
        }

        System.out.printf("%.2f", allTicketSum);
    }
}
