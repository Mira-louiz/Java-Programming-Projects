package Chapter3;
import java.util.Scanner;

/* IF Statement.
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250. */

public class SalaryCalculator {

public static void main (String[] args) {

    //initialize the known values
    int Salary = 1000;
    int Bonus = 250;

    //get the values for unknown
    System.out.println("How many sales did the employee did this week?");
    Scanner Scanner = new Scanner(System.in);
    int sales = Scanner.nextInt();
    Scanner.close();

    //The bonus earners
    if (sales > 10) {
        Salary = Salary + Bonus;}

    //Output
    System.out.println("The employee's salary is  "+ Salary + "$" );
  }
}
