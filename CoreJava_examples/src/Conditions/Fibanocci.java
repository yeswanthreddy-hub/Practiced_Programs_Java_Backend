package Conditions;
import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		int a=0,b=1;
		Scanner ys = new Scanner(System.in);
		int n = ys.nextInt(),sum=0;
		for(int i=0;i<=n;i++) {
			System.out.print(a+" ");
			sum=a+b;
			a=b;
			b=sum;
		}
	}

}
