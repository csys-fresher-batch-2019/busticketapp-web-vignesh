package busticket.seatavailability;

import java.util.Scanner;

import com.chainsys.busticketapp.dao.impl.SeatAvailabilityimplementation;
import com.chainsys.busticketapp.model.SeatAvailability;

public class TestAvailableSeats {

	public static void main(String[] args) throws Exception {
		SeatAvailabilityimplementation impl = new SeatAvailabilityimplementation();
		SeatAvailability obj = new SeatAvailability();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the BusNo Tocheck Available Seats:");
		obj.setBusNo(sc.nextInt());
		
		int seats = impl.availableSeatDetails(obj.getBusNo());
		System.out.println(seats);
		}

	}


