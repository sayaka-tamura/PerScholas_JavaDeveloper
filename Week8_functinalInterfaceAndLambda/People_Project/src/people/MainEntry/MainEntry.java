package people.MainEntry;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import people.dao.PeopleDAO;
import people.model.People;

public class MainEntry {
	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
		MainEntry mainObj = new MainEntry();
		
		People people = null;
		PeopleDAO peopleDAO= new PeopleDAO();
		List<People> ppl = new ArrayList<>();
		
		// get people by ID
//		people = peopleDAO.getPeopleByID(10);
//		
//		System.out.println(people.getPEOPLE_ID());
//		System.out.println(people.getFIRST_NAME());
//		System.out.println(people.getLAST_NAME());
		
		// get people by city, country or lastname
//		ppl = peopleDAO.getPeopleByV2("Camden");
//		
//		for (People person : ppl) {
//			System.out.print(person.getPEOPLE_ID() + " ");
//			System.out.print(person.getFIRST_NAME() + " ");
//			System.out.print(person.getLAST_NAME() + " ");
//			System.out.println();
//		}
			
		// Sava People
//		people = new People();
//		people.setFIRST_NAME("Sayaka");
//		people.setLAST_NAME("Tamura");
//		people.setCOMPANY_NAME("PerScholas");
//		people.setADDRESS("Broadway 930 NewYork");
//		people.setCITY("New York");
//		people.setCOUNTRY("New York");
//		people.setPEOPLE_STATE("NY");
//		people.setZIP((float) 10001);
//		people.setPHONE("917-333-6666");
//		people.setEMAIL("sayaka@gmail.com");
//		
//		int id = peopleDAO.savePeople(people);
//		
//		System.out.println(id);
//		System.out.println(people.getFIRST_NAME());
//		System.out.println(people.getLAST_NAME());
		
		
	}
}
