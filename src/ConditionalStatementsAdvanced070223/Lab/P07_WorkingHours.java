package ConditionalStatementsAdvanced070223.Lab;

import java.util.Scanner;

public class P07_WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();

        boolean workingDays = dayOfWeek.equals("Monday") ||
                dayOfWeek.equals("Tuesday") ||
                dayOfWeek.equals("Wednesday") ||
                dayOfWeek.equals("Thursday") ||
                dayOfWeek.equals("Friday") ||
                dayOfWeek.equals("Saturday");


        boolean workingHours = hours >= 10 && hours <= 18;

        if (workingDays && workingHours) {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }

        //като работното време на офисът е от 10-18 часа,
        // от понеделник до събота включително
        //open, closed




    }
}
