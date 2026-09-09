package Conditions;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner ys = new Scanner(System.in);
		int n = ys.nextInt();
		int num=0;
		while(n>0) {
			int last=n%10;
			num=(num*10)+last;
			n/=10;
		}
		System.out.print(num);
	}

}
