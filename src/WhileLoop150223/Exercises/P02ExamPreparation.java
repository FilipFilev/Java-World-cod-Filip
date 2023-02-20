package WhileLoop150223.Exercises;

import java.util.Scanner;

public class P02ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPoorGrade = Integer.parseInt(scanner.nextLine());

        String taskName = scanner.nextLine();
        int sumPoorGrade = 0;
        double countTasks = 0;
        double sumGrade = 0;
        String lastTask = "";

        while (!taskName.equals("Enough")) {
            int currentGrade = Integer.parseInt(scanner.nextLine());

            if (currentGrade <= 4){
                sumPoorGrade++;
            }
            if (countPoorGrade <= sumPoorGrade){
                break;
            }
            sumGrade += currentGrade;
            countTasks++ ;
            lastTask = taskName;
            taskName = scanner.nextLine();
        }
        double avgGrade = sumGrade / countTasks;
        if (taskName.equals("Enough")){
            System.out.printf("Average score: %.2f%n", avgGrade);
            System.out.printf("Number of problems: %.0f%n", countTasks);
            System.out.printf("Last problem: %s%n", lastTask);
        } else {
            System.out.printf("You need a break, %d poor grades.%n", sumPoorGrade);
        }
    }

}
