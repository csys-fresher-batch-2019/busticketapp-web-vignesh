package busticket.reservation;

import java.util.ArrayList;

import com.chainsys.busticketapp.dao.impl.BookingDAOImplementation;
import com.chainsys.busticketapp.model.Booking;

public class TestBookingList {

	public static void main(String[] args) throws Exception {
		BookingDAOImplementation impl = new BookingDAOImplementation();
		ArrayList<Booking> list = new ArrayList<Booking>();
		list = impl.reserveDetails();
		for (Booking reserve : list) {
			System.out.println(reserve);
		}

	}

}
