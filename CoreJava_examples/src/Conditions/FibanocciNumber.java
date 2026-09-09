package Conditions;
import java.util.Scanner;

public class FibanocciNumber {

	public static void main(String[] args) {
		int a=0,b=1;
		Scanner ys = new Scanner(System.in);
		int n = ys.nextInt(),sum=0;
		for(int i=0;i<n-1;i++) {
			sum=a+b;
			a=b;
			b=sum;
		}
		System.out.print(a+" ");

	}

}
