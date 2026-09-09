package Conditions;
import java.util.Scanner;

public class PrimePrintRange {
	public static boolean prime(int num) {
		int c=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				c++;
			}
		}
		if(c==2) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner ys = new Scanner(System.in);
		int start=ys.nextInt();
		int end = ys.nextInt();
		for(int j=start;j<=end;j++) {
			if(prime(j)) {
				System.out.print(j + " ");
			}
		}
		
	}
}
