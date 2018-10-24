package br.com.class029.day29;

import java.util.List;

public class PersonDAOTest {

	public static void main(String[] args) {
		PersonDAO dao = new PersonDAO();
		List<Person> listPeople = dao.selectAll();
		for (Person person : listPeople) {
			System.out.println(person);
		}
		
		System.out.println(dao.selectById(1));
		
		dao.insert(new Person(null,"William4"));
	
		listPeople = dao.selectAll();
		for (Person person : listPeople) {
			System.out.println(person);
		}
		
		dao.update(new Person(7,"William"));
	
		dao.delete(7);
		listPeople = dao.selectAll();
		for (Person person : listPeople) {
			System.out.println(person);
		}
	}

}
