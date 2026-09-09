package Conditions;
import java.util.Scanner;
public class StringEx {

	public static void main(String[] args) {
		char a='z';
		char b2='a';
		String b=Character.toString(a);
		String b1=String.valueOf(b2);
		System.out.println(b);
		System.out.println(b1);
		System.out.print("Double values: ");
		Scanner ys=new Scanner(System.in);
		int x=(int)ys.nextFloat(),y=(int)ys.nextFloat();
		System.out.println(x+y);
		System.out.print("Enter Strings: ");
		int s1=Integer.parseInt(ys.next());
		int s2=Integer.valueOf(ys.next());
		System.out.println(s1*s2);
	}

}
