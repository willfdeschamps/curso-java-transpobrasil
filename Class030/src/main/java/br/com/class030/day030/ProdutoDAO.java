package br.com.class030.day030;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO implements RepositorioProduto {

	private static final String SQL_INSERIR_PRODUTO = "insert into produtos( nome, preco) values (?, ?)";
	private static final String SQL_SELICIONAR_TODOS_PRODUTOS = "select * from produtos";
	private static final String SQL_SELECIONAR_PRODUTO_POR_ID = "select * from produtos where id = ?";
	private static final String SQL_SELECIONAR_PRODUTOS_ENTRE_PRECOS = "select * from produtos where preco between ? and ?";
	private static final String SQL_SELECIONAR_PRODUTOS_POR_NOME = "select * from produtos where upper(nome) like upper(?)";
	private static final String SQL_ATUALIZAR_PRODUTO = "update produtos set nome = ?, preco = ? where id = ?";
	private static final String SQL_REMOVER_PRODUTO = "delete from produtos where id = ?";
	private static final String SQL_CONTAR_PRODUTOS = "select count(*) quantidade from produtos";
	
	
	@Override
	public List<Produto> buscarTodos() {
		List<Produto> produtos = new ArrayList<>();
		try {
			ResultSet cursor = DatabaseUtils.executeSelect(SQL_SELICIONAR_TODOS_PRODUTOS);
			while (cursor.next()) {
				produtos.add(carregaProduto(cursor));
			}
			cursor.close();
		} catch (SQLException e) {
			System.out.println("Não foi possível carregar a lista de produtos.");
		}

		return produtos;
	}

	@Override
	public List<Produto> buscarPorNome(String nome) {
		List<Produto> produtos = new ArrayList<>();
		if (nome != null) {
			try {
				PreparedStatement comando = DatabaseUtils.getConnection()
						.prepareStatement(SQL_SELECIONAR_PRODUTOS_POR_NOME);
				comando.setString(1, "%" + nome + "%");
				produtos = retornaProdutosSql(comando);
				comando.close();
			} catch (SQLException e) {
				System.out.println("Não foi possível carregar a lista de produto.");
			}
		}
		return produtos;
	}

	@Override
	public List<Produto> buscarPorPreco(double precoMinimo, double precoMaximo) {
		List<Produto> produtos = new ArrayList<>();
		try {
			PreparedStatement comando = DatabaseUtils.getConnection().prepareStatement(SQL_SELECIONAR_PRODUTOS_ENTRE_PRECOS);
			comando.setDouble(1,  precoMinimo);
			comando.setDouble(2, precoMaximo);
			produtos = retornaProdutosSql(comando);
			comando.close();	
		} catch (SQLException e) {
			System.out.println("Não foi possível carregar a lista de produtos.");
		} 
		
		return produtos;
	}

	@Override
	public Produto buscarPorId(Integer id) {
		Produto produto = null;
		if(id != null) {
			try {
				PreparedStatement comando = DatabaseUtils.getConnection().prepareStatement(SQL_SELECIONAR_PRODUTO_POR_ID);
				comando.setInt(1, id);
				produto = retornaProdutoSql(comando);
				comando.close();
			} catch (SQLException e) {
				System.out.println("Não foi possível carregar o produto com id = " + id);
			} 
		}
		return produto;
	}

	@Override
	public void inserir(Produto produto) {
		if(produto != null) {
			try {
				PreparedStatement command = DatabaseUtils.getConnection().prepareStatement(SQL_INSERIR_PRODUTO, Statement.RETURN_GENERATED_KEYS);
				command.setString(1, produto.getNome());
				command.setDouble(2, produto.getPreco());
				command.execute();
				ResultSet cursor = command.getGeneratedKeys();
				if(cursor.next()) {
					Integer id = cursor.getInt("id");
					produto.setId(id);
				}
			} catch (SQLException e) {
				System.out.println("Não foi possível inserior o produto!");
			}
		}
	}

	@Override
	public void atualizar(Produto produto) {
		if(produto != null) {
			try {
				PreparedStatement command = DatabaseUtils.getConnection().prepareStatement(SQL_ATUALIZAR_PRODUTO);
				command.setString(1,produto.getNome());
				command.setDouble(2,produto.getPreco());
				command.setInt(3, produto.getId());
				command.executeUpdate();
				command.close();
			} catch (SQLException e) {
				System.out.println("Não foi possível atualizar o produto!");
			}
		}

	}

	@Override
	public void remover(Integer id) {
		if(id != null) {
			try {
				PreparedStatement command = DatabaseUtils.getConnection().prepareStatement(SQL_REMOVER_PRODUTO);
				command.setInt(1, id);
				command.execute();
				//id = null;
				command.close();
			} catch (SQLException e) {
				System.out.println("Não foi possível remover o produto de id = " + id);
			}
			
		}
	}

	@Override
	public int contar() {
		int quantidade = 0;
		try {
			ResultSet cursor = DatabaseUtils.executeSelect(SQL_CONTAR_PRODUTOS);
			while(cursor.next()) {
				quantidade = cursor.getInt("quantidade");
			}
			cursor.close();
		} catch (SQLException e) {
			System.out.println("Não foi possível contar os produtos");
		} 
		
		return quantidade;
	}
	
	private Produto carregaProduto(ResultSet cursor) throws SQLException {
		Integer id = cursor.getInt("id");
		String nome = cursor.getString("nome");
		double preco = cursor.getDouble("preco");
		return new Produto(id, nome, preco);
	}
	
	private List<Produto> retornaProdutosSql(PreparedStatement comando) throws SQLException {
		List<Produto> produtos = new ArrayList<>();
		if(comando != null && !comando.isClosed()) {
			ResultSet cursor = comando.executeQuery();
			while (cursor.next()) {
				produtos.add(carregaProduto(cursor));
			}
			cursor.close();
		}
		return produtos;
	}
	
	private Produto retornaProdutoSql(PreparedStatement comando) throws SQLException {
		Produto produto = null;
		if(comando != null && !comando.isClosed()) {
			ResultSet cursor = comando.executeQuery();
			while (cursor.next()) {
				produto = carregaProduto(cursor);
			}
			cursor.close();
		}
		return produto;
	}

}
