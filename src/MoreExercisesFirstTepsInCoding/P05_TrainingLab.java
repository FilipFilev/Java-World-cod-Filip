package MoreExercisesFirstTepsInCoding;

import java.util.Scanner;

public class P05_TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());


        double places = Math.floor(length * 100 / 120);
        double rows = Math.floor(((width * 100) - 100) / 70);
        double workPlaces = (rows * places) - 3;

        System.out.printf("%.2f", workPlaces);

    }
}
