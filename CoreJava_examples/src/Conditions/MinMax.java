package Conditions;
import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		Scanner ys = new Scanner(System.in);
		int a=ys.nextInt();
		int b=ys.nextInt();
		int c=ys.nextInt();
		int small=Math.min(a, Math.min(b, c));
		int lar = Math.max(a,Math.max(b, c));
		System.out.println(small+" "+lar);
	}

}
