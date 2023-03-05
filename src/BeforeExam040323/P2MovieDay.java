package BeforeExam040323;

import java.util.Scanner;

public class P2MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Време за снимки – цяло число в диапазона [0… 1440]
        //2.	Брой сцени  – цяло число в диапазона [5… 25]
        //3.	Времетраене на сцена – цяло число в диапазона [20… 90]

        int timeForFilming = Integer.parseInt(scanner.nextLine());
        int countScenes = Integer.parseInt(scanner.nextLine());
        int sceneTime = Integer.parseInt(scanner.nextLine());

        double timeBeforeScenes = timeForFilming * 0.15;
        double allSceneTime = countScenes * sceneTime;

        double neededTime = timeBeforeScenes + allSceneTime;


        double diff = Math.abs(timeForFilming - neededTime);
        if (timeForFilming >= neededTime) {

            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", diff);
        } else {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", diff);
        }


    }
}
