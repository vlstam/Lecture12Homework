package homework;

import java.util.Scanner;

public class MethodsEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to calculate simple or complex interest? ");
        String simpleOrComplex = scanner.next();
        if (simpleOrComplex.equalsIgnoreCase("simple")) {
            simpleInterest();
        } else if (simpleOrComplex.equalsIgnoreCase("complex")) {
            complexInterest();
        } else {
            System.out.println("Error!");
        }

    }

    static void simpleInterest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the sum of the investment in leva: ");
        double interest = scanner.nextDouble();
        System.out.println("Please enter the percentage: ");
        double percentage = scanner.nextDouble() / 100;
        System.out.println("Please enter the number of years");
        double years = scanner.nextDouble();
        double yearlySimpleInterest = interest * percentage * years;
        System.out.println(yearlySimpleInterest);

    }

    static void complexInterest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the sum of the investment in leva: ");
        double interest = scanner.nextDouble();
        System.out.println("Please enter the percentage: ");
        double percentage = scanner.nextDouble() / 100;
        System.out.println("Please enter the number of years");
        double years = scanner.nextDouble();
        System.out.println("Please enter months");
        double months = scanner.nextDouble();
        double yearlyComplexInterest = interest * percentage * months * years;
        System.out.println(yearlyComplexInterest);

    }
}
