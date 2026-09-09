package arrayExamples;

public class ArrayEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,45,66,47,6,8,10,100};
		System.out.print("Even Numbers: ");
		for(int i:arr) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.print("\nOdd Numbers: ");
		for(int i:arr) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
	}

}
