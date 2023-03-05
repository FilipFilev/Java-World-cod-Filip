package BeforeExam040323;

import java.util.Scanner;

public class P1OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int rent = Integer.parseInt(scanner.nextLine());

        double statuettes = rent * 0.70;
        double catering = statuettes * 0.85;
        double volume = catering / 2;


        double sum = rent + statuettes + catering + volume;
        System.out.printf("%.2f", sum);



//•	Статуетки  – цената им е 30% по-малка от наема на залата
//•	Кетъринг – цената му е 15% по-малка от тази на статуетките
//•	Озвучаване – цената му е 1 / 2 от цената за кетъринг








    }

}
