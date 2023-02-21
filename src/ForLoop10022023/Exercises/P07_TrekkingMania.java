package ForLoop10022023.Exercises;

import java.util.Scanner;

public class P07_TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());
        double allPeople = 0.00;
        int maxPeopleMusala = 0;
        int maxPeopleMonblan = 0;
        int maxPeopleKilimandzharo = 0;
        int maxPeopleK2 = 0;
        int maxPeopleEverest = 0;

        for (int i = 0; i < groups; i++) {
            int peopleInGroup = Integer.parseInt(scanner.nextLine());
            allPeople += peopleInGroup;
            if (peopleInGroup <= 5)
                maxPeopleMusala += peopleInGroup;
            else if (peopleInGroup <= 12)
                maxPeopleMonblan += peopleInGroup;
            else if (peopleInGroup <= 25)
                maxPeopleKilimandzharo += peopleInGroup;
            else if (peopleInGroup <= 40)
                maxPeopleK2 += peopleInGroup;
            else
                maxPeopleEverest += peopleInGroup;

        }

        double perMusala = (maxPeopleMusala / allPeople) * 100;
        System.out.printf("%.2f%%%n", perMusala);
        double perMonblan = (maxPeopleMonblan / (allPeople)) * 100;
        System.out.printf("%.2f%%%n", perMonblan);
        double perKilimandzharo = (maxPeopleKilimandzharo / allPeople) * 100;
        System.out.printf("%.2f%%%n", perKilimandzharo);
        double perK2 = (maxPeopleK2 / (allPeople)) * 100;
        System.out.printf("%.2f%%%n", perK2);
        double perEverest = (maxPeopleEverest / (allPeople)) * 100;
        System.out.printf("%.2f%%%n", perEverest);
    }
}
