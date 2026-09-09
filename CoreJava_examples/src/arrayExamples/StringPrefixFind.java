package arrayExamples;
import java.util.*;
public class StringPrefixFind {

	public static void main(String[] args) {
		Scanner ys=new Scanner(System.in);
		int n=ys.nextInt();
		String[] st=new String[n];
		for(int i=0;i<n;i++) {
			st[i]=ys.nextLine();
		}
		String pre=st[0];
		for(int i=1;i<st.length;i++) {
			while(!st[i].startsWith(pre)) {
				pre=pre.substring(0,pre.length()-1);
			}
		}
		System.out.print(pre);
		ys.close();
	}

}
