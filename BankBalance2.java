// do...while loop upgrade to BankBalance.java
import java.util.Scanner;

public class BankBalance2
{
    public static void main(String[] args)
    {
    // Variables and Constants.
        double balance;
        int response;
        int year = 1;
        final double INT_RATE = 0.03;
        Scanner kbd = new Scanner(System.in);
    // Input Phase.
        System.out.print("Enter the starting bank balance: ");
        balance = kbd.nextDouble();

    // Processing & Output Phase.
        do
        {
            balance = balance + (balance * INT_RATE);
            double roundBalance = (double) Math.round(balance * 100d) / 100d; // Typecasting to force into a double.
            System.out.println("After year " + year + " at " + INT_RATE + " interest rate, your balance is $" + roundBalance);
            year = year + 1;
            System.out.print("To see the balance at the end of another year enter [1], otherwise enter any other number to quit: ");
            response = kbd.nextInt();
        } while (response == 1); // End of do...while loop.
        System.out.println("\nClosing program... ");
        kbd.close();
    }// End of main().
}// End of class.