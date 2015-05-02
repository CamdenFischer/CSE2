import java.util.Scanner;
public class FourDwin{
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        boolean check1 = true;
        boolean check2 = true;
        boolean check3 = true;
        int x = 0;
        int y = 0;
        //get proper x and y inputs
        while (check1){
            System.out.println("Enter an integer X: ");
            if (scan.hasNextInt()){
                x = scan.nextInt();
                check1 = false;
            }
            else {
                System.out.println("Invalid input");
            }
        }
        while (check2){
            System.out.println("Enter an integer Y where Y > X: ");
            if (scan.hasNextInt()){
                y = scan.nextInt();
                check2 = false;
            }
            else {
                System.out.println("Invalid input");
            }
        }
        while (check3){
            if (y > x){
                check3 = false;
            }
            else {
                System.out.println("Invalid input");
            }
        }
        
        System.out.println("The original array: ");
        double array[][][][] = new double[randomInt(x, y)][randomInt(x, y)][randomInt(x, y)][3];
        int dOne;
        int dTwo;
        int dThree;
        int dFour;
        for (dOne = 0; dOne < array.length; dOne++){
            for (dTwo = 0; dTwo < array[dOne].length; dTwo++){
                for (dThree = 0; dThree < array[dOne][dTwo].length; dThree++){
                    System.out.print("{");
                    for (dFour = 0; dFour < array[dOne][dTwo][dThree].length; dFour++){
                        array[dOne][dTwo][dThree][dFour] = randomDouble(x, y);
                        System.out.print(array[dOne][dTwo][dThree][dFour]+", ");
                    }
                    System.out.print("}, ");
                }
            }
        }
        statArray(array);
        sort4DArray(array);
        System.out.println("The sorted array: ");
        printArray(array);
    }//end of main method
    
    
    public static int randomInt(int x, int y){
        double a = (Math.random()*y+1-x)+x;
        int b = (int) a;
        return b;
    }
    
    public static void printArray(double array[][][][]){
        int a, b, c, d;
        for (a = 0; a < array.length; a++){
            for (b = 0; b < array[a].length; b++){
                for (c = 0; c < array[a][b].length; c++){
                    System.out.print("{");
                    for (d = 0; d < array[a][b][c].length; d++){
                        System.out.print(array[a][b][c][d]+", ");
                    }
                    System.out.print("}, ");
                }
            }
        }
    }
    
    public static double randomDouble(int x, int y){
        double a = (Math.random()*y+1-x)+x;
        double b =(double) Math.round(a*10)/10;
        return b;
    }
    
    public static void statArray(double[][][][] array){
        double count = 0; 
        double sum = 0;
        int dOne;
        int dTwo;
        int dThree;
        int dFour;
        for (dOne = 0; dOne < array.length; dOne++){
            for (dTwo = 0; dTwo < array[dOne].length; dTwo++){
                for (dThree = 0; dThree < array[dOne][dTwo].length; dThree++){
                    for (dFour = 0; dFour < array[dOne][dTwo][dThree].length; dFour++){
                        count+=1;
                        sum+=array[dOne][dTwo][dThree][dFour];
                    }
                }
            }
        }
        System.out.println("\nMembers: "+count);
        System.out.println("\nSum: "+sum);
        System.out.println("\nMean: "+(sum/count));
    }
    
    public static double[][][][] sort4DArray(double[][][][] array){
        int dOne;
        int dTwo;
        int dThree;
        int dFour;
        double min = 1000000;
        int minSpot = 0;
        double temp;
        for (dOne = 0; dOne < array.length; dOne++){
            for (dTwo = 0; dTwo < array[dOne].length; dTwo++){
                for (dThree = 0; dThree < array[dOne][dTwo].length; dThree++){
                    min = 1000000;
                    for (dFour = 0; dFour < array[dOne][dTwo][dThree].length; dFour++){
                        if (array[dOne][dTwo][dThree][dFour] < min){
                            minSpot = dFour;
                            min = array[dOne][dTwo][dThree][dFour];
                    }
                    temp = array[dOne][dTwo][dThree][minSpot];
                    array[dOne][dTwo][dThree][minSpot] = array[dOne][dTwo][dThree][dFour];
                    array[dOne][dTwo][dThree][dFour] = temp;
                    }
                }
            }
        }
        return array;
    }
    

    
}//end of class