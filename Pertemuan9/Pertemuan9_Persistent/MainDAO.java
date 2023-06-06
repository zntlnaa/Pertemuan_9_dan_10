/**
 * File : MainDAO.java 31/05/2023
 * Nama : Zenit Laena Fathonah
 * NIM  : 24060121120006
 * Deskripsi : main program untuk akses DAO
**/

public class MainDAO{
	public static void main(String args[]){
		Person person = new Person("Indra");
		DAOManager m = new DAOManager();
		m.setPersonDAO(new MySQLPersonDAO());
		try{
			m.getPersonDAO().savePerson(person);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
//Lihat apakah terjadi penambahan record pada tabel?
// Ya, pada database pbo dengan tabel Person di MYSQL yang sebelumnya adalah empty set,
// terdapat penambahan record yaitu Indra dengan id 1