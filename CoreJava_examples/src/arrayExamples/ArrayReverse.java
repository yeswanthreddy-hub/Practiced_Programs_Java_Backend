package arrayExamples;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]= {"Yash","Hi","369"};
		for(String s1 : s ) {
			System.out.print(s1+" ");
		}
		System.out.println();
		for(int i=s.length-1;i>=0;i--) {
			System.out.print(s[i]+" ");
		}
	}

}
