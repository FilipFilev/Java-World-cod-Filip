package L02ConditionalStatements;

import java.util.Scanner;

public class P06_WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Четем от конзолата
        //пресмятаме забавянето
        //резултата, за който Иван преплува разстоянието +
        // + -> разстоянието * времето в секунди , за които плува 1 м + забавянето
        // Проверка дали е подобрил рекорда

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secondsForOneMeter = Double.parseDouble(scanner.nextLine());

        double delay = (Math.floor(distance / 15)) * 12.5;

        double result = distance * secondsForOneMeter + delay;

        if (recordInSeconds > result) {

            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds", result);

        }else {
            double neededSeconds = result - recordInSeconds;
            System.out.printf("No, he failed! He was %.2f seconds slower.", neededSeconds);
        }

    }
}
