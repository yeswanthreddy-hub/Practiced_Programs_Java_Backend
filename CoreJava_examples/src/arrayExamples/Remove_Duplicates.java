package arrayExamples;
import java.util.Arrays;
import java.util.Scanner;
public class Remove_Duplicates {

	public static void main(String[] args) {
		Scanner ys=new Scanner(System.in);
		int n=ys.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=ys.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<n-1;i++) {
				if(a[i]!=a[i+1]) {
					System.out.print(a[i]+" ");				
				}
			}
		System.out.print(a[n-1]);
		ys.close();
	}

}
