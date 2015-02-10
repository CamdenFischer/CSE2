// Camden Fischer
//2/10/15
//Write a program that prompts the user to enter two digits,
//the first giving the number of counts on a cyclometer
//and the second giving the number of seconds during
//which the counts occurred, and then an then prints out the
//distance traveled and the average miles per hour.
//Your program should assume the diameter of the wheel is 27 inches. 
//See lab 02 for the details of the computation. 
//Save your program in the file Bicycle.java (and of course name the class Bicycle).
//Recall that in lab 2 we only computed the distance and the number of minutes.
//The average miles per hour is that distance divided by the number of hours
//(the number of minutes divided by 60).
//Here is a sample run:

import java.util.Scanner;
public class Bicycle {
    public static void main(String[] args) {
        // Useful constants to do calculations with
        double PI=3.14159; //
        int feetPerMile=5280;  //
        int inchesPerFoot=12;   //
        int secondsPerMinute=60;  //
        double wheelDiameter = 27;

        //Get our inputs
        Scanner myScanner; //declare scanner
        myScanner = new Scanner( System.in ); //scanner takes input
        System.out.print("Enter the number of seconds: "); //prompts user for number of secs
        int nSeconds = myScanner.nextInt(); //sets that number to nSeconds
        System.out.print("Enter the number of counts: "); //prompts user for number of counts
        int nCounts = myScanner.nextInt(); //sets that number to nCounts
        
        // Calculate the distance and convert it to miles
        double nInches = nCounts * wheelDiameter * PI;
        double nFeet = nInches / 12;
        double nMiles = nFeet / feetPerMile;
      
        //convert time Sto hours
        double nMinutes = nSeconds / secondsPerMinute;
        double nHours = nMinutes / 60;
        //calculcate miles per hour, and then multiply and divide by 100 to get 2 decimal points
        double averageMPH = nMiles / nHours;
        //print results
        System.out.printf("The distance was %.2f miles \n", nMiles);
        System.out.printf("The average speed was %.2f mph \n", averageMPH);
        
    }
}

