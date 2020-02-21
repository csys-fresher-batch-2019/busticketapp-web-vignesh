package busticket.testuserlogin;

import java.util.Scanner;

import com.chainsys.busticketapp.DBException;
import com.chainsys.busticketapp.ErrorMessages;
import com.chainsys.busticketapp.dao.impl.LoginDAOImplementation;
import com.chainsys.busticketapp.logger.Logger;
import com.chainsys.busticketapp.model.UserRegistration;

import busticket.buslist.TestCountBuses;
import busticket.buslist.TestNoOfBuslist;
import busticket.buslist.TestSearchbus;
import busticket.bustiming.TestlistBusTiming;
import busticket.passenger.TestAddPassenger;
import busticket.passenger.TestupdatePassenger;
import busticket.reservation.TestAddBooking;
import busticket.reservation.TestupdateNoOfTicket;
import busticket.seatavailability.TestAvailableSeats;
import busticket.seatavailability.TestSeatAvailableBus;

public class TestUserLogin {
	
	//static Jdbi jdbi=ConnectionUtil.getJdbi();
	//static BusTicketDAO busticketDAO=jdbi.onDemand(BusTicketDAO.class);
	
	public static void main(String[] args) throws Exception {
		user();
	}
	
	public static void user() throws Exception {
		Logger logger=Logger.getInstance();
		logger.input("Enter EmailId:");
		Scanner sc = new Scanner(System.in);
		String userName = sc.next();
		logger.input("Enter Password:");
		String pass = sc.next();
		LoginDAOImplementation com = new LoginDAOImplementation();
		UserRegistration user = com.user(userName, pass);
		if (user != null) {
			logger.input(">>>>LOGIN SUCESSFULL<<<<");
			// view bus details
			System.out.println(
					"1.No_Of_BusList:\n2.No_Of_Buses:\n3.Source And DestinationList:\n4.Available Seats:\n5:Add Passenger Details:\n6.Add ReservationList:\n7.Update PassengerDetails:\n8.Update No_Of_Ticket:\n9.ListBusTiming:\n10.Available seats Source and destination:");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.println("No_Of_BusList:");
				TestNoOfBuslist.main(null);
				break;
			case 2:
				TestCountBuses.main(null);
				break;
			case 3:
				TestSearchbus.main(null);
				break;
			case 4:
				TestAvailableSeats.main(null);
				break;
			case 5:
				TestAddPassenger.main(null);
				break;
			case 6:
				TestAddBooking.main(null);
				break;
			case 7:
				TestupdatePassenger.main(null);
				break;
			case 8:
				TestupdateNoOfTicket.main(null);
				break;
			case 9:
				TestlistBusTiming.main(null);
				break;
			case 10:
				TestSeatAvailableBus.main(null);
				break;
			default:
				System.out.println("Choose Correct Option:");

			}

		} else {
			//System.out.println("--------LOGIN FAILED---------");
			throw new DBException(ErrorMessages.USER_LOGIN_FAILED);
		}

	}

}
