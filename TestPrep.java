import java.util.Scanner;
public class TestPrep {
	public static void main(String[] args) {
		int num = 9;
		int nSpaces = 0;
		while (num > 0){
			nSpaces = 0;
			while (nSpaces < num){
				System.out.print(" ");
				nSpaces++;
			}
			System.out.print(num);
			System.out.println("");
			num--;
		}
	}
} //end of class