package busticket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.chainsys.busticketapp.DBException;
import com.chainsys.busticketapp.ErrorMessages;

public class UserAcc {
	public static void main(String[] args) throws Exception {
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter your id : ");
		int pasId = obj.nextInt();
		boolean result = login(pasId);
		if (result) {

			System.out.println("Login Succesfully ");
		}
		else {

			System.out.println("Login failed ");
		}
		
	}

	public static boolean login(int password) throws Exception {

		boolean result = false;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		try(Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "oracle");){
		System.out.println(connection);
		try(Statement stmt = connection.createStatement();){

		String sql = "select pas_id from passenger where pas_id =" + password;
		try(ResultSet rs = stmt.executeQuery(sql);){
		if (rs.next()){
			result = true;
		} else {
			result = false;
		}
		return result;
	}
		catch(SQLException e) {
			throw new Exception("Unable to execute query");
		}
}
		catch(SQLException e) {
			throw new Exception("Unable to execute login query");
			}
		}
		catch (Exception e) {
			throw new DBException(ErrorMessages.CONNECTION_FAILURE);
		}
	}
}