package BeofreExam070323;

import java.util.Scanner;

public class P03PaintingEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Първи ред – размер на яйцата – текст с възможности "Large", "Medium" или "Small"
        String size = scanner.nextLine();
        //•	Втори ред – цвят на яйцата – текст  с възможности "Red", "Green" или "Yellow"
        String color = scanner.nextLine();
        //•	Трети ред – брой партиди – цяло число в интервала [1… 350]
        int count = Integer.parseInt(scanner.nextLine());

        if (size.equals("Large")){
            if (color.equals("Red")) {

            } else if (color.equals("Green")){
                
                
            } else if (color.equals("")) {
                
            }


        } else if (size.equals("Medium")) {


        } else if (size.equals("Small"));


    }
}
