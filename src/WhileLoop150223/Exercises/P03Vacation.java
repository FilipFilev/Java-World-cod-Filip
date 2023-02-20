package WhileLoop150223.Exercises;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());
        int countSpend = 0;
        int countDays = 0;

        while (availableMoney < neededMoney){

            if (countSpend == 5){
                break;
            }

            String command = scanner.nextLine();
            double currentMoney = Double.parseDouble(scanner.nextLine());
            countDays++;

            if(command.equals("spend")){
                countSpend++;
                availableMoney -= currentMoney;
            } else if (command.equals("save")) {
                availableMoney += currentMoney;
                countSpend = 0;

            }

            if(availableMoney < 0){
                availableMoney = 0;
            }

        }

        if(countSpend == 5){
            System.out.println("You can't save the money.");
            System.out.printf("%d", countDays);
        }else {
            System.out.printf("You saved the money for %d days.", countDays);
        }


    }
}




