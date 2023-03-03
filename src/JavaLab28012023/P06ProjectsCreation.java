package JavaLab28012023;

import java.util.Scanner;

public class P06ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int projectsCount = Integer.parseInt(scanner.nextLine());
        int hours = projectsCount * 3;


        System.out.printf("The architect %s will need %d hours to complete %d project/s. %n", name, hours, projectsCount);
    }
}
