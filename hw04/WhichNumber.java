//camden fischer
//2/12/15
//Make a program that prompts the user for an integer between 1 and 10. Then ask a series of questions to determine the number.
import java.util.Scanner;
public class WhichNumber {
    public static void main (String[] args) {
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        System.out.print("Think of a number between 1 and 10, and I will guess that number \nEnter all answers as true or false\n");
                System.out.print("Is the number even? ");
                boolean even = myScanner.nextBoolean();
                if ( even == true ) { //number is even
                    System.out.print("\nIs the number divisible by 3? ");
                    boolean divisibleByThree = myScanner.nextBoolean();
                    if ( divisibleByThree == true ) { //number is divisible by 3
                        System.out.println("\nYour number is 6"); }
                    else if ( divisibleByThree == false ) { //number is not divisible by 3
                        System.out.print("\nIs your number divisible by 4? ");
                        boolean divisibleByFour = myScanner.nextBoolean();
                        if ( divisibleByFour ==true ){ //n is divisible by 4
                            System.out.print("\nIs your number divided by four greater than one? ");
                            boolean greaterThanOne = myScanner.nextBoolean();
                            if ( greaterThanOne ==true ) { //n / 4 > 1
                                System.out.println("\nYour number is 8"); }
                            else if ( greaterThanOne ==false) { // number /4 is not >1
                                System.out.print("\nYour number is 4"); }
                        }
                        else if ( divisibleByFour ==false) { //not divisible by 4
                            System.out.print("\nIs your number divisible by 5? ");
                            boolean divisibleByFive = myScanner.nextBoolean();
                            if ( divisibleByFive ==true) { // divisible by 5
                                System.out.println("\nYour number is 10"); }
                            else if ( divisibleByFive ==false) { // not divisible by 5
                                System.out.println("\nYour number is 2"); }
                            else {
                                System.out.println("\nYou did not enter true or false "); }
                        }
                        else {
                            System.out.println("\nYou did not enter true or false "); }
                    }
                    else {
                        System.out.print("\nYou did not enter true or false "); }
                }
                else if ( even ==false) { //not even
                    System.out.print("\nIs your number divisible by 3? ");
                    boolean divisibleByThree = myScanner.nextBoolean();
                    if ( divisibleByThree ==true) { //divisible by 3
                        System.out.print("\nIs your number divided by 3 greater than one? ");
                        boolean greaterThanOne = myScanner.nextBoolean();
                        if ( greaterThanOne ==true) { // n/3>1
                            System.out.println("\nYour number is 9"); }
                        else if ( greaterThanOne ==false) { // n/3 not >1
                            System.out.println("\nYour number is 3"); }
                        else {
                            System.out.println("\nYou did not enter true or false "); }
                    }
                    else if ( divisibleByThree ==false) {
                        System.out.print("\nIs your number greater than 6? ");
                        boolean greaterThanSix = myScanner.nextBoolean();
                        if ( greaterThanSix ==true) {
                            System.out.println("\nYour number is 7"); }
                        else if ( greaterThanSix ==false) {
                            System.out.print("\nIs your number less than 3? ");
                            boolean lessThanThree = myScanner.nextBoolean();
                            if ( lessThanThree ==true) {
                                System.out.println("\nYour number is 1"); }
                            else if ( lessThanThree==false) {
                                System.out.println("\nYour number is 5"); }
                            else {
                                System.out.print("\nYou did not enter true or false "); }
                        }
                        else {
                            System.out.println("\nYou did not enter true or false "); }
                    }
                    else {
                        System.out.println("\nYou did not enter true or false "); }
                }
                else {
                    System.out.print("\nYou did not enter true or false "); }
        
    }//end of method
} //end of class