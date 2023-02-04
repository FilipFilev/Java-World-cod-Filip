package JavaLab28012023;

import java.util.Scanner;

public class P08PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogsPacksC = Integer.parseInt(scanner.nextLine());
        int catsPacksC = Integer.parseInt(scanner.nextLine());
        double dogsSum = dogsPacksC * 2.5;
        int catsSum = catsPacksC * 4;
        Double result = dogsSum + catsSum;

        System.out.printf("%.2f lv. %n", result);


    }
}
