package BeforeExam040323;

import java.util.Scanner;

public class P4EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //От конзолата се чете 1 ред:
        //•	 Броят на боядисаните яйца – цяло число в интервала [1 ... 100]
        //За всяко яйце се чете:
        //o	Цветът на яйцето – текст с възможности: "red", "orange", "blue", "green"

        int eggs = Integer.parseInt(scanner.nextLine());

        //For - loop по броя на яйцата
        int redCounter = 0;
        int orangeCounter = 0;
        int blueCounter = 0;
        int greenCounter = 0;


        String maxEggsColor = "";
        int maxEggs = Integer.MIN_VALUE;

        for (int i = 1; i <= eggs; i++) {
            String color = scanner.nextLine();

            switch (color) {
                case "red":
                    redCounter++;
                    if (maxEggs < redCounter) {
                        maxEggs = redCounter;
                        maxEggsColor = "red";
                    }
                    break;

                case "orange":
                    orangeCounter++;
                    if (maxEggs < orangeCounter) {
                        maxEggs = orangeCounter;
                        maxEggsColor = "orange";
                    }
                    break;

                case "blue":
                    blueCounter++;
                    if (maxEggs < blueCounter) {
                        maxEggs = blueCounter;
                        maxEggsColor = "blue";
                    }
                    break;

                case "green":
                    greenCounter++;
                    if (maxEggs < greenCounter) {
                        maxEggs = greenCounter;
                        maxEggsColor = "green";
                    }
                    break;
            }

        }
        System.out.printf("Red eggs: %d%n", redCounter);
        System.out.printf("Orange eggs: %d%n", orangeCounter);
        System.out.printf("Blue eggs: %d%n", blueCounter);
        System.out.printf("Green eggs: %d%n", greenCounter);
        System.out.printf("Max eggs: %d -> %s%n", maxEggs, maxEggsColor);

    }
}
