package AloneExam170323;

import java.util.Scanner;

public class P04Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int capacity = Integer.parseInt(scanner.nextLine());


        double income = 0;
        int seatsLeft = capacity;

        boolean isFull = false;
        String input = scanner.nextLine();
        while (!input.equals("Movie time!")){
            int people = Integer.parseInt(input);
            seatsLeft -= people;

            if (seatsLeft < 0) {
                isFull = true;
                break;
            }

            income = income + (people * 5);

            if (people % 3 == 0) {
                income -= 5;
            }


            input = scanner.nextLine();
        }

        if (isFull) {
            System.out.println("The cinema is full.");

        } else  {
            System.out.printf("There are %d seats left in the cinema.%n", seatsLeft);
        }


        System.out.printf("Cinema income - %.0f lv.", income);

    }
}
