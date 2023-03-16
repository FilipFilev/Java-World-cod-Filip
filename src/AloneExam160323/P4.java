package AloneExam160323;

import java.util.Scanner;

public class P4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());

        String productName = scanner.nextLine();
        int counter = 0;

        while (!productName.equals("Stop")) {
            double productPrice = Double.parseDouble(scanner.nextLine());
            double leftBudget = budget;
            leftBudget -= productPrice;
            counter++;


            if (productPrice > leftBudget ){
                break;
            }





            productName = scanner.nextLine();
        }


        System.out.println();
    }
}
