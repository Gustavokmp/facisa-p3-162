package br.cesed.si.p3.ed.PilhaSequencial;

public class PilhaSequencial {
	private static final int DOBRO = 2;
	private static final int TAMANHO = 2;
	private Object[] pilha = new Object[TAMANHO];
	int pos = 0;

	/**
	 * Dobra tamanho da pilha
	 */
	public void aumentaPilha(Object[] pilha) {
		Object[] novoArray = new Object[pilha.length * DOBRO];
		for (int i = 0; i < pilha.length; i++) {
			novoArray[i] = pilha[i];
		}
		this.pilha = novoArray;

	}
	/**
	 * Esvaziar pilha
	 */

	public void esvaziarPillha() {
		pilha = null;
	}

	/**
	 * Adicionar
	 */
	public void push(Object item) {
		if (pos + 1 > pilha.length) {
			aumentaPilha(pilha);
		}
		pilha[pos] = item;
		pos++;
	}

	/**
	 * Remover e retorna elemento
	 */
	public Object pop() {
		Object aux = pilha[pos - 1];
		pilha[pos - 1] = null;
		pos--;
		return aux;
	}

	/**
	 * Tamanho da pilha
	 */
	public Object size() {
		return pos;
	}

	/**
	 * Ver elemento do topo da pilha
	 */
	public Object peek() {
		return pilha[pos - 1];
	}

	/**
	 * Ver se a pilha esta vazia
	 */
	public boolean isVazia() {
		if (pos == 0) {
			return true;
		}
		return false;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public Object[] getPilha() {
		return pilha;
	}

	public void setPilha(Object[] pilha) {
		this.pilha = pilha;
	}

	public static int getDobro() {
		return DOBRO;
	}

	public static int getTamanho() {
		return TAMANHO;
	}

}
