package MoreExercisesFirstTepsInCoding;

import java.util.Scanner;

public class P07_HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double sideWall = x * y;
        double window = 1.5 * 1.5;
        double sideWallsTotal = (2 * sideWall) - (2 * window);

        double backWall = x * x;
        double door = 1.2 * 2;
        double frontBackWalls = (2 * backWall) - door;
        double totalWallsArea = sideWallsTotal + frontBackWalls;
        double greenPaint = totalWallsArea / 3.4;

        double squaresArea = 2 * (x * y);
        double trianglesArea = 2 *( x * h /2);
        double totalRoofArea = squaresArea + trianglesArea;
        double redPaint = totalRoofArea / 4.3;

        System.out.printf("%.2f%n",greenPaint);
        System.out.printf("%.2f%n",redPaint);


    }
}
