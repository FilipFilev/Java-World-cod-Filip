package Exam190323;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        //От конзолата се четат по два реда до въвеждане на команда "END":

        //•	Име на играч – текст
        //•	Брой вкарани голове  – цяло положително число в интервала [1 … 10000]

        int maxGoals = Integer.MIN_VALUE;
        String winner = "";
        String input = scanner.nextLine();
        while (!input.equals("END")){
            String name = input;
            int inGoals = Integer.parseInt(scanner.nextLine());



            if(inGoals > maxGoals){
                maxGoals = inGoals;
                winner = name;
            }

            if (inGoals >= 10){
                break;
            }

            input = scanner.nextLine();
        }


        System.out.printf("%s is the best player!%n", winner);

        if (maxGoals >= 3){
            System.out.printf("He has scored %d goals and made a hat-trick !!!%n", maxGoals);
        } else {
            System.out.printf("He has scored %d goals.%n", maxGoals);
        }


    }
}
