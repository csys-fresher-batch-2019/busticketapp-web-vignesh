package busticket.buslist;
import java.util.Scanner;

import com.chainsys.busticketapp.dao.impl.BusTicketManagerImplimentation;
import com.chainsys.busticketapp.logger.Logger;
//TestBusTicket
public class TestAddBusList {
	//static Jdbi jdbi=ConnectionUtil.getJdbi();
	//static BusTicketDAO busticketDAO=jdbi.onDemand(BusTicketDAO.class);
	
	public static void main(String[] args) throws Exception{
		Logger logger=Logger.getInstance();
		Scanner sc = new Scanner(System.in);
		//logger.input("Enter the BusNo:");
		//int busNo = sc.nextInt();
		
		logger.input("Enter the Busname:");
		String busName = sc.next();
		
		logger.input("Enter the busSource:");
		String busSource = sc.next();
		
		logger.input("Enter the busDestination:");
		String busDestination = sc.next();
		
		logger.input("Enter the busClass:");
		String clazz =sc.next();
		
		//busticketDAO.addBuslist(busNo, busName, busSource, busDestination, clazz);
		BusTicketManagerImplimentation busimpl=new BusTicketManagerImplimentation();
		//Busimpl.addBuslist(1244,"abcd","kovai","madurai","sleeper");
		
		busimpl.addBuslist(busName,busSource,busDestination,clazz);
		
	}

}
