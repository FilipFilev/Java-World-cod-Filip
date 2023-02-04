package JavaExercises29012023;

import java.util.Scanner;

public class P04_VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        ЧЕТЕНЕ НА ВХОД++++++++++++++++
//        1.	Брой страници в текущата книга – цяло число в интервала [1…1000]
//        2.	Страници, които прочита за 1 час – цяло число в интервала [1…1000]
//        3.	Броят на дните, за които трябва да прочете книгата – цяло число в интервала [1…1000]
        int listsCount = Integer.parseInt(scanner.nextLine());
        int listsPerHour = Integer.parseInt(scanner.nextLine());
        int daysNeeded = Integer.parseInt(scanner.nextLine());
//        ИЗЧИСЛЕНИЯ
        int hoursAll = listsCount / listsPerHour;
        int hoursPerDay = hoursAll / daysNeeded;
//        Принт в конзолата
        System.out.println(hoursPerDay);
    }
}
