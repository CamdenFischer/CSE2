//Camden Fischer
//You will develop a program which takes decimal RGB values 
//(three inputs) and convert them to hexadecimal.
import java.util.Scanner;
public class ToHex {
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner ( System.in );
        
        /*int r = 0;
        int g = 0; //i have to declare these variables now
        int b = 0; //so i can change them inside the if statements
        int rOne = 0; //I need so many variables bc i chance each one twice
        int rTwo = 0; //and there are two digits for each number
        int gOne = 0;
        int gTwo = 0;
        int bOne = 0;
        int bTwo = 0;*/
        System.out.println("Please enter R value:\n"); 
        if (myScanner.hasNextInt()){ //first if
            int r = myScanner.nextInt();
            System.out.println("Please enter G value:\n");
            if (myScanner.hasNextInt()) {//second if
                int g = myScanner.nextInt();
                System.out.println("Please enter B value:\n");
                if (myScanner.hasNextInt()) {//third if
                    int b = myScanner.nextInt();
                    if (( r <= 255 && r >=0) && ( g<= 255 && g >=0) && ( b <= 255 && b >=0 )) { //make sure all numbers are between 0 and 255
                        //The following finds the first and second digit, in hexa, of each number
                        int rOne = r % 16;
                        int rTwo = (r/16) % 16;
                        int gOne = g % 16;
                        int gTwo = (g/16) % 16;
                        int bOne = b % 16;
                        int bTwo = (b/16) % 16;
                        char rOneF = 0;
                        char rTwoF = 0; 
                        char gOneF = 0; 
                        char gTwoF = 0; 
                        char bOneF = 0; 
                        char bTwoF = 0;
                        //now i need to make 6 switches to change the number to its corresponding letter, and to a char
                        switch ( rOne ) { //start of switch1 - rOne
                            case 0:
                                 rOneF = '0';
                                break;
                            case 1:
                                 rOneF = '1';
                                break;
                            case 2:
                                 rOneF = '2';
                                break;
                            case 3:
                                 rOneF = '3';
                                break;
                            case 4:
                                 rOneF = '4';
                                break;
                            case 5:
                                 rOneF = '5';
                                break;
                            case 6:
                                 rOneF = '6';
                                break;
                            case 7:
                                 rOneF = '7';
                                break;
                            case 8:
                                 rOneF = '8';
                                break;
                            case 9:
                                 rOneF = '9';
                                break;
                            case 10:
                                 rOneF = 'A';
                                break;
                            case 11:
                                 rOneF = 'B';
                                break;
                            case 12:
                                 rOneF = 'C';
                                break;
                            case 13:
                                 rOneF = 'D';
                                break;
                            case 14:
                                 rOneF = 'E';
                                break;
                            case 15:
                                 rOneF = 'F';
                                break;
                        } //end of switch1 - rOne
                        switch ( rTwo ) { //start of switch2 - rTwo
                            case 0:
                                 rTwoF = '0';
                                break;
                            case 1:
                                 rTwoF = '1';
                                break;
                            case 2:
                                 rTwoF = '2';
                                break;
                            case 3:
                                 rTwoF = '3';
                                break;
                            case 4:
                                 rTwoF = '4';
                                break;
                            case 5:
                                 rTwoF = '5';
                                break;
                            case 6:
                                 rTwoF = '6';
                                break;
                            case 7:
                                 rTwoF = '7';
                                break;
                            case 8:
                                 rTwoF = '8';
                                break;
                            case 9:
                                 rTwoF = '9';
                                break;
                            case 10:
                                 rTwoF = 'A';
                                break;
                            case 11:
                                 rTwoF = 'B';
                                break;
                            case 12:
                                 rTwoF = 'C';
                                break;
                            case 13:
                                 rTwoF = 'D';
                                break;
                            case 14:
                                 rTwoF = 'E';
                                break;
                            case 15:
                                 rTwoF = 'F';
                                break;
                        } //end of switch2 - rTwo
                        
                            switch ( gOne ) { //start of switch3
                            case 0:
                                 gOneF = '0';
                                break;
                            case 1:
                                 gOneF = '1';
                                break;
                            case 2:
                                 gOneF = '2';
                                break;
                            case 3:
                                 gOneF = '3';
                                break;
                            case 4:
                                 gOneF = '4';
                                break;
                            case 5:
                                 gOneF = '5';
                                break;
                            case 6:
                                 gOneF = '6';
                                break;
                            case 7:
                                 gOneF = '7';
                                break;
                            case 8:
                                 gOneF = '8';
                                break;
                            case 9:
                                 gOneF = '9';
                                break;
                            case 10:
                                 gOneF = 'A';
                                break;
                            case 11:
                                 gOneF = 'B';
                                break;
                            case 12:
                                 gOneF = 'C';
                                break;
                            case 13:
                                 gOneF = 'D';
                                break;
                            case 14:
                                 gOneF = 'E';
                                break;
                            case 15:
                                 gOneF = 'F';
                                break;
                        } //end of switch3
                            switch ( gTwo ) { //start of switch4
                            case 0:
                                 gTwoF = '0';
                                break;
                            case 1:
                                 gTwoF = '1';
                                break;
                            case 2:
                                 gTwoF = '2';
                                break;
                            case 3:
                                 gTwoF = '3';
                                break;
                            case 4:
                                 gTwoF = '4';
                                break;
                            case 5:
                                 gTwoF = '5';
                                break;
                            case 6:
                                 gTwoF = '6';
                                break;
                            case 7:
                                 gTwoF = '7';
                                break;
                            case 8:
                                 gTwoF = '8';
                                break;
                            case 9:
                                 gTwoF = '9';
                                break;
                            case 10:
                                 gTwoF = 'A';
                                break;
                            case 11:
                                 gTwoF = 'B';
                                break;
                            case 12:
                                 gTwoF = 'C';
                                break;
                            case 13:
                                 gTwoF = 'D';
                                break;
                            case 14:
                                 gTwoF = 'E';
                                break;
                            case 15:
                                 gTwoF = 'F';
                                break;
                        } //end of switch4
                            switch ( bOne ) { //start of switch5 - bOne
                            case 0:
                                 bOneF = '0';
                                break;
                            case 1:
                                 bOneF = '1';
                                break;
                            case 2:
                                 bOneF = '2';
                                break;
                            case 3:
                                 bOneF = '3';
                                break;
                            case 4:
                                 bOneF = '4';
                                break;
                            case 5:
                                 bOneF = '5';
                                break;
                            case 6:
                                 bOneF = '6';
                                break;
                            case 7:
                                 bOneF = '7';
                                break;
                            case 8:
                                 bOneF = '8';
                                break;
                            case 9:
                                 bOneF = '9';
                                break;
                            case 10:
                                 bOneF = 'A';
                                break;
                            case 11:
                                 bOneF = 'B';
                                break;
                            case 12:
                                 bOneF = 'C';
                                break;
                            case 13:
                                 bOneF = 'D';
                                break;
                            case 14:
                                 bOneF = 'E';
                                break;
                            case 15:
                                 bOneF = 'F';
                                break;
                        } //end of switch5 - bOne
                            switch ( bTwo ) { //start of switch6 - bTwo
                            case 0:
                                 bTwoF = '0';
                                break;
                            case 1:
                                 bTwoF = '1';
                                break;
                            case 2:
                                 bTwoF = '2';
                                break;
                            case 3:
                                 bTwoF = '3';
                                break;
                            case 4:
                                 bTwoF = '4';
                                break;
                            case 5:
                                 bTwoF = '5';
                                break;
                            case 6:
                                 bTwoF = '6';
                                break;
                            case 7:
                                 bTwoF = '7';
                                break;
                            case 8:
                                 bTwoF = '8';
                                break;
                            case 9:
                                 bTwoF = '9';
                                break;
                            case 10:
                                 bTwoF = 'A';
                                break;
                            case 11:
                                 bTwoF = 'B';
                                break;
                            case 12:
                                 bTwoF = 'C';
                                break;
                            case 13:
                                 bTwoF = 'D';
                                break;
                            case 14:
                                 bTwoF = 'E';
                                break;
                            case 15:
                                 bTwoF = 'F';
                                break;
                                //if (rOne == 0) {
                                    
                                //}
                        } //end of switch6 - bTwoF
                            //String f = rOneF + rTwoF + gOneF + gTwoF + bOneF + bTwoF;
                            System.out.println(rTwoF+""+rOneF+""+gTwoF+""+gOneF+""+bTwoF+""+bOneF+"\n");
                    }
                    else {
                        System.out.println("The numbers must be between 0 and 255");
                    }
                }//third if
                else {
                    System.out.println("You did not enter an int");
                }
            }//second if
            else {
                System.out.println("You did not enter an int");
            }
        } //first if
        else {
            System.out.println("You did not enter an int");
        }
        
    }//end of container
}//end of class