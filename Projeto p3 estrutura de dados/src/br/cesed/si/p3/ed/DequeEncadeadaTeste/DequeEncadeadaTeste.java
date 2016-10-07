package br.cesed.si.p3.ed.DequeEncadeadaTeste;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.cesed.si.p3.ed.DequeEncadeada.DequeEncadeada;

public class DequeEncadeadaTeste {
	DequeEncadeada deque = new DequeEncadeada();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		deque.estaviaDeque();
	}

	@Test
	public void dequeEstaVazioTeste() {
		deque.adicionarFim("Exemplo");
		Assert.assertEquals(false, deque.isVazia());
	}
	@Test
	public void pegaElementoInicialTeste(){
		deque.adicionarFim("Exemplo1");
		deque.adicionarFim("Exemplo2");
		deque.adicionarFim("Exemplo3");
		deque.adicionarInicio("Exemplo4");
		Assert.assertEquals("Exemplo4", deque.getElementoInicial());
	}
	@Test
	public void pegaElementoFinalTeste(){
		deque.adicionarFim("Exemplo1");
		deque.adicionarFim("Exemplo2");
		deque.adicionarFim("Exemplo3");
		Assert.assertEquals("Exemplo3", deque.getElementoFinal());
	}
	@Test
	public void adicionarInicioTeste(){
		deque.adicionarInicio("Exemplo1");
		deque.adicionarInicio("Exemplo2");
		deque.adicionarInicio("Exemplo3");
		deque.adicionarInicio("Exemplo4");
		deque.adicionarInicio("Exemplo5");
		Assert.assertEquals("Exemplo5", deque.getElementoInicial());
	}
	@Test
	public void adicionarFimTeste(){
		deque.adicionarFim("Exemplo1");
		deque.adicionarFim("Exemplo2");
		deque.adicionarFim("Exemplo3");
		deque.adicionarFim("Exemplo4");
		deque.adicionarFim("Exemplo5");
		Assert.assertEquals("Exemplo5", deque.getElementoFinal());
	}
	@Test
	public void removerInicioTeste(){
		deque.adicionarInicio("Exemplo1");
		deque.adicionarInicio("Exemplo2");
		deque.adicionarInicio("Exemplo3");
		deque.adicionarInicio("Exemplo4");
		deque.adicionarInicio("Exemplo5");
		Assert.assertEquals("Exemplo5", deque.removerInicio());
	}
	@Test
	public void removerFimTeste(){
		deque.adicionarFim("Exemplo1");
		deque.adicionarFim("Exemplo2");
		deque.adicionarFim("Exemplo3");
		deque.adicionarFim("Exemplo4");
		deque.adicionarFim("Exemplo5");
		Assert.assertEquals("Exemplo5", deque.removerFim());
	}
	@Test
	public void concatenaTeste(){
		DequeEncadeada deque2 = new DequeEncadeada();
		deque.adicionarInicio("Exemplo1");
		deque.adicionarInicio("Exemplo2");
		deque.adicionarInicio("Exemplo3");
		deque.adicionarInicio("Exemplo4");
		deque.adicionarInicio("Exemplo5");
		deque2.adicionarFim("Exemplo6");
		deque2.adicionarFim("Exemplo7");
		deque2.adicionarFim("Exemplo8");
		deque2.adicionarFim("Exemplo9");
		deque.concatena(deque2);
		Assert.assertEquals("Exemplo9",deque.getElementoFinal());
		
	}

}
