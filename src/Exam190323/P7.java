package Exam190323;

import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumFirstDigitStart = Integer.parseInt(scanner.nextLine());
        int firstNumSecondDigitStart = Integer.parseInt(scanner.nextLine());
        int secondNumFirstDigitStart = Integer.parseInt(scanner.nextLine());
        int secondNumSecondDigitStart = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean hasEnded = false;

        for (int firstNumFirstDig = firstNumFirstDigitStart; firstNumFirstDig <= 8; firstNumFirstDig++) {
            for (int firstNumSecondDig = 9; firstNumSecondDig >= firstNumSecondDigitStart; firstNumSecondDig--) {
                for (int secondNumFirstDig = secondNumFirstDigitStart; secondNumFirstDig <= 8; secondNumFirstDig++) {
                    for (int secondNumSecondDig = 9; secondNumSecondDig >= secondNumSecondDigitStart; secondNumSecondDig--) {
                        boolean isValid = firstNumFirstDig % 2 == 0 &&
                                secondNumFirstDig % 2 == 0 &&
                                firstNumSecondDig % 2 != 0 &&
                                secondNumSecondDig % 2 != 0;

                        int firstNum = firstNumFirstDig * 10 + firstNumSecondDig;
                        int secondNum = secondNumFirstDig * 10 + secondNumSecondDig;

                        if (isValid && firstNum == secondNum) {
                            System.out.println("Cannot change the same player.");
                        } else if (isValid && firstNum != secondNum) {
                            System.out.printf("%d%d - %d%d%n", firstNumFirstDig,firstNumSecondDig, secondNumFirstDig, secondNumSecondDig);
                            counter++;
                        }
                        if (counter >= 6) {
                            hasEnded = true;
                        }
                        if (hasEnded) {
                            break;
                        }
                    }
                    if (hasEnded) {
                        break;
                    }
                }
                if (hasEnded) {
                    break;
                }
            }
            if (hasEnded) {
                break;
            }
        }

    }
}

