package company.hvor_tit_skal_græsset_slås;

import java.util.Scanner;

public class Grass {
    private double dailyGrowth = 0.8;

    public int daysRemainingBeforeMowing(double currentHeight, double maxHeight) {
        int numberOfDays = 0;

        while (currentHeight < maxHeight) {
            currentHeight = currentHeight + dailyGrowth;
            numberOfDays = numberOfDays + 1;
        }
        return numberOfDays;
    }

    public static void main(String[] args) {
        Grass grass = new Grass();

        Scanner scanner = new Scanner(System.in);
        System.out.println("hvad er græssets nuværende højde?");
        double currentHeight = scanner.nextDouble();

        System.out.println("hvad er den maksimale højde for græsset?");
        double maxHeight = scanner.nextDouble();

        int daysBeforeMowing = grass.daysRemainingBeforeMowing(currentHeight, maxHeight);

        System.out.println("Du skal slå græsset om " + daysBeforeMowing + " dage");

    }

}
