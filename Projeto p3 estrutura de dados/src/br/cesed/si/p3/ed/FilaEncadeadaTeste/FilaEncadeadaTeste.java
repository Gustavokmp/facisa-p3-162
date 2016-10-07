package br.cesed.si.p3.ed.FilaEncadeadaTeste;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.cesed.si.p3.ed.FilaEncadeada.FilaEncadeada;

public class FilaEncadeadaTeste {
	FilaEncadeada fila = new FilaEncadeada();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		fila.estavaziaFila();
	}

	@Test
	public void estaVaziaTeste() {
		fila.push("Exemplo");
		Assert.assertEquals(false, fila.isVazia());
	}
	@Test
	public void peekTeste() {
		fila.push("Exemplo1");
		fila.push("Exemplo2");
		fila.push("Exemplo3");
		fila.push("Exemplo4");
		fila.push("Exemplo5");
		Assert.assertEquals("Exemplo1", fila.peek());
	}
	@Test
	public void pushTeste(){
		fila.push("Exemplo1");
		fila.push("Exemplo2");
		fila.push("Exemplo3");
		fila.push("Exemplo4");
		fila.push("Exemplo5");
		Assert.assertEquals(5,fila.getPos());
	}
	@Test
	public void popTeste(){
		fila.push("Exemplo1");
		fila.push("Exemplo2");
		fila.push("Exemplo3");
		fila.push("Exemplo4");
		fila.push("Exemplo5");
		Assert.assertEquals("Exemplo1",fila.pop());
	}

}
