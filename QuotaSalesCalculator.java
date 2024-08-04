package Chapter3;
/*IF ELSE
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don't, they are informed of how many sales they were short.*/

import java.util.Scanner;

public class QuotaCalculator {
    public static void main (String [] args) {

        int quota = 10;

        System.out.println("Enter the number of sales you made this week:");

        Scanner Scanner = new Scanner(System.in);
        int sales =  Scanner.nextInt();
        Scanner.close();

        if (sales >= quota) {
            System.out.println("congratulations! you've met your quota");
        }
        else {
            int salesshort= sales - quota;
            System.out.println("You did not make your quota. You were " + salesshort+ " salesshort");
        }
    }
}
