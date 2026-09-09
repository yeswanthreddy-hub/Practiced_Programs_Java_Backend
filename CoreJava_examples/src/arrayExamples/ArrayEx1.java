package arrayExamples;
public class ArrayEx1 {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		for(int i : a) {
			System.out.print(i+"-->");
		}
		System.out.print("null");
	}
}