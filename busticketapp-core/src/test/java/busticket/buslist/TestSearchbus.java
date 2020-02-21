package busticket.buslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.chainsys.busticketapp.dao.impl.BusTicketManagerImplimentation;
import com.chainsys.busticketapp.model.ListOfBuses;

public class TestSearchbus {

	public static void main(String[] args) throws Exception {
		BusTicketManagerImplimentation busimpl = new BusTicketManagerImplimentation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter source Name:");
		String source = sc.next();
		System.out.println("Enter Destination Name:");
		String destination = sc.next();
		List<ListOfBuses> sourceTest = new ArrayList<>();
		sourceTest = busimpl.sourceStationlist(source, destination);

		for (ListOfBuses p : sourceTest) {
			System.out.println(p.getBusNo() + "\t" + p.getBusSource() + "\t" + p.getBusDestination() + "\t"
					+ p.getBusName() + "\t" + p.getClazz()+"\t"+p.getAmount()+"\t"+p.getBusTiming()+"\t"+p.getSeatAvailability());

		}

	}

}
