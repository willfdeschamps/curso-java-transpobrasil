package br.com.class029.day29;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.class030.day030.DatabaseUtils;

public class ContatoDAO implements RepositorioContato{

	@Override
	public List<Contato> selectAll() {
		List<Contato> contatos = new ArrayList<>();
		try {
			ResultSet cursor = DatabaseUtils.executeSelect("select * from contatos");
			while(cursor.next()) {
				contatos.add(loadContato(cursor));
			}
			cursor.close();
		} catch (SQLException e) {
			System.out.println("Não foi possível carregar a lista de pessoas.");
		} 
		
		return contatos;
	}

	private Contato loadContato(ResultSet resultSet) throws SQLException {
		Integer id = resultSet.getInt("id");
		String nome = resultSet.getString("nome");
		String email = resultSet.getString("email");
		String telefone = resultSet.getString("telefone");
		return new Contato(id, nome, email, telefone);
	}

	@Override
	public List<Contato> selectByName(String nome) {
		List<Contato> contatos = new ArrayList<>();
		if(nome != null) {
			try {
				PreparedStatement command = DatabaseUtils.getConnection().prepareStatement("select * from contatos where nome like ?");
				command.setString(1, "%" + nome + "%");
				ResultSet cursor = command.executeQuery();
				if(cursor.next()) {
					contatos.add(loadContato(cursor));
				}
	
				command.close();
				cursor.close();
			} catch (SQLException e) {
				System.out.println("Não foi possível carregar a lista de pessoas.");
			} 
		}
		return contatos;
	}

	@Override
	public Contato selectById(Integer id) {
		Contato contato = null;
		if(id != null) {
			try {
				PreparedStatement command = DatabaseUtils.getConnection().prepareStatement("select * from contatos where id = ?");
				command.setInt(1, id);
				ResultSet cursor = command.executeQuery();
				if(cursor.next()) {
					contato = loadContato(cursor);
				}
				
				cursor.close();
				command.close();
			} catch (SQLException e) {
				System.out.println("Não foi possível carregar a lista de pessoas.");
			} 
		}
		return contato;
	}

	@Override
	public Contato selectByFone(String telefone) {
		Contato contato = null;
		if(telefone != null) {
			try {
				PreparedStatement command = DatabaseUtils.getConnection().prepareStatement("select * from contatos where telefone = ?");
				command.setString(1, telefone);
				ResultSet cursor = command.executeQuery();
				if(cursor.next()) {
					contato = loadContato(cursor);
				}
				
				cursor.close();
				command.close();
			} catch (SQLException e) {
				System.out.println("Não foi possível carregar a lista de pessoas.");
			} 
		}
		return contato;
	}

	@Override
	public void insert(Contato contato) {
		if(contato != null) {
			try {
				Connection connection = DatabaseUtils.getConnection();
				PreparedStatement command = connection.prepareStatement("insert into pessoas(nome, email, telefone) values (?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
				command.setString(1, contato.getNome());
				command.setString(2, contato.getEmail());
				command.setString(3, contato.getTelefone());
				command.execute();
				ResultSet cursor = command.getGeneratedKeys();
				if(cursor.next()) {
				Integer id = cursor.getInt("id");
					contato.setId(id);
				}
			} catch (SQLException e) {
				System.out.println("It was impossible to insert the person data!");
			}
		}
		
	}

	@Override
	public void update(Contato contato) {
		if(contato != null) {
			try {
				Connection connection = DatabaseUtils.getConnection();
				PreparedStatement command = connection.prepareStatement("update pessoas set nome = ?, email = ?, telefone = ? where id = ?");
				command.setString(1,contato.getNome());
				command.setString(2,contato.getEmail());
				command.setString(3,contato.getTelefone());
				
				command.setInt(4, contato.getId());
				
				command.executeUpdate();
				command.close();
			} catch (SQLException e) {
				System.out.println("It wasn´t possible to update the person Data!");
			}
		}
	}

	@Override
	public void delete(Integer id) {
		if(id != null) {
			try {
				PreparedStatement command = DatabaseUtils.getConnection().prepareStatement("delete from contatos where id = ?");
				command.setInt(1, id);
				command.execute();
				command.close();
			} catch (SQLException e) {
				System.out.println("It wans´t possible to delete the person record");
			}
			
		}
		
	}

	@Override
	public int count() {
		int quantidade = 0;
		try {
			ResultSet cursor = DatabaseUtils.executeSelect("select count(*) quantidade from contatos");
			while(cursor.next()) {
				quantidade = cursor.getInt("quantidade");
			}
			cursor.close();
		} catch (SQLException e) {
			System.out.println("Não foi possível carregar a lista de pessoas.");
		} 
		
		return quantidade;
	}

}
