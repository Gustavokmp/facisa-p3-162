package br.cesed.si.p3.ed.ListaEncadeadaTeste;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.cesed.si.p3.ed.ListaEncadeada.ListaEncadeada;

public class ListaEncadeadaTeste {
	ListaEncadeada lista = new ListaEncadeada();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		lista.esvaziarListaEncadeada();
	}

	@Test
	public void adicionarInicioTeste() {
		lista.adicionarInicio("Exemplo1");
		lista.adicionarInicio("Exemplo2");
		lista.adicionarInicio("Exemplo3");
		lista.adicionarInicio("Exemplo4");
		Assert.assertEquals(1, lista.posicaoAtualItem("Exemplo4"));
	}

	@Test
	public void AdicionarFimTeste() {
		lista.adicionarFim("Exemplo1");
		lista.adicionarFim("Exemplo2");
		lista.adicionarFim("Exemplo3");
		Assert.assertEquals(3, lista.posicaoAtualItem("Exemplo3"));
	}

	@Test
	public void adicionarPosicaoTeste() {
		lista.adicionarInicio("Exemplo1");
		lista.adicionarInicio("Exemplo2");
		lista.adicionarFim("Exemplo3");
		lista.adicionarFim("Exemplo4");
		lista.adicionarPosicao(3, "Exemplo5");
		Assert.assertEquals(3, lista.posicaoAtualItem("Exemplo5"));
	}

	@Test
	public void tamanhoTeste() {
		lista.adicionarInicio("Exemplo1");
		lista.adicionarInicio("Exemplo2");
		lista.adicionarFim("Exemplo3");
		lista.adicionarFim("Exemplo4");
		lista.adicionarPosicao(3, "Exemplo5");
		Assert.assertEquals(5, lista.getPos());
	}

	@Test
	public void removerIndiceTeste() {
		lista.adicionarInicio("Exemplo1");
		lista.adicionarInicio("Exemplo2");
		lista.adicionarFim("Exemplo3");
		lista.adicionarFim("Exemplo4");
		Assert.assertEquals("Exemplo1", lista.remover(2));
	}

	@Test
	public void removerValorTeste() {
		lista.adicionarInicio("Exemplo1");
		lista.adicionarInicio("Exemplo2");
		lista.adicionarFim("Exemplo3");
		lista.adicionarFim("Exemplo4");
		Assert.assertEquals("Exemplo1", lista.remover("Exemplo1"));
	}

	@Test
	public void elementoValorTeste() {
		lista.adicionarInicio("Exemplo1");
		lista.adicionarInicio("Exemplo2");
		lista.adicionarFim("Exemplo3");
		lista.adicionarFim("Exemplo4");
		Assert.assertEquals("Exemplo3", lista.elementoPosicao(3));
	}

	@Test
	public void concatenaTeste() {
		lista.adicionarInicio("Exemplo1");
		lista.adicionarInicio("Exemplo2");
		lista.adicionarFim("Exemplo3");
		lista.adicionarFim("Exemplo4");
		ListaEncadeada lista2 = new ListaEncadeada();
		lista2.adicionarFim("Exemplo5");
		lista2.adicionarFim("Exemplo6");
		lista2.adicionarFim("Exemplo7");
		lista2.adicionarFim("Exemplo8");
		lista.concatena(lista2);
		Assert.assertEquals("Exemplo6", lista.elementoPosicao(6));
	}

	@Test
	public void posDeElementoTeste() {
		lista.adicionarInicio("Exemplo1");
		lista.adicionarInicio("Exemplo2");
		lista.adicionarFim("Exemplo3");
		lista.adicionarFim("Exemplo4");
		Assert.assertEquals(3, lista.posicaoAtualItem("Exemplo3"));
	}

}
