package br.cesed.si.p3.ed.PilhaSequencialTeste;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.cesed.si.p3.ed.PilhaSequencial.PilhaSequencial;

public class PilhaSequencialTeste {
	PilhaSequencial pilha = new PilhaSequencial();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		pilha.esvaziarPillha();
	}

	@Test
	public void pushTeste() {
		pilha.push("Exemplo1");
		pilha.push("Exemplo2");
		pilha.push("Exemplo3");
		Assert.assertEquals(3, pilha.size());
	}
	@Test
	public void popTeste() {
		pilha.push("Exemplo1");
		pilha.push("Exemplo2");
		pilha.push("Exemplo3");
		Assert.assertEquals("Exemplo3", pilha.pop());
	}
	@Test
	public void peekTeste() {
		pilha.push("Exemplo1");
		pilha.push("Exemplo2");
		pilha.push("Exemplo3");
		Assert.assertEquals("Exemplo3", pilha.peek());
	}
	@Test
	public void TamanhoDaPilhaTeste() {
		pilha.push("Exemplo1");
		pilha.push("Exemplo2");
		pilha.push("Exemplo3");
		Assert.assertEquals(3, pilha.size());
	}
	@Test
	public void EstaVaziaTeste() {
		pilha.push("Exemplo1");
		pilha.push("Exemplo2");
		pilha.push("Exemplo3");
		Assert.assertEquals(false, pilha.isVazia());
	}
	@Test
	public void EstaVaziaTeste2() {
		Assert.assertEquals(true, pilha.isVazia());
	}

}
