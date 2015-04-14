import java.util.Scanner;
public class CSE2Linear{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int array[] = new int[15];
        System.out.println("Enter 15 ints for final grades in CSE2");
        for (int i = 0; i < 15; i++){
            if (scan.hasNextInt()){
                array[i] = scan.nextInt();
            }
            else {
                System.out.println("You did not enter an int");
                System.exit(0);
            }
        }
        System.out.print("the numbers, sorted, are: ");
        for (int i = 0; i < 15; i++){
            System.out.print(array[i]+", ");
            if ((array[i] < 0) || (array[i] > 100)){
                System.out.println("One of the numbers was not between 0 and 100");
                System.exit(0);
            }
            if ((i >=1) && (array[i] < array[i-1])){
                System.out.println("One of the numbers was less than the previous number");
                System.exit(0);
            }
        }
        System.out.println("\nEnter a grade to search for: ");
        int num = scan.nextInt();
        binary(array, num);
        array = shuffle(array);
        System.out.println("\nEnter a grade to search for: ");
        int n = scan.nextInt();
        linear(array, n);
    }//end of main method
    
    
    public static void binary(int array[], int num){
        int low = 0;
        int high = 14;
        int count = 1;
        int i = (low+high)/2;
        while ((array[i] != num)&&(low <= high)){
            count++;
            if (array[i] > num){
                high = i -1;
            }
            else {
                low = i +1;
            }
            i = (low+high)/2;
        }
        if (low <=high){
            System.out.println(num+" was found in "+count+" iterations");
        }
        else {
            System.out.println(num+" was not found in "+count+" iterations");
        }
    }//end of binary method
    
    public static int[] shuffle(int array[]){
        System.out.print("The shuffled array is: ");
        for (int i = 0; i < array.length; i++){
            int target = (int) (array.length * Math.random());
            int temp = array[target];
            array[i] = temp;
            System.out.print(array[i]+", ");
        }
        return array;
    }//end of shuffle method
    
    public static void linear(int array[], int num){
        int count = 1;
        for (int i = 0; i < array.length; i++, count++){
            if (array[i] == num){
                System.out.println(num+" was found in "+count+" iterations");
                break;
            }
        }
    } //end of  linear method
        
}//end of class