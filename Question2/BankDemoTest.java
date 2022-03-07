package wk08_Lab.Question2;

import java.io.*;
import java.util.Scanner;

public class BankDemoTest {
    public static void main(String[] args) {
        CheckingAccount checkingAccount1 = new CheckingAccount(100.00, 123456789);

        Scanner myObj = new Scanner(System.in);
        // a. Deposit $xx into the account object using keyboard input.
        System.out.print("Enter Deposit: $");
        double userDeposit = myObj.nextDouble(); // Read user input
        checkingAccount1.deposit(userDeposit);

        // b. Withdraw $yy amount from the account object using keyboard input.
        System.out.print("Enter Withdraw: $");
        double userWithdraw = myObj.nextDouble(); // Read user input

        try {
            checkingAccount1.withdraw(userWithdraw);
            // c. If $yy < $xx, print out the account balance “The balance after withdraw
            // is: $ ”.
            System.out.println("The balance after withdrawis: $ " + checkingAccount1.getBalance());
        } catch (InsufficientFundsException e) {
            // d. If $yy > $xx, print the user-defined exception and short amount “Sorry,
            // but your account is short by: $ ”
            System.out.println("Caught: " + e);
            System.out.println("Sorry, but your account is short by: $" + e.getAmount());
        }
    }
}
