package arrayExamples;

import java.util.Scanner;
import java.util.Arrays;
public class RotationsArray {

	public static void main(String[] args) {
		Scanner ys=new Scanner(System.in);
		System.out.print("Size: ");
		int n=ys.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=ys.nextInt();
		}
		System.out.print("K Positions Value: ");
		int k=ys.nextInt();
		int[] res=new int[n];
		for(int i=0;i<n;i++) {
			res[i]=a[(i+k)%n];
		}
		System.out.println("Result Arrays: ");
		System.out.print(Arrays.toString(res));
		ys.close();
	}

}
