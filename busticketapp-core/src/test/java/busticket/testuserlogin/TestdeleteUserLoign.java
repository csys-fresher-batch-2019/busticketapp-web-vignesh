package busticket.testuserlogin;

import java.util.Scanner;

import com.chainsys.busticketapp.dao.impl.UserRegistrationDAOImplementation;

public class TestdeleteUserLoign {

	public static void main(String[] args) throws Exception {
		UserRegistrationDAOImplementation impl = new UserRegistrationDAOImplementation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter delete UserID:");
		int userId = sc.nextInt();
		impl.removeUser(userId);

	}

}
