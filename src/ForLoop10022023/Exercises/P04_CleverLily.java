package ForLoop10022023.Exercises;

import java.util.Scanner;

public class P04_CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int pricePerToy = Integer.parseInt(scanner.nextLine());

//•	Възрастта на Лили - цяло число в интервала [1...77]
//•	Цената на пералнята - число в интервала [1.00...10 000.00]
//•	Единична цена на играчка - цяло число в интервала [0...40]

        // For Loop -> за всяка година
            // да проверим дали е четна или нечетна
        // при четна -> получава пари
        // при нечетна -> получава играчка
        // брат и взима по 1 лев , когато получава пари
        //пресмятаме колко паи е събрала -> броя на играчките * pricePerToy + събраните пари от четни години
        //проверяваме дали парите стигат

        double sum = 0;
        int countToys = 0;
        //double  moneyEvenAge = 10;
        for (int currentAge = 1; currentAge <= age ; currentAge++) {

            if (currentAge % 2 ==0) {

                sum = sum + (currentAge * 5 - 1); // sum += currentAge * 5 - 1

                //sum += moneyEvenAge
                //moneyEvenAge += 10
                // sum--;

            } else {
                countToys++;
            }
        }

        sum += countToys * pricePerToy;
        double diff =Math.abs(sum - priceWashingMachine);

        if (sum >= priceWashingMachine) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }



//•	Ако парите на Лили са достатъчни:
//o	"Yes! {N}" - където N е остатъка пари след покупката
//•	Ако парите не са достатъчни:
//o	"No! {М}" - където M е сумата, която не достига






    }
}
