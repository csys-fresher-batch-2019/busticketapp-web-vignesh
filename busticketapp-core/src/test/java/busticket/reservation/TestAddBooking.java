package busticket.reservation;

import java.time.LocalDateTime;
import java.util.Scanner;

import com.chainsys.busticketapp.dao.impl.BookingDAOImplementation;
import com.chainsys.busticketapp.logger.Logger;
import com.chainsys.busticketapp.model.Booking;

public class TestAddBooking {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BookingDAOImplementation impl = new BookingDAOImplementation();
		Booking obj = new Booking();
		Logger logger=Logger.getInstance();
		logger.input("Enter the BusNo:");
		obj.setBusNo(sc.nextInt());
		logger.input("Enter the PassengerId:");
		obj.setPassengerId(sc.nextInt());
		logger.input("Enter the No of Ticket:");
		obj.setNoOfTicket(sc.nextInt());
		logger.input("Enter journtDate:");
		String journeyDate=sc.next(); //2020-02-02T10:00
		obj.setJourneyDate(LocalDateTime.parse(journeyDate));
		logger.input("EnterUserId:");
		obj.setUserId(sc.nextInt());
		System.out.println(obj.getUserId());
		impl.addReservationList(obj);
	}

}
