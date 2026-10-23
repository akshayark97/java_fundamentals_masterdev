package decision_structure;

import java.util.Scanner;

public class GradeMessage_SwitchExpressions {
    public static void main(String[] args) {

        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();
        // Here default is not required
        String message = switch(grade) {
                // basic switch expression
//                case "A" -> "Excellent job";
//                case "B" -> "Great Job";
//                case "C" -> "Good Job";
//                case "D" -> "you need to work a bit harder";
//                case "F" -> "Uh oh!";
//                default -> "Invalid grade";

                  case "A", "B" -> "Excellent job"; // use same statement for multiple cases
                  // case "B" -> "Great Job";
                  case "C" -> {
                      System.out.println("execute the statement above yield");
                      yield "Good Job"; // it will always return at the end of the statement before any code
                  }
                  case "D" -> "you need to work a bit harder";
                  case "F" -> "Uh oh!";
                  default -> "Invalid grade";
        };

        System.out.println(message);
    }
}
