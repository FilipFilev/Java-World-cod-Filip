package L02ConditionalStatements;

import java.util.Scanner;

public class P05_GodzillavsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. Четем от конзолата
        //2. Пресмятаме цената за декора -> 10% от бюджета.
        //3. Смятаме цената за обелклото.
        //4. Ако са над 150 има 10% отстъпка.
        //5. Смятаме финалната сума -> цената за декор + цената за облекло
        //6. Проверка дали бюджетът(от конзолата) е достатъчен.
        //7. Ако не е досататъчен  ->"Not enough money!"
        //7а	"Wingard needs {парите недостигащи за филма} leva more."
        //8. или Ако е досаттъчен -> "Action!"
        //8а	"Wingard starts filming with {останалите пари} leva left."

        double budget = Double.parseDouble(scanner.nextLine());
        int countActors = Integer.parseInt(scanner.nextLine());
        double pricePerActor = Double.parseDouble(scanner.nextLine());

        double priceDecor = budget * 0.1;
        double priceForClothes = countActors * pricePerActor;

        if (countActors > 150){
            priceForClothes = priceForClothes * 0.9;//priceForClothes - priceForClothes * 0.1
        }

        double finalSum = priceDecor + priceForClothes;
        double differenceInMoney = Math.abs(finalSum - budget);

        if (finalSum > budget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", differenceInMoney );
        }else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", differenceInMoney);
        }



    }
}
