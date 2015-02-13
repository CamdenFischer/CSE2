// Camden Fischer
// 2/12/15
//Write a program using switch statements that allows users to process banking transactions. 
//Start the user off with a random amount between 1,000 and 5,000 in their 
//bank account using the java.util.Random library or the 
//Random function in the java.lang.Math library. 
//Then offer them the choice of depositing money, withdrawing money, or viewing their balance. 
//If they choose to deposit, ask them how much they want to deposit and make sure 
//they enter a positive number. Then print their resulting balance. 
//If they choose to withdraw, ask them how much they want to withdraw and make sure 
//it is a positive number no more than the amount in their account. Then print the resulting balance.
import java.util.Scanner;
public class Banking {
    public static void main (String[] args) {
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        int balance = (int) (Math.random() * 4000 + 1000 );
        System.out.println("Your current balance is $"+balance+ "\nPress 1 to deposit\nPress 2 to withdraw\nPress 3 to view final balance\n");
        int input = myScanner.nextInt();
        if ( input == 1 ) { 
            System.out.print("How much would you like to deposit? ");
            int deposit = myScanner.nextInt();
            int finalBalance = (balance + deposit);
            System.out.println("Your final balance is $"+finalBalance+"\n");
        }
        else if ( input == 2 ) {
            System.out.print("How much would you like to withdraw? ");
            int withdraw = myScanner.nextInt();
            int finalBalance = (balance - withdraw);
            System.out.println("Your final balance is " +finalBalance+ "\n");
        }
        else if ( input == 3 ) {
            System.out.println("Your final balance is $" +balance+ "\n");
        }
        else {
            System.out.println("Not a valid input");
        }
    } //end of method
} //end of class