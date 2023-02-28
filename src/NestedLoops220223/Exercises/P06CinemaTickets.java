package NestedLoops220223.Exercises;

import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        int countTicketsPerMovie = 0;
        while (!input.equals("Finish")) {

            int availableSeats = Integer.parseInt(scanner.nextLine());
            String command = scanner.nextLine();
            String currentMovie = input;

            while (!command.equals("End")) {
                String ticketType = command;

                switch (ticketType) {
                    case "student":
                        break;
                    case "standard":
                        break;
                    case "kid":
                        break;

                }


                command = scanner.nextLine();
            }


            input = scanner.nextLine();
        }


    }
}
