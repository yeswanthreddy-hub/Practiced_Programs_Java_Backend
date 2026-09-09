package arrayExamples;

public class CommandLineArgumentsEx {

	public static void main(String[] args) {
		int sum=0;
		for(int i=0;i<args.length;i++) {
			System.out.print(args[i]+" ");
			sum=sum+Integer.parseInt(args[i]);	
		}
		System.out.println();
		System.out.println(sum);
		for(int i=args.length-1;i>=0;i--) {
			System.out.print(args[i]+" ");
		}
		System.out.println();
		System.out.print(sum/args.length);
		
	}

}
