package br.com.cursojava;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.cursojava.Contato;
import br.com.cursojava.TipoContato;

public class RepositorioContatoMemoryTest {

	RepositorioContato repositorio;
	
	
	@Before
	public void antesDeCadaTeste() {
		repositorio = new RepositorioContatoMemory();
	}
	
	@After
	public void depoisDeCadaTest() {
		System.out.println("Terminou mais um teste");
	}
	
	@Test
	public void testAdicionar() {
		int id = 1;
		Assert.assertEquals(true, 
				repositorio.adicionar(new Contato(id, "William", 
						"william@gmail.com", "99999-9999", TipoContato.FAMILIA))
		);
		Assert.assertEquals(false, 
				repositorio.adicionar(new Contato(id, "William", 
						"william@gmail.com", "99999-9999", TipoContato.FAMILIA))
		);
	}
	
	@Test
	public void testBuscarPorId() {
		int id = 1;
		int outroId = 2;
		
		repositorio.adicionar(new Contato(id, "William", 
						"william@gmail.com", "99999-9999", TipoContato.FAMILIA));
		 
		repositorio.adicionar(new Contato(outroId, "Jonas", 
						"jonas@gmail.com", "98888-8888", TipoContato.AMIGO));
	
		Contato contato = repositorio.buscarPorId(id);
		Assert.assertNotEquals(null, contato);
		Assert.assertEquals("William", contato.getNome());
		Assert.assertEquals("william@gmail.com", contato.getEmail());
		Assert.assertEquals("99999-9999", contato.getTelefone());
		Assert.assertEquals(TipoContato.FAMILIA, contato.getTipo());
		
		contato = repositorio.buscarPorId(outroId);
		Assert.assertNotEquals(null, contato);
		Assert.assertEquals("Jonas", contato.getNome());
		Assert.assertEquals("jonas@gmail.com", contato.getEmail());
		Assert.assertEquals("98888-8888", contato.getTelefone());
		Assert.assertEquals(TipoContato.AMIGO, contato.getTipo());
		
	}
	
	@Test
	public void testBuscarTodos() {
		repositorio.adicionar(new Contato(1, "William", 
				"william@gmail.com", "99999-9999", TipoContato.FAMILIA));
 
		repositorio.adicionar(new Contato(2, "Jonas", 
				"jonas@gmail.com", "98888-8888", TipoContato.AMIGO));
		
		repositorio.adicionar(new Contato(3, "Jonas", 
				"jonas@gmail.com", "98888-8888", TipoContato.AMIGO));
		
		Assert.assertEquals(3, repositorio.buscarTodos().size());
	}

	@Test
	public void testRemover() {
		repositorio.adicionar(new Contato(1, "William", 
				"william@gmail.com", "99999-9999", TipoContato.FAMILIA));
 
		repositorio.adicionar(new Contato(2, "Jonas", 
				"jonas@gmail.com", "98888-8888", TipoContato.AMIGO));
	
		
		repositorio.remover(new Contato(2, "Jonas", 
				"jonas@gmail.com", "98888-8888", TipoContato.AMIGO));
		
		Assert.assertEquals(1, repositorio.buscarTodos().size());
	}
	
	@Test
	public void testEditar() {
		int id = 2;
		repositorio.adicionar(new Contato(1, "William", 
				"william@gmail.com", "99999-9999", TipoContato.FAMILIA));
		
		repositorio.adicionar(new Contato(id, "William", 
				"william@gmail.com", "99999-9999", TipoContato.FAMILIA));
		
		Assert.assertEquals(true, repositorio.editar(new Contato(id, "João", 
				"joao@gmail.com", "91111-1111", TipoContato.AMIGO)));
		
		Contato contato = repositorio.buscarPorId(id);
		Assert.assertNotEquals(null, contato);
		Assert.assertEquals("João", contato.getNome());
		Assert.assertEquals("joao@gmail.com", contato.getEmail());
		Assert.assertEquals("91111-1111", contato.getTelefone());
		Assert.assertEquals(TipoContato.AMIGO, contato.getTipo());
	}
	
	@Test
	public void testBuscarPorNome() {
		repositorio.adicionar(new Contato(1, "William", 
				"william@gmail.com", "99999-9999", TipoContato.FAMILIA));
		repositorio.adicionar(new Contato(2, "William", 
				"william@gmail.com", "99999-9999", TipoContato.FAMILIA));
		repositorio.adicionar(new Contato(3, "Joao", 
				"william@gmail.com", "99999-9999", TipoContato.FAMILIA));
		List<Contato> listaFiltradaPorNome = repositorio.buscarPorNome("William");
		
		Assert.assertEquals(2, listaFiltradaPorNome.size());
		Assert.assertEquals("William", listaFiltradaPorNome.get(0).getNome());
		Assert.assertEquals("William", listaFiltradaPorNome.get(1).getNome());
	}
	
	@Test
	public void testBuscarPorTelefone() {
		repositorio.adicionar(new Contato(1, "William", 
				"william@gmail.com", "99999-9999", TipoContato.FAMILIA));
		repositorio.adicionar(new Contato(2, "William", 
				"william@gmail.com", "99999-9999", TipoContato.FAMILIA));
		repositorio.adicionar(new Contato(3, "Joao", 
				"william@gmail.com", "99999-1111", TipoContato.FAMILIA));
		List<Contato> listaFiltradaPorTelefone = repositorio.buscarPorTelefone("99999-9999");
		
		Assert.assertEquals(2, listaFiltradaPorTelefone.size());
		Assert.assertEquals("99999-9999", listaFiltradaPorTelefone.get(0).getTelefone());
		Assert.assertEquals("99999-9999", listaFiltradaPorTelefone.get(1).getTelefone());
	}
	
	@Test
	public void testBuscarPorTipo() {
		repositorio.adicionar(new Contato(1, "William", 
				"william@gmail.com", "99999-9999", TipoContato.FAMILIA));
		repositorio.adicionar(new Contato(2, "William", 
				"william@gmail.com", "99999-9999", TipoContato.AMIGO));
		repositorio.adicionar(new Contato(3, "Joao", 
				"william@gmail.com", "99999-1111", TipoContato.FAMILIA));
		List<Contato> listaFiltradaPorTipo = repositorio.buscarPorTipo(TipoContato.FAMILIA);
		
		Assert.assertEquals(2, listaFiltradaPorTipo.size());
		Assert.assertEquals(TipoContato.FAMILIA, listaFiltradaPorTipo.get(0).getTipo());
		Assert.assertEquals(TipoContato.FAMILIA, listaFiltradaPorTipo.get(1).getTipo());
	}
}
