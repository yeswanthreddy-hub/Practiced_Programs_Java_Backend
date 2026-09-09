package arrayExamples;
import java.util.Scanner;
import java.util.Arrays;
public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ys=new Scanner(System.in);
		System.out.print("Enter array1 size: ");
		int n=ys.nextInt();
		int[] a=new int[n];
		System.out.print("Enetr array2 size: ");
		int n2=ys.nextInt();
		int[] b=new int[n2];
		int[] c=new int[n+n2];
		for(int i=0;i<n;i++){
			a[i]=ys.nextInt();
			c[i]=a[i];
		}
		for(int i=0;i<n2;i++){
			b[i]=ys.nextInt();
			c[i+n]=b[i];
		}
		System.out.println(Arrays.toString(c));
		ys.close();
	}

}
