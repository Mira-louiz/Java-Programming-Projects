package Chapter4;
/*WHILE LOOP:
 * Each store employee makes $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime.*/

import java.util.Scanner;

public class EmployeeGrossPayInput {

    public static void main(String[] args) {

         int rate = 15;
         int maxhours= 40;

         Scanner Scanner = new Scanner(System.in);
        System.out.println("How many hours did you work this week?");
         double hoursworked = Scanner.nextDouble();
         while (hoursworked>maxhours ||hoursworked<1){
             System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again.");
             hoursworked=Scanner.nextDouble();
         }
         Scanner.close();
         double Gross = rate * hoursworked;
         System.out.println("Gross pay: $ "+ Gross );
    }
}
