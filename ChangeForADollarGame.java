package Chapter3;
//ChangeForADollarGame

//import javax.naming.NamingException;
import java.util.Scanner;
public class ChangeForADollarGame {

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        double pennies = 0.01 ;
        double nickels = 0.05 ;
        double dimes = 0.10 ;
        double quarters = 0.25;
        int Dollar=1;

        System.out.println("Welcome to 'Change for a Dollar'! " +
                "Your goal is to enter enough change to make exactly $1.00");

        System.out.println("Enter your number of pennies");
        int numOfPennies = Scanner.nextInt();

        System.out.println("Enter your number of nickels");
        int numOfNickels = Scanner.nextInt();

        System.out.println("Enter your number of dimes");
        int numOfDimes = Scanner.nextInt();

        System.out.println("Enter your number of quarters");
        int numOfQuarters = Scanner.nextInt();

        Scanner.close();

        double Total = numOfPennies*pennies + numOfNickels*nickels + numOfDimes+dimes + numOfQuarters+quarters;
        double amountShort = Dollar - Total;
        double amountOver = Total - Dollar;

        if (Total<Dollar){
            System.out.println("Sorry, you lose! You were short " + String.format("%.2f", amountShort) + " cents.");}
        else if (Total>Dollar) {
            System.out.println("Sorry, you lose! You were over " + String.format("%.2f", amountOver) + " cents.");}
        else {
            System.out.println("Congrats! That's exactly $1.00! You win!");}

    }
}
