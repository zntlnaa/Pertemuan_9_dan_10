
/**
 * File : DAOManager.java 31/05/2023
 * Nama : Zenit Laena Fathonah
 * NIM  : 24060121120006
 * Deskripsi : pengelola DAO dalam program
**/

public class DAOManager{
	private PersonDAO personDAO;

	public void setPersonDAO(PersonDAO person){
		personDAO = person;
	}

	public PersonDAO getPersonDAO(){
		return personDAO;
	}
}