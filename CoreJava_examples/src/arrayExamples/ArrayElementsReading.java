package arrayExamples;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElementsReading {

	public static void main(String[] args) {
		Scanner ys=new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n=ys.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=ys.nextInt();
		}
		System.out.print("[");
		for(int i=0;i<n-1;i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.print(arr[n-1]);
		System.out.print("]\n");
		
		System.out.print(Arrays.toString(arr));
		ys.close();
	}

}