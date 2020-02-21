package busticket.bustiming;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

import com.chainsys.busticketapp.dao.impl.BusTimingIplementation;
import com.chainsys.busticketapp.model.BusTiming;

public class TestaddTiming {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BusTimingIplementation timeimpl= new BusTimingIplementation();
		BusTiming obj = new BusTiming();
		System.out.println("Enter the BusNo:");
		obj.setBusNo(sc.nextInt());
		System.out.println("Enter the Bus Amount:");
		obj.setAmount(sc.nextInt());
		System.out.println("Enter DepartureTime:");
		//obj.departureTime = LocalDateTime.now();
		String departureTime=sc.next(); //2020-02-02T10:00
		obj.setDepartureTime(LocalTime.parse(departureTime));//20:00 new
		System.out.println("Enter ArraivalTime:");
		String arrivalTime=sc.next();//2020-02-02T20:00
		//obj.arrivalTime = LocalDateTime.now();
		obj.setArrivalTime(LocalTime.parse(arrivalTime));
		timeimpl.addBusTiming(obj);
		
		

	}

}
