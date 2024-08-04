package Chapter3;
/*NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.*/

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String[] args) {

        int RequiredSalary= 30000;
        int RequiredYearsEmployed= 2;

        System.out.println("Enter your salary: ");
        Scanner Scanner = new Scanner(System.in);
        double salary = Scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer: ");
        double years = Scanner.nextDouble();
        Scanner.close();

        if(salary >= RequiredSalary){

            if(years >= RequiredYearsEmployed){
                System.out.println("Congrats! You qualify for the loan");
            }
            else{
                System.out.println("Sorry, you must have worked at your current job "
                        + RequiredYearsEmployed+ " years.");
            }
        }
        else{
            System.out.println("Sorry, you must earn at least $"
                    + RequiredSalary + " to qualify for the loan");
        }
    }
}
