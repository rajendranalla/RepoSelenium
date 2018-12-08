package DataBase;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import utilities.DbManager;

public class DataBaseConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {


		DbManager.setMysqlDbConnection();
		
		List<String> query = DbManager.getMysqlQuery("select FirstName from Customer where Age = '33 ' ");
		
		for (int i =0; i<query.size(); i++) {
			System.out.println("First name of customer is " +query.get(i));
		}
		
		

	}

}
