package AloneExam160323;

import java.util.Scanner;

public class P4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());

        String productName = scanner.nextLine();
        int counter = 0;
        double copyBudget = budget;

        boolean isNotEnough = false;

        while (!productName.equals("Stop")) {
            double productPrice = Double.parseDouble(scanner.nextLine());
            counter++;

            if (counter % 3 == 0){
            productPrice /= 2;
            }

            copyBudget -= productPrice;


            if (copyBudget < 0) {
                isNotEnough = true;
                break;
            }


            productName = scanner.nextLine();
        }


        if (isNotEnough) {
            System.out.println("You don't have enough money!");
            System.out.printf("You need %.2f leva!", Math.abs(copyBudget));


        }else {
            System.out.printf("You bought %d products for %.2f leva.", counter, budget - copyBudget);
        }


    }
}
