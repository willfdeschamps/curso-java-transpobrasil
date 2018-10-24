package br.com.class029.day29;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.class030.day030.DatabaseUtils;

//De para
public class PersonDAO {

	public List<Person> selectAll(){
		List<Person> people = new ArrayList<>();
		try {
			ResultSet cursor = DatabaseUtils.executeSelect("select * from pessoas");
			while(cursor.next()) {
				people.add(loadPessoa(cursor));
			}
			cursor.close();
		} catch (SQLException e) {
			System.out.println("Não foi possível carregar a lista de pessoas.");
		} 
		
		return people;
	}
	
	public Person selectById(Integer id){
		Person person = null;
		if(id != null) {
			try {
				PreparedStatement command = DatabaseUtils.getConnection().prepareStatement("select * from pessoas where id = ?");
				command.setInt(1, id);
				ResultSet cursor = command.executeQuery();
				if(cursor.next()) {
					person = loadPessoa(cursor);
				}
				
				cursor.close();
				command.close();
			} catch (SQLException e) {
				System.out.println("Não foi possível carregar a lista de pessoas.");
			} 
		}
		return person;
	}
	
	public Person selectByName(String name){
		Person person = null;
		if(name != null) {
			try {
				PreparedStatement command = DatabaseUtils.getConnection().prepareStatement("select * from pessoas where nome = ?");
				command.setString(1, name);
				ResultSet cursor = command.executeQuery();
				if(cursor.next()) {
					person = loadPessoa(cursor);
				}
	
				command.close();
				cursor.close();
			} catch (SQLException e) {
				System.out.println("Não foi possível carregar a lista de pessoas.");
			} 
		}
		return person;
	}
	

	private Person loadPessoa(ResultSet resultSet) throws SQLException {
		Integer id = resultSet.getInt("id");
		String nome = resultSet.getString("nome");
		return new Person(id, nome);
	}
	
	public void insert(Person person) {
		if(person != null) {
			try {
				Connection connection = DatabaseUtils.getConnection();
				PreparedStatement command = connection.prepareStatement("insert into pessoas(nome) values (?)", Statement.RETURN_GENERATED_KEYS);
				command.setString(1, person.getNome());
				command.execute();
				ResultSet cursor = command.getGeneratedKeys();
				if(cursor.next()) {
				Integer id = cursor.getInt("id");
					person.setId(id);
				}
			} catch (SQLException e) {
				System.out.println("It was impossible to insert the person data!");
			}
		}
		
	}
	
	public void update(Person person) {
		if(person != null) {
			try {
				Connection connection = DatabaseUtils.getConnection();
				PreparedStatement command = connection.prepareStatement("update pessoas set nome = ? where id = ?");
				command.setString(1,person.getNome());
				command.setInt(2, person.getId());
				command.executeUpdate();
				command.close();
			} catch (SQLException e) {
				System.out.println("It wasn´t possible to update the person Data!");
			}
		}
	}
	
	public void delete(Integer id) {
		if(id != null) {
			try {
				PreparedStatement command = DatabaseUtils.getConnection().prepareStatement("delete from pessoas where id = ?");
				command.setInt(1, id);
				command.execute();
				command.close();
			} catch (SQLException e) {
				System.out.println("It wans´t possible to delete the person record");
			}
			
		}
	}
}
