package Exam190323;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //От конзолата се прочитат 5 реда:
        double priceCPUinUSD = Double.parseDouble(scanner.nextLine());
        double priceGPUinUSD = Double.parseDouble(scanner.nextLine());
        double priceRAMinUSD = Double.parseDouble(scanner.nextLine());
        int countRAM = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());


        double CPUinBGN = priceCPUinUSD * 1.57;
        double GPUinBGN = priceGPUinUSD * 1.57;
        double RAMinBGN = priceRAMinUSD * 1.57;
        double totalPriceRAMinBGN = RAMinBGN * countRAM;


        double totalSumCPU = CPUinBGN - ( CPUinBGN * discount);
        double totalSumGPU = GPUinBGN - ( GPUinBGN * discount);

        double finalSum = totalSumCPU + totalSumGPU + totalPriceRAMinBGN;


        System.out.printf("Money needed - %.2f leva.", finalSum);

    }
}
