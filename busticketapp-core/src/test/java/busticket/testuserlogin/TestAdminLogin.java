package busticket.testuserlogin;

import java.util.Scanner;

import com.chainsys.busticketapp.dao.impl.LoginDAOImplementation;

import busticket.buslist.TestAddBusList;
import busticket.buslist.TestdeleteBuslist;
import busticket.bustiming.TestaddTiming;
import busticket.bustiming.TestdeleteBusTiming;
import busticket.passenger.TestdeletePassenger;
import busticket.reservation.TestCancelBooking;
import busticket.reservation.TestBookingList;
import busticket.seatavailability.TestaddSeatAvailability;
import busticket.seatavailability.TestupdateAvailableSeats;

public class TestAdminLogin {

	public static void main(String[] args)throws Exception {
		admin();
	}
		public static void admin() throws Exception {

			System.out.println("Enter Admin_Name:");
			Scanner sc = new Scanner(System.in);
			String admin = sc.next();
			System.out.println("Enter Password:");
			String pass = sc.next();
			LoginDAOImplementation com = new LoginDAOImplementation();
			if (com.adminLogin(admin, pass)) {
				System.out.println(">>>>LOGIN SUCESSFULL<<<<");
				// view order details
				System.out.println(
						"1.Add BusList:\n2.2.Delete BusList:\n3.Delete PassengerList:\n4.Add BusTiming\n5.Delete BusTimimng\n6.Delete Reservationlist\n7.All ReservationList\n8.Add Seat Availability\n9.Update Seat Availability");
				int n = sc.nextInt();
				switch (n) {
				case 1:
					TestAddBusList.main(null);
					break;
				case 2:
					TestdeleteBuslist.main(null);
					break;
				case 3:
					TestdeletePassenger.main(null);
					break;
				case 4:
					TestaddTiming.main(null);
					break;
				case 5:
					TestdeleteBusTiming.main(null);
					break;
				case 6:
					TestCancelBooking.main(null);
					break;
				case 7:
					TestBookingList.main(null);
					break;
				case 8:
					TestaddSeatAvailability.main(null);
					break;
				case 9:
					TestupdateAvailableSeats.main(null);
					break;
				default:
					System.out.println("Choose Correct Option:");
				}
			} else {
				System.out.println(">>>>LOGIN FAILED<<<<");
			}

		}
	}

