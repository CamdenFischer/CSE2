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
        double balance = (double) (Math.random() * 4000 + 1000 ); //generates random number
        //I will ask the use to enter 1 to deposit, 2 to withdraw, and 3 to view final balance
        System.out.printf("Your current balance is $%.2f \nPress 1 to deposit\nPress 2 to withdraw\nPress 3 to view final balance\n", balance);
        int input = myScanner.nextInt();
        if ( input == 1 ) { //1 is for deposit
            System.out.print("How much would you like to deposit? ");
            double deposit = myScanner.nextDouble();
            double finalBalance = (balance + deposit); //final balance is equal to original plus deposit
            System.out.printf("Your final balance is $%.2f \n", finalBalance);
        }
        else if ( input == 2 ) { //2 is for withdraw
            System.out.print("How much would you like to withdraw? ");
            double withdraw = myScanner.nextDouble();
            if ( withdraw <= balance ) { //withdraw can not be more than original balance
                double finalBalance = (balance - withdraw);
                System.out.printf("Your final balance is $%.2f \n", finalBalance); }
            else {
                System.out.println("You cannot withdraw more than your balance"); }    
        }
        else if ( input == 3 ) { //3 is to view final balance
            System.out.printf("Your final balance is $%.2f \n", balance);
        }
        else {
            System.out.println("Not a valid input");
        }
    } //end of method
} //end of class