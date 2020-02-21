package busticket.bustiming;

import java.util.ArrayList;
import java.util.List;

import com.chainsys.busticketapp.dao.impl.BusTimingIplementation;
import com.chainsys.busticketapp.model.BusTiming;


public class TestlistBusTiming {

	public static void main(String[] args) throws Exception {
		BusTimingIplementation impl= new BusTimingIplementation();
		List<BusTiming> list=new ArrayList<>();
		list=impl.bustimeDetails();
		for (BusTiming busdetail : list) {
			System.out.println(busdetail);
		}
	}

}
