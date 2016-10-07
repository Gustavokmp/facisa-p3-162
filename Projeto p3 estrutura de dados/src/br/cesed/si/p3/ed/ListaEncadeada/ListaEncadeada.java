package br.cesed.si.p3.ed.ListaEncadeada;

import br.cesed.si.p3.ed.No.No;

public class ListaEncadeada {
	private No inicio = null, fim = null;
	private int pos = 0;
	
	public void concatena(ListaEncadeada lista2){
		int tamanho = lista2.getPos();
		No aux = lista2.getInicio();
		for (int i = 0; i < tamanho-1; i++) {
			adicionarFim(aux.getItem());
			aux = aux.getProx();
		}
	}

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

	public Object elementoPosicao(int posicao) {
		No aux = inicio;
		while (--posicao != 0) {
			aux = aux.getProx();
		}
		return aux.getItem();
	}

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

	public Object remover(Object item) {
		int aux = posicaoAtualItem(item);
		return remover(aux);
	}

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

	public void esvaziarListaEncadeada() {
		inicio = null;
		fim = null;
	}

	public boolean isVazia() {

		return inicio == null;
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
		return pos + 1;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

}
