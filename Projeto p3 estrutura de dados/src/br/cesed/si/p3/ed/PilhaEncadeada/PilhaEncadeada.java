package br.cesed.si.p3.ed.PilhaEncadeada;

import br.cesed.si.p3.ed.No.No;

public class PilhaEncadeada {
	private No inicio = null, fim = null;
	private int pos = 0;

	/*
	 * Adiciona na pilha
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

	/*
	 * Remover da pilha e retorna elemento
	 */
	public Object pop() {
		if (isVazia()) {
			return null;
		}
		No aux = fim;
		if (fim.getAnt() != null) {
			fim = fim.getAnt();
			fim.getProx().setAnt(null);
			fim.setProx(null);
		} else {
			inicio = null;
			fim = null;
		}
		pos--;
		return aux.getItem();
	}

	/*
	 * Ver elemento do topo da pilha
	 */
	public Object peek() {
		return fim.getItem();
	}

	/*
	 * Tamanho da pilha
	 */
	public int size() {
		return pos;
	}

	/*
	 * Ver se esta vazia
	 */
	public boolean isVazia() {

		return inicio == null;
	}

	/*
	 * Esvaziar pilha
	 */
	public void esvaziaPilha() {
		inicio = null;
		fim = null;
	}
	/*
	 * Gets e sets
	 */

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
