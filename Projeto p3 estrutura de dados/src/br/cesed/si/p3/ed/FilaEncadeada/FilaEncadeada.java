package br.cesed.si.p3.ed.FilaEncadeada;

import br.cesed.si.p3.ed.No.No;

public class FilaEncadeada {
	private No inicio = null, fim = null;
	private int pos = 0;

	/**
	 * Adiciona na fila
	 */
	public void push(Object item) {
		No novo = new No(item);
		if (isVazia()) {
			inicio = novo;
			fim = novo;
		} else {
			novo.setAnt(fim);
			fim.setProx(novo);
			fim = novo;
		}
		pos++;
	}

	/**
	 * Remove da fila
	 * 
	 */
	public Object pop() {
		if (isVazia()) {
			return null;
		}
		No aux = inicio;
		if (inicio.getProx() != null) {
			inicio = inicio.getProx();
			inicio.getAnt().setProx(null);
			inicio.setAnt(null);
		} else {
			inicio = null;
			fim = null;
		}
		pos--;
		return aux.getItem();
	}

	/**
	 * Ver elemento do topo da fila
	 */
	public Object peek() {
		return inicio.getItem();
	}

	/**
	 * ver se a fila esta vazia ou não
	 */
	public boolean isVazia() {
		return inicio == null;
	}

	/**
	 * esvazia a fila
	 */
	public void estavaziaFila() {
		inicio = null;
		fim = null;
	}

	public No getInicio() {
		return inicio;
	}

	public void setInicio(No inicio) {
		this.inicio = inicio;
	}

	public No getFim() {
		return fim;
	}

	public void setFim(No fim) {
		this.fim = fim;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

}
