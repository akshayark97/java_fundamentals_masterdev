package loops;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again;

        do {
            System.out.println("Enter the first Number");
            double num1 = scanner.nextDouble();
            System.out.println("Enter the second Number");
            double num2= scanner.nextDouble();

            System.out.println("The sum of is: " + (num1 + num2));
            System.out.println("Do you want to try it again? if Yes 'true' or 'false'");
            again = scanner.nextBoolean();
        } while(again);
    }
}
