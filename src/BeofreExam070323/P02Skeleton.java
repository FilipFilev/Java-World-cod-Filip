package BeofreExam070323;

import java.util.Scanner;

public class P02Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //1.	Минути на контролата – цяло число в интервала [0…59]
        int minRecord = Integer.parseInt(scanner.nextLine());
        //2.	Секунди на контролата – цяло число в интервала [0…59]
        int secRecord = Integer.parseInt(scanner.nextLine());
        //3.	Дължината на улея в метри – реално число в интервала [0.00…50000]
        double distance = Double.parseDouble(scanner.nextLine());
        //4.	Секунди за изминаване на 100 метра – цяло число в интервала [0…1000]
        int secPer100Meters = Integer.parseInt(scanner.nextLine());


        int totalTimeInSeconds = (minRecord * 60) + secRecord;
        double fasterTime = (distance / 120) * 2.5;
        double timeMarine = (distance / 100) * secPer100Meters - fasterTime;


        double diff = Math.abs(timeMarine - totalTimeInSeconds);
        if (timeMarine <= totalTimeInSeconds ) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", timeMarine);
        } else {
            System.out.printf("No, Marin failed! He was %.3f second slower.", diff);
        }


    }
}
