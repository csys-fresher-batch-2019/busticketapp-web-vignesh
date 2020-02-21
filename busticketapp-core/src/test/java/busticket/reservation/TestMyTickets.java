package busticket.reservation;

import java.util.ArrayList;
import java.util.Scanner;

import com.chainsys.busticketapp.dao.impl.BookingDAOImplementation;
import com.chainsys.busticketapp.model.Booking;

public class TestMyTickets {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the UserId:");
		BookingDAOImplementation impl = new BookingDAOImplementation();
		int userId=sc.nextInt();
		ArrayList<Booking> list = new ArrayList<>();
		list = impl.listMyTickets(userId);
		for (Booking myticket : list) {
			System.out.println(myticket);
		}

	}

}
