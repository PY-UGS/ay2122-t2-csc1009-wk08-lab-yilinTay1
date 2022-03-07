package wk08_Lab.Question2;

import java.io.*;

// want to write a checked exception that is automatically enforced by the Handle or Declare Rule, 
// extend the Exception class. 
public class InsufficientFundsException extends Exception { //considered to be checked exceptions
    private double amount;

    public InsufficientFundsException(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
