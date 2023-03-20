package AloneExamKala180323;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String movieName = scanner.nextLine(); //A Star Is Born", "Bohemian Rhapsody","Green Book" или "The Favourite"
        String hallType = scanner.nextLine(); //normal", "luxury" или "ultra luxury")
        int tickets = Integer.parseInt(scanner.nextLine());


        double ticketPrice = 0;
        if (hallType.equals("normal")) {
            if (movieName.equals("A Star Is Born")){
                ticketPrice = 7.50;
            } else if (movieName.equals("Bohemian Rhapsody")) {
                ticketPrice = 7.35;
            } else if (movieName.equals("Green Book")) {
                ticketPrice = 8.15;
            } else if (movieName.equals("The Favourite")) {
                ticketPrice = 8.75;
            }


        } else if (hallType.equals("luxury")) {
            if (movieName.equals("A Star Is Born")){
                ticketPrice = 10.50;
            } else if (movieName.equals("Bohemian Rhapsody")) {
                ticketPrice = 9.45;
            } else if (movieName.equals("Green Book")) {
                ticketPrice = 10.25;
            } else if (movieName.equals("The Favourite")) {
                ticketPrice = 11.55;
            }


        } else if (hallType.equals("ultra luxury")) {
            if (movieName.equals("A Star Is Born")){
                ticketPrice = 13.50;

            } else if (movieName.equals("Bohemian Rhapsody")) {
                ticketPrice = 12.75;

            } else if (movieName.equals("Green Book")) {
                ticketPrice = 13.25;

            } else if (movieName.equals("The Favourite")) {
                ticketPrice = 13.95;

            }

        }

        System.out.printf("%s -> %.2f lv.", movieName,tickets * ticketPrice);
    }
}
