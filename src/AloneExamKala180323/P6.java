package AloneExamKala180323;

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int target = Integer.parseInt(scanner.nextLine());
        int startingHeight = target - 30;


        boolean isFailed = false;
        int jumps = 0;
        while (startingHeight <= target) {
            //. При три неуспешни скока на една и съща височина, тренировката приключва с неуспех
            for (int i = 1; i <= 3; i++) {
                int currentHeight = Integer.parseInt(scanner.nextLine());
                jumps++;
                if (currentHeight > startingHeight) {
                    startingHeight += 5;
                    break;
                }
                if (i == 3) {
                    isFailed = true;
                    break;
                }
            }

            if (isFailed) {
                break;
            }
        }


        if (isFailed) {
            System.out.printf("Tihomir failed at %dcm after %d jumps.%n", startingHeight,jumps);
        } else {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.",target, jumps);
        }

    }
}
