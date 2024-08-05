package Chapter3;

import java.util.Scanner;

public class TestResultsMessages {
    public static void main(String[] args) {

        System.out.println("Enter your letter grade: ");
        Scanner Scanner = new Scanner(System.in);
        String grade = Scanner.next();
        Scanner.next();
        String message;
        Scanner.close();

        switch (grade) {
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message= "Error! invalid grade";
                break;

        }
        System.out.println(message);

    }
}
