package busticket.testuserlogin;

import java.util.Scanner;

import com.chainsys.busticketapp.dao.impl.UserRegistrationDAOImplementation;
import com.chainsys.busticketapp.model.UserRegistration;

public class TestUserRegister {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		UserRegistrationDAOImplementation impl = new UserRegistrationDAOImplementation();
		UserRegistration obj = new UserRegistration();
		System.out.println("Ener user name:");
		obj.setUserName(sc.next());
		System.out.println("Enter the emailId:");
		obj.setEmailId(sc.next());
		System.out.println("Enter the password:");
		obj.setPassword(sc.next());
		System.out.println("Enter the mobileNumber:");
		obj.setContactNumber(sc.nextLong());
		System.out.println("Enter the UserId:");
		obj.setUserId(sc.nextInt());

		impl.newUserRegister(obj);

	}

}
