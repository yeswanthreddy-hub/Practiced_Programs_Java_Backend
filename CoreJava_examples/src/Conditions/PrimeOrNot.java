package Conditions;
import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner ys = new Scanner(System.in);
		int n = ys.nextInt(),c=0;
		for(int i=0;i<=n;i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==2) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
	}

}
