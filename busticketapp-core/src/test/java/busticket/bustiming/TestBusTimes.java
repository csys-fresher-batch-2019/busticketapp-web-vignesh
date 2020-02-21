package busticket.bustiming;

import java.util.Scanner;

import com.chainsys.busticketapp.dao.impl.BusTimingIplementation;
import com.chainsys.busticketapp.model.BusTiming;

public class TestBusTimes {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter bus No:");
		int busNo=sc.nextInt();
		BusTimingIplementation timeimpl= new BusTimingIplementation();
		BusTiming bustimes = timeimpl.bustimes(busNo);
		System.out.println(bustimes);
	
	}

}
