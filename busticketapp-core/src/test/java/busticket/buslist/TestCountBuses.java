package busticket.buslist;

import com.chainsys.busticketapp.dao.impl.BusTicketManagerImplimentation;

public class TestCountBuses {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BusTicketManagerImplimentation busimpl=new BusTicketManagerImplimentation();
		
		int count=busimpl.noOfBuses();
		System.out.println(count);
	

	}

}
