package arrayExamples;
import java.util.*;
public class SynchronizedTicketBookingCodeTantraProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ys=new Scanner(System.in);
		int bookingAvailable=ys.nextInt();
		int noOfPassengers=ys.nextInt();
		String[] name=new String[noOfPassengers];
		int[] seat=new int[noOfPassengers];
		for(int i=0;i<noOfPassengers;i++) {
			name[i]=ys.next();
			seat[i]=ys.nextInt();
		}
		for(int i=0;i<noOfPassengers;i++) {
			if(seat[i]<=bookingAvailable) {
				System.out.println(name[i]+" booked "+seat[i]);
				bookingAvailable-=seat[i];
			}
			else {
				System.out.println(name[i]+" failed");
			}
		}
		ys.close();
	}

}
