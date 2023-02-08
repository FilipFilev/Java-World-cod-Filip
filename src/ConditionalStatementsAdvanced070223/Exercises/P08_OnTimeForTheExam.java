package ConditionalStatementsAdvanced070223.Exercises;

import java.util.Scanner;

public class P08_OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Първият ред съдържа час на изпита – цяло число от 0 до 23.
        //•	Вторият ред съдържа минута на изпита – цяло число от 0 до 59.
        //•	Третият ред съдържа час на пристигане – цяло число от 0 до 23.
        //•	Четвъртият ред съдържа минута на пристигане – цяло число от 0 до 59.

        //1. Прочитаме входните данни
        //2. Прехвърляме всичко в минути за по лесни сметки -> общо минути за изпита, общо минути на пристигане
        //3. Разликата в общите минути на изпита и общите минути на притигане
        //4. Проверяваме дали е закъснял
        //4а Вложена проверка дали е закъснял повече от час или не

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());

        int examTotalMinutes = (examHour * 60) + examMinutes;
        int arrivalTotalMinutes = (arrivalHour * 60) + arrivalMinutes;

        int diff = Math.abs(arrivalTotalMinutes - examTotalMinutes);

        if (arrivalTotalMinutes > examTotalMinutes) {    //Ако той закъснява(под час или над час
            System.out.println("Late");
            if (diff < 60) {
                System.out.printf("%d minutes after the start",diff );
            }else {
                int hour = diff/60;
                int minutes = diff % 60;
                System.out.printf("%d:%02d hours after the start", hour, minutes);
            }

        } else if (diff <= 30) {
            System.out.println("On time");
            if (examTotalMinutes != arrivalTotalMinutes)
                System.out.printf("%d minutes before the start", diff);

        }else {
            System.out.println("Early");
            if (diff < 60) {
                System.out.printf("%d minutes before the start", diff);
            }else {
                int hour = diff/ 60;
                int minutes = diff % 60;
                System.out.printf("%d:%02d hours before the start",hour, minutes);
            }
        }


    }
}
