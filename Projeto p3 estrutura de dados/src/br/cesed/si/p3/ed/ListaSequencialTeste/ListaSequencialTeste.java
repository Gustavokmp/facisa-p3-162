package br.cesed.si.p3.ed.ListaSequencialTeste;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.cesed.si.p3.ed.ListaSequencial.ListaSequencial;

public class ListaSequencialTeste {

	ListaSequencial lista = new ListaSequencial();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		lista.vazio();
	}

	@Test
	public void adicionarInicioTeste() {
		lista.adicionarInicio("Exemplo");
		lista.adicionarInicio("Exemplo2");
		lista.adicionarInicio("Exemplo3");
		lista.adicionarInicio("Carinha do ma4");
		lista.adicionarInicio("Exemplo5");
		Assert.assertEquals(5, lista.tamanho());
	}

	@Test
	public void adicionarFimTeste() {
		lista.adicionarFim("Exemplo");
		lista.adicionarFim("Exemplo2");
		lista.adicionarFim("Exemplo3");
		lista.adicionarFim("Exemplo4");
		Assert.assertEquals(4, lista.tamanho());
	}

	@Test
	public void excluirElementoPosicaoTeste() {
		lista.adicionarFim("Exemplo2");
		lista.adicionarFim("Exemplo");
		lista.adicionarInicio("Exemplo182");
		lista.remove(2);
		Assert.assertEquals(2, lista.tamanho());
	}

	@Test
	public void elementoPosicaoTeste() {
		lista.adicionarFim("Exemplo2");
		lista.adicionarInicio("Exemplo1");
		lista.adicionarFim("Exemplo3");
		lista.adicionarInicio("Exemplo4");
		Assert.assertEquals("Exemplo4", lista.elementoPosicao(1));
	}

	@Test
	public void posElementoTeste() {
		lista.adicionarFim("Exemplo");
		lista.adicionarFim("Exemplo2");
		lista.adicionarFim("Exemplo3");
		lista.adicionarFim("Exemplo4");
		Assert.assertEquals(2, lista.posElemento("Exemplo2"));
	}

	@Test
	public void adicionarPelaPosicaoTeste() {
		lista.adicionarInicio("Exemplo");
		lista.adicionarInicio("Exemplo2");
		lista.adicionarInicio("Exemplo3");
		lista.adicionarPelaPosicao("aprendendo", 2);
		Assert.assertEquals("aprendendo", lista.elementoPosicao(2));
	}

	@Test
	public void concatenaListaTeste() {

		lista.adicionarFim("Exemplo");
		lista.adicionarFim("Exemplo2");
		lista.adicionarFim("Exemplo3");
		lista.adicionarFim("Exemplo4");
		ListaSequencial lista2 = new ListaSequencial();
		lista2.adicionarInicio("Exemplo5");
		lista2.adicionarInicio("Exemplo6");
		lista2.adicionarInicio("Exemplo7");
		lista.concatenaLista(lista2);
		Assert.assertEquals(7, lista.tamanho());
	}

	@Test
	public void excluirElementoPeloValorTeste() {
		lista.adicionarFim("Exemplo");
		lista.adicionarFim("Exemplo2");
		lista.adicionarFim("Exemplo3");
		lista.adicionarFim("Exemplo4");
		lista.remover("Exemplo2");
		Assert.assertEquals(lista.elementoPosicao(2), "Exemplo3");
	}

	@Test
	public void tamanhoTeste() {
		lista.adicionarFim("Exemplo7");
		lista.adicionarFim("Exemplo1");
		lista.adicionarFim("Exemplo2");
		lista.adicionarFim("Exemplo3");
		lista.adicionarFim("Exemplo4");
		lista.adicionarFim("Exemplo5");
		lista.adicionarFim("Exemplo6");
		Assert.assertEquals(7, lista.tamanho());

	}

}
