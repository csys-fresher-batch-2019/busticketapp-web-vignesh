package busticket.seatavailability;

import java.util.Scanner;

import com.chainsys.busticketapp.dao.impl.SeatAvailabilityimplementation;

public class TestdeleteAvailableSeats {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		SeatAvailabilityimplementation impl = new SeatAvailabilityimplementation();
		System.out.println("Enter the delete bus NO:");
		int busNo = sc.nextInt();
		impl.deleteAvailableSeatlist(busNo);

	}

}
