package BeforeExam040323;

import java.util.Scanner;

public class P3EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Първи ред - дестинация - текст с възможности"France", "Italy" или "Germany"
        //•	Втори ред - дати, през които си е резервирала екскурзията - текст  с възможности "21-23",
        //"24-27" или "28-31"
        //•	Трети ред - брой нощувки - цяло число в интервала [1… 100]
        String destination = scanner.nextLine();
        String dates = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        //проверка за дестинация

        //•	Втори ред - дати, през които си е резервирала екскурзията - текст  с възможности "21-23", 
        //"24-27" или "28-31"
        double pricePerNight = 0;
        switch (destination) {
            case "France":
                if (dates.equals("21-23")) {
                    pricePerNight = 30;

                } else if (dates.equals("24-27")) {
                    pricePerNight = 35;

                } else if (dates.equals("28-31")) {
                    pricePerNight = 40;

                }
                break;
            case "Italy":
                if (dates.equals("21-23")) {
                    pricePerNight = 28;

                } else if (dates.equals("24-27")) {
                    pricePerNight = 32;

                } else if (dates.equals("28-31")) {
                    pricePerNight = 39;

                }
                break;
            case "Germany":
                if (dates.equals("21-23")) {
                    pricePerNight = 32;

                } else if (dates.equals("24-27")) {
                    pricePerNight = 37;

                } else if (dates.equals("28-31")) {
                    pricePerNight = 43;

                }
                break;
        }

        double neededMoney = nights * pricePerNight;
        System.out.printf("Easter trip to %s : %.2f leva.", destination, neededMoney);
    }
}
