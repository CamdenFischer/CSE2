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
                if ( myScanner.nextBoolean() == true ) {
                    System.out.print("\nIs the number divisible by 3? ");
                    if ( myScanner.nextBoolean() == true ) {
                        System.out.println("\nYour number is 6"); }
                    else if ( myScanner.nextBoolean() == false ) {
                        System.out.print("\nIs your number divisible by 4? ");
                        if ( myScanner.nextBoolean() ==true ){
                            System.out.print("\nIs your number divided by four greater than one? ");
                            if ( myScanner.nextBoolean() ==true) {
                                System.out.println("\nYour number is 8"); }
                            else if ( myScanner.nextBoolean() ==false) {
                                System.out.print("\nYour number is 4"); }
                        }
                        else if (myScanner.nextBoolean() ==false) {
                            System.out.print("\nIs your number divisible by 5? ");
                            if ( myScanner.nextBoolean() ==true) {
                                System.out.println("\nYour number is 10"); }
                            else if ( myScanner.nextBoolean() ==false) {
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
                else if ( myScanner.nextBoolean() ==false) {
                    System.out.print("\nIs your number divisible by 3? ");
                    if ( myScanner.nextBoolean() ==true) {
                        System.out.print("\nIs your number divided by 3 greater than one? ");
                        if ( myScanner.nextBoolean() ==true) {
                            System.out.println("\nYour number is 9"); }
                        else if ( myScanner.nextBoolean() ==false) {
                            System.out.println("\nYour number is 3"); }
                        else {
                            System.out.println("\nYou did not enter true or false "); }
                    }
                    else if ( myScanner.nextBoolean() ==false) {
                        System.out.print("\nIs your number greater than 6? ");
                        if ( myScanner.nextBoolean() ==true) {
                            System.out.println("\nYour number is 7"); }
                        else if ( myScanner.nextBoolean() ==false) {
                            System.out.print("\nIs your number less than 3? ");
                            if ( myScanner.nextBoolean() ==true) {
                                System.out.println("\nYour number is 1"); }
                            else if ( myScanner.nextBoolean() ==false) {
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