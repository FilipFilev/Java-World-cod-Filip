package ForLoop10022023.Exercises;

import java.util.Scanner;

public class P06_Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //четем входни данни
        //правим цикъл -> n брой пъти ,зависи от броя оценяващи
        // прочитаме името на оценяващия + оценката, която дава за катьора
        // прибавяме към общата оценка -> дължината на името * оценката, която е дал делено на / 2
        //Над 1250.5 точчки -> взима оскър
        //Под 1250.5 точки -> не взима оскър
         String actorName = scanner.nextLine();
         double academyPoints = Double.parseDouble(scanner.nextLine());
         int countExaminers = Integer.parseInt(scanner.nextLine());
         double sumAllPoints = academyPoints;

        for (int i = 1; i <= countExaminers ; i++) {

            String examinerName = scanner.nextLine();
            double currentPoints = Double.parseDouble(scanner.nextLine());
            sumAllPoints += (examinerName.length() * currentPoints) / 2;

            if (sumAllPoints >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!%n", actorName, sumAllPoints);
                break;
            }
        }

if (sumAllPoints < 1250.5) {
    System.out.printf("Sorry, %s you need %.1f more!", actorName, Math.abs(1250.5 - sumAllPoints));
}
                 //•	Име на актьора - текст
        //•	Точки от академията - реално число в интервала [2.0... 450.5]
        //•	Брой оценяващи n - цяло число в интервала[1… 20]
        //На следващите n-на брой реда:
        //o	Име на оценяващия - текст
        //o	Точки от оценяващия - реално число в интервала [1.0... 50.0]

    }
}
