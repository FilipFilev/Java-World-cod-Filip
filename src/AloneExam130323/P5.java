package AloneExam130323;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double volumeAirplane = Double.parseDouble(scanner.nextLine());

        String input = scanner.nextLine();

        int suitcaseCounter = 0;
        boolean isFull = false;
        double freeSpace = volumeAirplane;

        while (!input.equals("End")) {
            double volumeSuitcase = Double.parseDouble(input);

            suitcaseCounter++;
            if (suitcaseCounter % 3 == 0) {
                volumeSuitcase *= 1.1;
            }

            freeSpace -= volumeSuitcase;
            if (freeSpace <= 0){
                isFull = true;
                suitcaseCounter--;
                break;
            }

            input = scanner.nextLine();
        }

        if (isFull) {
            System.out.println("No more space!");
        } else {
            System.out.println("Congratulations! All suitcases are loaded!");
        }

            System.out.printf("Statistic: %d suitcases loaded.", suitcaseCounter);
    }
}
