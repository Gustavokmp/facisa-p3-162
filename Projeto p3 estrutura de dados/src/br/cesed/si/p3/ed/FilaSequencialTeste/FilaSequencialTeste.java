package br.cesed.si.p3.ed.FilaSequencialTeste;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.cesed.si.p3.ed.FilaSequencial.FilaSequencial;

public class FilaSequencialTeste {
	FilaSequencial fila = new FilaSequencial();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		fila.esvaziarFila();
	}

	@Test
	public void estaVaziaTeste() {
		Assert.assertEquals(true, fila.isVazia());
	}
	@Test
	public void estaVaziaTeste2() {
		fila.Adicionar("Exemplo");
		Assert.assertEquals(false, fila.isVazia());
	}
	@Test
	public void elementoInicialTeste() {
		fila.Adicionar("Exemplo1");
		fila.Adicionar("Exemplo2");
		fila.Adicionar("Exemplo3");
		Assert.assertEquals("Exemplo1", fila.primeiroDaFila());
	}
	@Test
	public void adicionarTeste() {
		fila.Adicionar("Exemplo1");
		fila.Adicionar("Exemplo2");
		fila.Adicionar("Exemplo3");
		Assert.assertEquals(3, fila.getPos());
	}
	@Test
	public void removerTeste() {
		fila.Adicionar("Exemplo1");
		fila.Adicionar("Exemplo2");
		fila.Adicionar("Exemplo3");
		Assert.assertEquals("Exemplo1", fila.remove());
		Assert.assertEquals("Exemplo2", fila.primeiroDaFila());
	}
	

}
