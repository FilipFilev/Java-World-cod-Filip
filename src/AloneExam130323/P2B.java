package AloneExam130323;

import java.util.Scanner;

public class P2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSec = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());

        double georgeSec = distanceInMeters * secondsPerMeter;
        double delay = Math.floor(distanceInMeters / 50) * 30;
        double totalTime = georgeSec + delay;

        if (totalTime < recordInSec) {
            System.out.printf("Yes! The new record is %.2f seconds.", totalTime);

        } else {
            double diff = totalTime - recordInSec;
            System.out.printf("No! He was %.2f seconds slower.", diff);
        }

    }
}
