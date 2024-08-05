package Chapter3;

/* IF-ELSE-IF
  Display the letter grade for a student based on their test score.*/

import java.util.Scanner;

public class TestResults {
    public static void main(String[] args) {

        System.out.println("Enter your test score:");
        Scanner Scanner = new Scanner(System.in);
        double Score = Scanner.nextDouble();
        char Grade ;
        Scanner.close();
        if (Score < 60){ Grade = 'F';}
        else if (Score < 70) {Grade='D';}
        else if (Score < 80) {Grade='C';}
        else if (Score < 90) {Grade='B';}
        else  {Grade='A';}
        System.out.println("Your grade is: " + Grade);

        }
    }
