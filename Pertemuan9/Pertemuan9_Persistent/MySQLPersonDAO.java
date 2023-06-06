
/**
 * File : MySQLPersonDAO.java 31/05/2023
 * Nama : Zenit Laena Fathonah
 * NIM  : 24060121120006
 * Deskripsi : implementasi PersonDAO untuk MYSQL
**/

import java.sql.*;
public class MySQLPersonDAO implements PersonDAO{
	public void savePerson(Person person) throws Exception{
		String name = person.getName();
		//membuat koneksi, nama db, user, password menyesuaikan
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost/PBO","root","Sewotbae9");
		//kerjakan mysql query
		String query = "INSERT INTO person(name) VALUES (?)";
		PreparedStatement statement = con.prepareStatement(query);
		statement.setString(1, name);
		System.out.println(query);
		statement.executeUpdate();
		//tutup koneksi database
		statement.close();
		con.close();
	}
}