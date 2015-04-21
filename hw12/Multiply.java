import java.util.Scanner;
public class Multiply{
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        boolean check = true;
        int width1 = 0;
        int width2 = 0;
        int height1 = 0;
        int height2 = 0;
        while (check){
            System.out.println("Enter a width for the first matrix: \n");
            width1 = scan.nextInt();
            System.out.println("Enter a height for the first matrix: \n");
            height1 = scan.nextInt();
            System.out.println("Enter a width for the second matrix: \n");
            width2 = scan.nextInt();
            System.out.println("Enter a height for the second matrix: \n");
            height2 = scan.nextInt();
            if ((width1 == width2) && (height1==height2)&&(width1*height1*width2*height2 > 0)){
                check = false;
            }
            else {
                System.out.println("Your matrix dimensions were not compatible for matrix multiplication. Please enter again.");
                
            }
        }
        int array1[][] = randomMatrix(width1, height1);
        System.out.println("Matrix 1: \n");
        printMatrix(array1);
        int array2[][] = randomMatrix(width2, height2);
        System.out.println("\nMatrix 2: \n");
        printMatrix(array2);
        int array[][] = matrixMultiply(array1, array2);
        System.out.println("When multiplied: \n");
        printMatrix(array);
    }//end of main method
    
    
    public static int[][] randomMatrix(int width, int height){
        int array[][] = new int[width][height];
        int x = 0;
        int w, h;
        for ( w = 0; w < width; w++){
            for ( h = 0; h < height; h++){
                double n = Math.random()*20-10;
                array[w][h] = (int) n;
            }
        }
        
        return array;
    }//end of randomMatrix method
    
    public static void printMatrix(int[][] array){
        for (int h = 0; h < array[1].length; h++){
            for (int w = 0; w < array.length; w++ ){
                System.out.print(array[w][h]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
    }//end of printMatrix method
    
    public static int[][] matrixMultiply(int[][] array1, int[][] array2){
        int[][] array = new int[array1.length][array1[1].length];
        if ((array1.length == array2.length)&&(array1[1].length == array2[1].length)){
            int x, n, t, i, j, h, w, sum; //just possible variables i may want to use
            for (i = 0; i < array.length; i++){
                for (j = 0; j < array[1].length; j++){
                    sum = 0;
                    for (x = 0; x < array.length; x++){
                        sum+=array1[x][j]*array2[i][x];
                    }
                    array[i][j] = sum;
                }
            }
            return array;
        }   
        
        else {
            System.out.println("Error: the two arrays are not the same size.");
            return null;
        }
    }//end of matrixMultiply method
    
    
}//end of class