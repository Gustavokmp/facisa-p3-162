package br.cesed.si.p3.ed.PilhaEncadeadaTeste;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.cesed.si.p3.ed.PilhaEncadeada.PilhaEncadeada;


public class PilhaEncadeadaTeste {
	PilhaEncadeada pilha = new PilhaEncadeada();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		pilha.esvaziaPilha();
	}

	@Test
	public void pushTeste() {
		pilha.push("Exemplo1");
		pilha.push("Exemplo2");
		pilha.push("Exemplo3");
		pilha.push("Exemplo4");
		Assert.assertEquals("Exemplo4", pilha.peek());
	}
	@Test
	public void popTeste(){
		pilha.push("Exemplo1");
		pilha.push("Exemplo2");
		pilha.push("Exemplo3");
		pilha.push("Exemplo4");
		Assert.assertEquals("Exemplo4", pilha.pop());
	}
	@Test
	public void peekTeste(){
		pilha.push("Exemplo1");
		pilha.push("Exemplo2");
		pilha.push("Exemplo3");
		pilha.push("Exemplo4");
		pilha.push("Exemplo5");
		Assert.assertEquals("Exemplo5", pilha.peek());
	}
	@Test
	public void sizeTeste(){
		pilha.push("Exemplo1");
		pilha.push("Exemplo2");
		pilha.push("Exemplo3");
		pilha.push("Exemplo4");
		pilha.push("Exemplo5");
		Assert.assertEquals(5, pilha.size());
	}
	@Test
	public void estaVaziaTeste(){
		Assert.assertEquals(true,pilha.isVazia());
	}

}
