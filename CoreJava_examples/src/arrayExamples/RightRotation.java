package arrayExamples;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotation {

	public static void main(String[] args) {
		Scanner ys=new Scanner(System.in);
		System.out.print("Size: ");
		int n=ys.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=ys.nextInt();
		}
		System.out.print("K value of Right Rotations Position: ");
		int k=ys.nextInt();
		int res[]=new int[n];
		for(int i=0;i<n;i++) {
			res[(i+k)%n]=a[i];
		}
		System.out.print("Result Arrays: "+Arrays.toString(res));
		ys.close();
	}

}
