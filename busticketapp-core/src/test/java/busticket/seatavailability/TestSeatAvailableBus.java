package busticket.seatavailability;

import java.util.ArrayList;
import java.util.Scanner;

import com.chainsys.busticketapp.dao.impl.SeatAvailabilityimplementation;
import com.chainsys.busticketapp.model.SeatAvailability;

public class TestSeatAvailableBus {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		SeatAvailabilityimplementation impl = new SeatAvailabilityimplementation();
		ArrayList<SeatAvailability> list = new ArrayList<>();
		System.out.println("Enter source:");
		String source = sc.next();
		System.out.println("Enter destination");
		String destination = sc.next();
		list=impl.availablebusseats(source, destination);
		for (SeatAvailability seats : list) {
			System.out.println(seats);
		}
	}
}