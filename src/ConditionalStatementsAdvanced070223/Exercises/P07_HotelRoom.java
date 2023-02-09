package ConditionalStatementsAdvanced070223.Exercises;

import java.util.Scanner;

public class P07_HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int countNights = Integer.parseInt(scanner.nextLine());

        //May, June, July, August, September или October
        double apartmentPrice = 0;
        double studioPrice = 0;



        switch (month) {
            case "May":
            case "October":
                apartmentPrice = countNights * 65;
                studioPrice = countNights * 50;

                break;

            case "June":
            case "September":
                apartmentPrice = countNights * 68.70;
                studioPrice = countNights * 75.20;

                break;

            case "July":
            case "August":
                apartmentPrice = countNights * 77;
                studioPrice = countNights * 76;

                break;


        }



















    }

}
