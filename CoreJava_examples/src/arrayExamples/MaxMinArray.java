package arrayExamples;

import java.util.Scanner;

public class MaxMinArray {

	public static void main(String[] args) {
		Scanner ys=new Scanner(System.in);
		System.out.print("Enter size of Array: ");
		int n=ys.nextInt();
		int[] arr=new int[n];
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			arr[i]=ys.nextInt();
			max=Math.max(arr[i], max);
			min=Math.min(arr[i], min);
		}
		System.out.println("Max= "+max+"\nMin= "+min);
		ys.close();
	}

}
