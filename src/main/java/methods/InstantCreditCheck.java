package methods;

import java.util.Scanner;

public class InstantCreditCheck {

    static int requiredSalary = 30000;
    static int requiredCreditScore = 800;

    static Scanner scanner = new Scanner(System.in);

    //
    public static void main(String[] args) {
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        boolean qualified = isUserQualified(salary, creditScore);

        notifyUser(qualified);
    }

    private static void notifyUser(boolean qualified) {
        if(qualified) {
            System.out.println("Hurray! you qualified for the loan");
        } else System.out.println("Sorry! your are not qualified");
    }

    private static boolean isUserQualified(double salary, int creditScore) {
        return (salary >= requiredSalary && creditScore >= requiredCreditScore);
    }


    public static int getSalary() {
        System.out.println("Enter you salary");
        int salary = scanner.nextInt();
        return salary;
    }

    public static int getCreditScore() {
        System.out.println("Enter you credit score");
        int creditScore = scanner.nextInt();
        return creditScore;
    }
}
