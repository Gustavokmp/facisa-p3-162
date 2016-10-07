package br.cesed.si.p3.ed.DequeSequencialTeste;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.cesed.si.p3.ed.DequeSequencial.DequeSequencial;

public class DequeSequencialTeste {

	DequeSequencial deque = new DequeSequencial();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		deque.esvaziar();
	}

	@Test
	public void adicionarInicioTeste() {
		deque.adicionarInicio("Exemplo1");
		deque.adicionarInicio("Exemplo2");
		deque.adicionarInicio("Exemplo3");
		Assert.assertEquals("Exemplo3", deque.verPrimeiroElemento());
	}

	@Test
	public void adicionarFimTeste() {
		deque.adicionarFim("Exemplo1");
		deque.adicionarFim("Exemplo2");
		deque.adicionarFim("Exemplo3");
		Assert.assertEquals("Exemplo3", deque.verUltimoElemento());
	}

	@Test
	public void adicionarVariadoTeste() {
		deque.adicionarInicio("Exemplo1");
		deque.adicionarFim("Exemplo2");
		deque.adicionarFim("Exemplo3");
		deque.adicionarInicio("Exemplo4");
		Assert.assertEquals("Exemplo3", deque.verUltimoElemento());
		Assert.assertEquals("Exemplo4", deque.verPrimeiroElemento());
	}

	@Test
	public void removerInicioTeste() {
		deque.adicionarInicio("Exemplo1");
		deque.adicionarFim("Exemplo2");
		deque.adicionarFim("Exemplo3");
		deque.adicionarInicio("Exemplo4");
		Assert.assertEquals("Exemplo4", deque.removerInicio());
	}

	@Test
	public void removerFimTeste() {
		deque.adicionarInicio("Exemplo1");
		deque.adicionarFim("Exemplo2");
		deque.adicionarFim("Exemplo3");
		deque.adicionarInicio("Exemplo4");
		Assert.assertEquals("Exemplo3", deque.removerFim());
	}

	@Test
	public void tamanhoTeste() {
		deque.adicionarInicio("Exemplo1");
		deque.adicionarFim("Exemplo2");
		deque.adicionarFim("Exemplo3");
		deque.adicionarInicio("Exemplo4");
		Assert.assertEquals(4, deque.size());
	}

	@Test
	public void concatenaDoisDequesTeste() {
		deque.adicionarInicio("Exemplo1");
		deque.adicionarFim("Exemplo2");
		deque.adicionarFim("Exemplo3");
		deque.adicionarInicio("Exemplo4");
		DequeSequencial deque2 = new DequeSequencial();
		deque2.adicionarFim("Exemplo5");
		deque2.adicionarFim("Exemplo6");
		deque2.adicionarFim("Exemplo7");
		deque.concatenaDeque(deque2);
		Assert.assertEquals("Exemplo7", deque.verUltimoElemento());
	}

}
