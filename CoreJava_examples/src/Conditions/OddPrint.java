package Conditions;
import java.util.Scanner;

public class OddPrint {
	public static void main(String[] args) {
		Scanner ys = new Scanner(System.in);
		System.out.println("Enter start and End numbers:");
		int start = ys.nextInt(), end=ys.nextInt();
		for(int i=start;i<=end;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		for(int j=start;j<=end;j++) {
				if(j%2==0) {
					System.out.print(j+" ");
				}
			}
		}
	}
