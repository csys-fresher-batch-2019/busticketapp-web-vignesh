package busticket.bustiming;

import java.util.Scanner;

import com.chainsys.busticketapp.dao.impl.BusTimingIplementation;

public class TestdeleteBusTiming {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the delete bus No:");
		int busNo=sc.nextInt();
		BusTimingIplementation timeimpl= new BusTimingIplementation();
		timeimpl.deleteBusTiming(busNo);

	}

}
