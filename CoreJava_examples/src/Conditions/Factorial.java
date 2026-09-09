package Conditions;
import java.util.Scanner;

public class Factorial{
public static int fact(int num) {
	int fac=1;
	for(int i=num;i>=1;i--) {
		fac=fac*i;
	}
	return fac;
}
	public static void main(String[] args) {
		Scanner ys = new Scanner(System.in);
		int n=ys.nextInt();
		System.out.println(fact(n));
	}

}
