package Conditions;
import java.util.Scanner;

public class SwitchCaseExamples {

	public static void main(String[] args) {
		Scanner ys = new Scanner(System.in);
		double a=ys.nextDouble(),b=ys.nextDouble();
		char op= ys.next().charAt(0);
		switch(op) {
			case '+':
				System.out.println(a+b);
				break;
			case '-':
				System.out.println(a-b);
				break;
			case '*':
				System.out.println(a*b);
				break;
			case '/':
				System.out.println(a/b);
				break;
			case '%':
				System.out.println(a%b);
				break;
			default:
				System.out.println("Inavalid option");
		}
	}
}
