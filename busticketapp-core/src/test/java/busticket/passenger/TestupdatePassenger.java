package busticket.passenger;

import java.util.Scanner;

import com.chainsys.busticketapp.dao.impl.PassengerImplementation;

public class TestupdatePassenger {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the update PassengerId:");
		int passengerId = sc.nextInt();
		System.out.println("Enter contact Number:");
		long passengerContact = sc.nextLong();
		PassengerImplementation pasimpl = new PassengerImplementation();
		pasimpl.updatePassengerlist(passengerContact, passengerId);
	}

}
