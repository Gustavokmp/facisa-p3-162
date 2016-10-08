package br.cesed.si.p3.ed.DequeEncadeada;

import br.cesed.si.p3.ed.No.No;

public class DequeEncadeada {
	private No inicio = null, fim = null;
	private int pos = 0;

/**
 * Concatena dois deques
 */
	public void concatena(DequeEncadeada deque2) {
		int tamanho = deque2.getPos();
		No aux = deque2.getInicio();
		for (int i = 0; i < tamanho; i++) {
			adicionarFim(aux.getItem());
			aux = aux.getProx();
		}
	}

	/**
	 * Pega o elemento inicial do deque
	 */
	public Object getElementoInicial() {
		return inicio.getItem();
	}

	/**
	 * Pega o ultimo elemento do deque
	 */
	public Object getElementoFinal() {
		return fim.getItem();
	}

	/**
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

	/**
	 * Remove elemento na posicao inicial
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

	/**
	 * adicionar elemento no fim
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

	/**
	 * remove elemento na posicao final e o retorna
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

	/**
	 * Retorna se o deque esta vazio ou não
	 */
	public boolean isVazia() {
		return inicio == null;
	}

	/**
	 * esvazia o deque
	 */
	public void estaviaDeque() {
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
