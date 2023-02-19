package WhileLoop150223.Exercises;

import java.util.Scanner;

public class P01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //въвеждаме търсената книга
        String wantedBook = scanner.nextLine();
        //въвеждаме началната проверка за книгата
        String check = scanner.nextLine();
        //създаваме брояч за книгите, които сме проверили
        int bookCounter = 0;
        //създаваме променлива, с която проверяваме дали е намерена книгата
        boolean isFound = false;
        //докато не е въведена командата „No More Books“:
        while (!check.equals("No More Books")) {
            //проверяваме дали книгата е намерена
            if (check.equals(wantedBook)) {
                isFound = true;
                break;
            }
            //ако не е, увеличаваме брояча с 1
            bookCounter++;
            //правим нова проверка
            check = scanner.nextLine();
        }
        //след приключваме на цикъла, ако книгата е намерена:
        if (isFound) {
            System.out.println("You checked " + bookCounter + " books and found it.");
        } else { //ако не е намерена
            System.out.println("The book you search is not here!\n" +
                    "You checked " + bookCounter + " books.");
        }
    }
}
