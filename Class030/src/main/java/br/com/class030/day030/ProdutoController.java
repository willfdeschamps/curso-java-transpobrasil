package br.com.class030.day030;


import java.util.List;


public class ProdutoController {


	public static final int ID_PRODUTO_INVALIDO = 0;
	public static final int OPERACAO_SUCESSO = 1;
	public static final int OPERACAO_FRACASSO = -1;
	
	private ProdutoDAO repositorio = new ProdutoDAO();
	
	public int adicionar(String nome, double preco){
			Produto produto = new Produto(null, nome, preco);
			repositorio.inserir(produto);
			int resultadoOperacao = produto.getId() != null ? OPERACAO_SUCESSO : OPERACAO_FRACASSO;
			return resultadoOperacao;
	}
	
	public Produto getContato(int id){
		Produto produto = repositorio.buscarPorId(id);
		return produto;
	}
	
	public List<Produto> filtrarPorNome(String nome){
		List<Produto> produtosFiltradosPorNome = repositorio.buscarPorNome(nome);
		
		return produtosFiltradosPorNome;
	}
	
	public List<Produto> filtrarPorPreco(double precoMinimo, double precoMaximo){
		List<Produto> produtosFiltradosPorPreco = repositorio.buscarPorPreco(precoMinimo, precoMaximo);
		return produtosFiltradosPorPreco;
	}
	
	public List<Produto> buscarTodos(){
		return repositorio.buscarTodos();
	}
	
	public int remover(Integer id) {
		int resultado = OPERACAO_FRACASSO;
		if(id != null && id > 0) {	
			if(repositorio.buscarPorId(id) != null) {
				repositorio.remover(id);
				if(repositorio.buscarPorId(id) == null) {
					resultado = OPERACAO_SUCESSO;
				}
			} else {
				resultado = ID_PRODUTO_INVALIDO;
			}
		}
		
		return resultado;
	}
	
	public int editar(Integer id, String nome, double preco) {
		int resultado = OPERACAO_FRACASSO;
		if(id != null && id > 0) {
			if(repositorio.buscarPorId(id) != null) {
				Produto produtoAtualizado = new Produto(id,  nome,  preco);
				repositorio.atualizar(produtoAtualizado);
				Produto produtoBanco = repositorio.buscarPorId(id);
				if(produtoAtualizado.getNome().equals(produtoBanco.getNome()) &&
				   produtoAtualizado.getPreco() == produtoBanco.getPreco()) {
					resultado = OPERACAO_SUCESSO;
				}
			} else {
				resultado = ID_PRODUTO_INVALIDO;
			}
		}
		return resultado;
	}

	public void inicializarController() {
		repositorio.criarTabelaProdutos();
	}
}
