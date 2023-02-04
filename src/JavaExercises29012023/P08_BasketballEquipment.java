package JavaExercises29012023;

import java.util.Scanner;

public class P08_BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        IN
        int annualTax = Integer.parseInt(scanner.nextLine());
//        BODY
        double trainersPrice = annualTax * 0.6;// annualTax * 0.60 // annualTax - (annualTax * 0.40)
        double outfitPrice = trainersPrice * 0.8;
        double ballPrice = outfitPrice / 4;
        double accPrice = ballPrice / 5;

        double totalSum = annualTax + trainersPrice + outfitPrice + ballPrice + accPrice;

//        OUT
        System.out.println(totalSum);


    }
}
