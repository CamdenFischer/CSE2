//Camden Fischer
//4/2/15
//The randomInput() method generates an array of 15 random integers between 0 to 9.  
//Implement randomInput so that it fills the array with random integers and returns the filled array. 
//The method delete(list,pos) takes, as input, an integer array called list and an integer called pos.  
//It should create a new array that has one member fewer than list, 
//and be composed of all of the same members except the member in the position pos.
//Method remove(list,target) deletes all the elements that are equal to target, returning a new list without all those new elements.

import java.util.Scanner;
public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
    System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }

  
  
  public static int[] randomInput(){
      int random[] = new int[10];
      int i = 0;
      for (i=0; i < 10; i++){
        double n = Math.random()*9;
          random[i] = (int) n;
      }
      return random;
      
  }//end of randominput method
  
  public static int[] delete(int[] list, int pos){
    int deleteArray[] = new int[list.length-1];
    int i = 0;
    for ( i = 0; i < pos; i++){
      deleteArray[i] = list[i];
    }
      for ( i = pos; i < list.length - 1; i++){
        deleteArray[i] = list[i+1];
      }
    
    return deleteArray;
  }//end of delete method
  
  public static int[] remove(int list[], int target){
    int n = list.length;
    int i = 0;
    int count  = 0;
    for (i = 0; i < n; i++){
      if (list[i] == target){
        count++;
      }
    }
    n-= count;
    int x = 0;
    i = 0;
    int remove[] = new int[n];
    x = 0;
    while (i < n){
      if (remove[i] == target){
        remove[i] = list[x+1];
        x++;
      }
      else {
        remove[i] = list[x];
      }
      x++;
      i++;
    }
    return remove;
  }// end of remove method
  
 
  public static String listArray(int num[]){
    String out="{";
	  for(int j=0;j<num.length;j++){
	    if(j>0){
    	  out+=", ";
  	  }
  	  out+=num[j];
	  }
	  out+="} ";
	  return out;
  }//end of listarray method
}//end of class
