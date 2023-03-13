package AloneExam130323;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupsCount = Integer.parseInt(scanner.nextLine());

        double allPeople = 0.00;
        int MusallaPpl = 0;
        int MontblancPpl = 0;
        int KilimanjaroPpl = 0;
        int K2Ppl = 0;
        int EverestPpl = 0;

        for (int i = 0; i < groupsCount ; i++) {
            int peopleCounter = Integer.parseInt(scanner.nextLine());
            allPeople = allPeople + peopleCounter;

            if (peopleCounter <= 5) {
                MusallaPpl = MusallaPpl + peopleCounter;
            } else if (peopleCounter <= 12) {
                MontblancPpl = MontblancPpl + peopleCounter;

            } else if (peopleCounter <= 25) {
                KilimanjaroPpl = KilimanjaroPpl + peopleCounter;

            } else if (peopleCounter <= 40) {
                K2Ppl = K2Ppl + peopleCounter;

            } else  {
                EverestPpl = EverestPpl + peopleCounter;
            }

        }

        double forMusalla = MusallaPpl / allPeople * 100;
        System.out.printf("%.2f%%%n", forMusalla);

        double forMontblanc = MontblancPpl / allPeople * 100;
        System.out.printf("%.2f%%%n", forMontblanc);

        double forKilimanjaro = KilimanjaroPpl / allPeople * 100;
        System.out.printf("%.2f%%%n", forKilimanjaro);

        double forK2 = K2Ppl / allPeople * 100;
        System.out.printf("%.2f%%%n", forK2);

        double forEverest = EverestPpl / allPeople * 100;
        System.out.printf("%.2f%%%n", forEverest);


    }
}
