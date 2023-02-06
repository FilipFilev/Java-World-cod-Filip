package ConditionalStatements31012023.L02ConditionalStatements;

import java.util.Scanner;

public class P08_LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.Входни данни
        String movie = scanner.nextLine();
        int durationMovie = Integer.parseInt(scanner.nextLine());
        int lunchBreak = Integer.parseInt(scanner.nextLine());
        //2. Смятаме колко време ще ни отнеме да се нахраним -> Времето за обяд = lunchBreak / 8
        //3. Да сметнем колко време ни е нужно за почивка -> Време за отдих = lunchBreak / 4
        //4. Да сметнем колко време имаме за филма -> lunchBreak - време за обяд - за отдих
        //5. Проверяваме дали времето ще ни стригне за да изгледаме сериала


        double timeForEating = lunchBreak / 8.0;
        double timeForRest = lunchBreak / 4.0;

        double timeForWatching = lunchBreak - timeForEating - timeForRest;
        if (timeForWatching >= durationMovie) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",
                    movie, Math.ceil(timeForWatching - durationMovie));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",
                    movie, Math.ceil(durationMovie - timeForWatching));
        }

    }

}
