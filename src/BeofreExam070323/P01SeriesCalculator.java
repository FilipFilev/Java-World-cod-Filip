package BeofreExam070323;

import java.util.Scanner;

public class P01SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //От конзолата се четат 4 реда:
        //1.	Име на сериал - текст
        //2.	Брой сезони – цяло число в диапазона [1… 10]
        //3.	Брой епизоди  – цяло число в диапазона [10… 80]
        //4.	Времетраене на обикновен епизод без рекламите – реално число в диапазона [40.0… 65.0]

        String movieName = scanner.nextLine(); //Lucifer
        int seasons = Integer.parseInt(scanner.nextLine()); //3
        int episodes = Integer.parseInt(scanner.nextLine());//18
        double timePerEpisode = Double.parseDouble(scanner.nextLine());//55

        double advertisementsTime = timePerEpisode * 0.20;
        double fullEpisode = timePerEpisode + advertisementsTime;
        double specialEpisodes = seasons * 10;

        double totalTimeNeeded = (fullEpisode * episodes * seasons) + specialEpisodes;



        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", movieName, totalTimeNeeded);

    }
}
