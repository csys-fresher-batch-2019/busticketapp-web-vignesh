package busticket.reservation;

import java.util.Scanner;

import com.chainsys.busticketapp.dao.impl.BookingDAOImplementation;
import com.chainsys.busticketapp.model.Booking;

public class TestupdateNoOfTicket {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BookingDAOImplementation impl = new BookingDAOImplementation();
		Booking obj = new Booking();
		System.out.println("Update Ticket Reservation");
		System.out.println("Enter the Ticket No:");
		obj.setTicketNo(sc.nextInt());
		System.out.println("Enter PassengerId:");
		obj.setPassengerId(sc.nextInt());
		System.out.println("Enter NoOfTicket to cancel:");
		obj.setNoOfTicket(sc.nextInt());
		impl.updateNoOfTicket(obj.getTicketNo(), obj.getPassengerId(), obj.getNoOfTicket());
	}

}

