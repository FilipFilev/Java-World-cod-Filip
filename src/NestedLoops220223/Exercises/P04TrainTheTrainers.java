package NestedLoops220223.Exercises;

import java.util.Scanner;

public class P04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        double totalGradeSum = 0;
        int countPresentation = 0;


        while (!input.equals("Finish")) {
            String presentationName = input;
            double sumGrades = 0;

            for (int i = 1; i <= countPeople; i++) {
                double currentGrade = Double.parseDouble(scanner.nextLine());
                sumGrades += currentGrade;
            }

            double averageGrade = sumGrades / countPeople;
            totalGradeSum += averageGrade;
            countPresentation++;

            System.out.printf("%s - %.2f.%n", presentationName, averageGrade);

            input = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.%n", totalGradeSum/countPresentation);
    }
}
