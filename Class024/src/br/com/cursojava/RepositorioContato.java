package br.com.cursojava;

import java.util.List;

public interface RepositorioContato {
	public abstract boolean adicionar(Contato contato);
	public abstract boolean editar(Contato contato);
	public abstract List<Contato> buscarTodos();
	public abstract List<Contato> buscarPorNome(String nome);
	public abstract List<Contato> buscarPorTelefone(String telefone);
	public abstract List<Contato> buscarPorTipo(TipoContato tipo);
	public abstract Contato buscarPorId(Integer id);
	public abstract boolean remover(Contato contato);
}
