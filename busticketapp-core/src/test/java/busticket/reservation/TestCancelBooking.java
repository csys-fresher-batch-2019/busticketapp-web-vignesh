package busticket.reservation;

import java.util.Scanner;

import com.chainsys.busticketapp.dao.impl.BookingDAOImplementation;

public class TestCancelBooking {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BookingDAOImplementation impl = new BookingDAOImplementation();
		System.out.println(" Delete ReservationList:\n Enter the TicketNo:");
		int ticketNo = sc.nextInt();
		impl.cancelReservationList(ticketNo);
	}

}
