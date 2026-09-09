package Conditions;
import java.util.Scanner;

public class PrimeRange {

	public static void main(String[] args) {
		Scanner ys = new Scanner(System.in);
		int s=ys.nextInt(),e=ys.nextInt();
		for(int i=s;i<=e;i++) {
			int c=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					c++;
				}
			}
			if(c==2) {
				System.out.print(i+" ");
			}
		}

	}

}
