/**
 * File : ReadSerializePerson.java 31/05/2023
 * Nama/NIM : Zenit Laena Fathonah/24060121120006
 * Deskripsi : program untuk serialisasi objek person
**/
import java.io.*;

public class ReadSerializePerson{
	public static void main(String[] args){
		Person person = null;
		try{
			FileInputStream f = new FileInputStream("person.ser");
			ObjectInputStream s = new ObjectInputStream(f);
			person = (Person)s.readObject();
			s.close();
			System.out.println("serialize person name = "+person.getName());
		}catch(Exception ioe){
			ioe.printStackTrace();
		}
	}
}