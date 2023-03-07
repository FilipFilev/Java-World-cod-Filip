package BeofreExam070323;

import java.util.Scanner;

public class P04Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countBalls = Integer.parseInt(scanner.nextLine());

        int redCount = 0;
        int orangeCount = 0;
        int yellowCount = 0;
        int whiteCount = 0;
        int blackCount = 0;

        int otherBallsCount = 0;

        int sum = 0;
        for (int i = 0; i < countBalls; i++) {
            String colorBall = scanner.nextLine();

            switch (colorBall) {
                case "red":
                    redCount++;
                    sum += 5;
                    break;
                case "orange":
                    orangeCount++;
                    sum += 10;
                    break;
                case "yellow":
                    yellowCount++;
                    sum += 15;
                    break;
                case "white":
                    whiteCount++;
                    sum += 20;
                    break;
                case "black":
                    blackCount++;
                    sum = sum / 2;
                    break;
                default:
                    otherBallsCount++;
            }
        }

        System.out.printf("Total points: %d%n", sum);
        System.out.printf("Red balls: %d%n", redCount);
        System.out.printf("Orange balls: %d%n", orangeCount);
        System.out.printf("Yellow balls: %d%n", yellowCount);
        System.out.printf("White balls: %d%n", whiteCount);
        System.out.printf("Other colors picked: %d%n", otherBallsCount);
        System.out.printf("Divides from black balls: %d", blackCount);

    }
}
