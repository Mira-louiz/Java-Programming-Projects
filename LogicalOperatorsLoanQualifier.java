package Chapter3;
/*LogicalOperators:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.*/

import java.util.Scanner;

public class LogicalOperatorsLoanQualifier {
    public static void main(String[] args) {

        int RequiredSalary= 30000;
        int RequiredYearsEmployed= 2;

        System.out.println("Enter your salary: ");
        Scanner Scanner = new Scanner(System.in);
        double salary = Scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer: ");
        double years = Scanner.nextDouble();
        Scanner.close();

        if(salary >= RequiredSalary && years >= RequiredYearsEmployed ){
                System.out.println("Congrats! You qualify for the loan");
            }
        else{
            System.out.println("Sorry, you must earn at least $"
                    + RequiredSalary + " to qualify for the loan");
        }
    }
}
