package NestedLoops220223.Exercises;

import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int totalTickets = 0;
        int countStudentTickets = 0;
        int countKidTickets = 0;
        int countStandardTickets = 0;

        while (!input.equals("Finish")) {
            int availableSeats = Integer.parseInt(scanner.nextLine());

            String command = scanner.nextLine();
            String currentMovie = input;

            int countTicketsPerMovie = 0;

            while (!command.equals("End")) {
                String ticketType = command;
                countTicketsPerMovie++;

                switch (ticketType) {
                    case "student":
                        countStudentTickets++;
                        break;
                    case "standard":
                        countStandardTickets++;
                        break;
                    case "kid":
                        countKidTickets++;
                        break;
                }

                if (countTicketsPerMovie >= availableSeats) {
                    break;
                }

                command = scanner.nextLine();
            }

            totalTickets += countTicketsPerMovie;

            double percentField = countTicketsPerMovie * 1.0 / availableSeats * 100;
            System.out.printf("%s - %.2f%% full.%n", currentMovie, percentField);

            input = scanner.nextLine();
        }

        double percentKidTickets = countKidTickets * 1.0 / totalTickets * 100;
        double percentStudentTickets = countStudentTickets * 1.0 / totalTickets * 100;
        double percentStandardTickets = countStandardTickets * 1.0 / totalTickets * 100;

        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", percentStudentTickets);
        System.out.printf("%.2f%% standard tickets.%n", percentStandardTickets);
        System.out.printf("%.2f%% kids tickets.%n", percentKidTickets);

    }
}
