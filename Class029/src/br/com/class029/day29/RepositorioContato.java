package br.com.class029.day29;

import java.util.List;

public interface RepositorioContato {
	public abstract List<Contato> selectAll();
	public abstract List<Contato> selectByName(String nome);
	public abstract Contato selectById(Integer id);
	public abstract Contato selectByFone(String telefone);
	public void insert(Contato contato);
	public void update(Contato contato);
	public void delete(Integer id);
	public int count();
}
