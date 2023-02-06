package MoreExercisesFirstTepsInCoding;

import java.util.Scanner;

public class P03_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Напишете програма, която чете градуси по скалата на Целзий (°C) и ги преобразува до градуси по скалата на Фаренхайт (°F).
        // Потърсете в Интернет подходяща формула, с която да извършите изчисленията. Форматирате изхода до втория знак след десетичната запетая.
        //9/5 + 32
        //T (° F) = 20 ° C × 9/5 + 32 = 68 ° F
        double celsius = Double.parseDouble(scanner.nextLine());

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.printf("%.2f", fahrenheit);

    }
}
