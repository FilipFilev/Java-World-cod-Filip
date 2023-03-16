package AloneExam140323;

import java.util.Scanner;

public class P3B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine(); //("Russia", "Bulgaria" или "Italy")
        String equipment = scanner.nextLine(); //("ribbon", "hoop" или "rope")

        double difficultyPoints = 0;
        double performancePoints = 0;

        double totalPoints = 0;
        if (country.equals("Russia")) {
            if (equipment.equals("ribbon")) {
                difficultyPoints = 9.100;
                performancePoints = 9.400;
            } else if (equipment.equals("hoop")) {
                difficultyPoints = 9.300;
                performancePoints = 9.800;
            } else if (equipment.equals("rope")) {
                difficultyPoints = 9.600;
                performancePoints = 9.000;
            }

        } else if (country.equals("Bulgaria")) {
            if (equipment.equals("ribbon")) {
                difficultyPoints = 9.600;
                performancePoints = 9.400;
            } else if (equipment.equals("hoop")) {
                difficultyPoints = 9.550;
                performancePoints = 9.750;
            } else if (equipment.equals("rope")) {
                difficultyPoints = 9.500;
                performancePoints = 9.400;
            }
            
        } else if (country.equals("Italy")) {
            if (equipment.equals("ribbon")) {
                difficultyPoints = 9.200;
                performancePoints = 9.500;
            } else if (equipment.equals("hoop")) {
                difficultyPoints = 9.450;
                performancePoints = 9.350;
            } else if (equipment.equals("rope")) {
                difficultyPoints = 9.700;
                performancePoints = 9.150;
            }
        }

        totalPoints = difficultyPoints + performancePoints;
        double diff = 20 - totalPoints;
        double neededPercents = diff / 20 * 100;


        System.out.printf("The team of %s get %.3f on %s.%n", country, totalPoints, equipment);
        System.out.printf("%.2f%%", neededPercents);

    }
}
