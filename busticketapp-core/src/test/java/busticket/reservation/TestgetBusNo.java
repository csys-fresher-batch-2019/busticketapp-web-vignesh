package busticket.reservation;

import java.util.Scanner;

import com.chainsys.busticketapp.dao.impl.BookingDAOImplementation;
import com.chainsys.busticketapp.model.Booking;

public class TestgetBusNo {

	public static void main(String[] args)throws Exception {
		BookingDAOImplementation impl = new BookingDAOImplementation();
		Booking obj=new Booking();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ticketNo:");
        obj.setTicketNo(sc.nextInt());
		
		int busNo = impl.getBusNo(obj.getTicketNo());
		System.out.println(busNo);
	}

}
