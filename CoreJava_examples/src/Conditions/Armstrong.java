package Conditions;
import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner ys = new Scanner(System.in);
		int n = ys.nextInt();
		int temp=n,sum=0,c=0;
		while(temp>0) {
			temp/=10;
			c++;
		}
		temp=n;
		while(temp>0) {
			int last=temp%10;
			sum=sum+((int)Math.pow(last, c));
			temp/=10;
		}
		if(sum==n) {
			System.out.print("Armstrong Number");
		}
		else {
			System.out.print("Not an Armstrong Number");
		}
		ys.close();
	}

}
