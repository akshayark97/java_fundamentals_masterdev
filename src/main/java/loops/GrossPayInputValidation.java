package loops;

import java.util.Scanner;

public class GrossPayInputValidation {

    public static void main(String[] args) {
        int rate = 15;
        double maxHourWorked = 40;

        System.out.println("Enter the hour your worked");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while(hoursWorked > maxHourWorked) {
            System.out.println("You worked the maximum hour and it's invalid. Please Try again!");
            hoursWorked = scanner.nextDouble();
        }

        double grossPay = hoursWorked * rate;

        System.out.println("Gross Pay: " + grossPay);
    }
}
