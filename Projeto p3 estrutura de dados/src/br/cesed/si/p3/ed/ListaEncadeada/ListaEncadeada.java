package br.cesed.si.p3.ed.ListaEncadeada;

import br.cesed.si.p3.ed.No.No;

public class ListaEncadeada {
	private No inicio = null, fim = null;
	private int pos = 0;

	/*
	 * Concatena duas listas encadeadas
	 */
	public void concatena(ListaEncadeada lista2) {
		int tamanho = lista2.getPos();
		No aux = lista2.getInicio();
		for (int i = 0; i < tamanho - 1; i++) {
			adicionarFim(aux.getItem());
			aux = aux.getProx();
		}
	}

	/*
	 * Retorna posicao atual de um elemento
	 */
	public int posicaoAtualItem(Object procure) {
		No aux = inicio;
		int posAtual = 0;
		while (aux != null) {
			posAtual++;
			if (procure.equals(aux.getItem())) {
				return posAtual;
			}
			aux = aux.getProx();
		}
		return 0;
	}

	/*
	 * Retorna a o elemento de dada posicao
	 */
	public Object elementoPosicao(int posicao) {
		No aux = inicio;
		while (--posicao != 0) {
			aux = aux.getProx();
		}
		return aux.getItem();
	}

	/*
	 * Adiciona elemento pela posicao
	 */
	public void adicionarPosicao(int posicao, Object item) {
		No aux = inicio;
		while (--posicao - 1 != 0) {
			aux = aux.getProx();
		}
		No novo = new No(item);
		novo.setProx(aux.getProx());
		aux.getProx().setAnt(novo);
		aux.setProx(novo);
		novo.setAnt(aux);
	}

	/*
	 * Remove elemento de dada posicao
	 */
	public Object remover(int posicao) {
		No aux = inicio;
		while (--posicao != 0) {
			aux = aux.getProx();
		}
		No aux2;
		aux2 = aux.getAnt();
		aux2 = aux.getProx();
		aux2.setAnt(aux2.getProx());
		aux.setAnt(null);
		aux.setProx(null);
		return aux.getItem();
	}

	/*
	 * remove elemento que for passado como parametro
	 */
	public Object remover(String item) {
		int aux = posicaoAtualItem(item);
		return remover(aux);
	}

	/*
	 * Adiciona elemento no inicio
	 */
	public void adicionarInicio(Object item) {
		No novo = new No(item);
		if (inicio == null) {
			inicio = novo;
			fim = novo;
		} else {
			inicio.setAnt(novo);
			novo.setProx(inicio);
			inicio = novo;
		}
		pos++;
	}

	/*
	 * Remove elemento do inicio
	 */
	public Object removerInicio() {
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

	/*
	 * Adiciona no fim
	 */
	public void adicionarFim(Object item) {
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
	 * Remove do fim
	 */
	public Object removerFim() {
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
	 * Esvaziar Lista
	 */
	public void esvaziarListaEncadeada() {
		inicio = null;
		fim = null;
	}

	/*
	 * Ver se a lsita esta vazia
	 */
	public boolean isVazia() {

		return inicio == null;
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
		return pos + 1;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

}
