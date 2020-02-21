package busticket;

import java.util.Scanner;

import com.chainsys.busticketapp.dao.impl.LoginDAOImplementation;

import busticket.testuserlogin.TestAdminLogin;
import busticket.testuserlogin.TestUserLogin;
import busticket.testuserlogin.TestUserRegister;

public class TestCall {
public static void main(String[] args) throws Exception {
	Scanner sc=new  Scanner(System.in);
	
	System.out.println("Chose Your Login:\n1.Admin Login:\n2.User Login:\n3.User Registration:");
	int test=sc.nextInt();
	LoginDAOImplementation obj=new LoginDAOImplementation();
	switch(test)
	{
	case 1:
		 TestAdminLogin.admin();
		 break;
	case 2:
		 TestUserLogin.user();
		 break;
	case 3:
		TestUserRegister.main(null);
		break;
	}
}
}
