package arrayExamples;

import java.util.Scanner;
import java.util.Arrays;
public class SumArrayElements {
	public static void main(String[] args) {
		Scanner ys=new Scanner(System.in);
		int n=ys.nextInt();
		int s=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=ys.nextInt();
			s+=arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Sum Of Array Elements: "+s);
		ys.close();
	}

}
