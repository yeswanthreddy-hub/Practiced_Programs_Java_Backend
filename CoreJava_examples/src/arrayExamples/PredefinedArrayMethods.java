package arrayExamples;
import java.util.Arrays;
public class PredefinedArrayMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1=new int[5];
		System.out.println(Arrays.toString(arr1));
		Arrays.fill(arr1, 369);
		System.out.println(Arrays.toString(arr1));
		int[] arr2= {1,2,1,4,5,6};
		int[] arr3=Arrays.copyOf(arr2, 4);
		System.out.println(Arrays.toString(arr3));
	}

}
