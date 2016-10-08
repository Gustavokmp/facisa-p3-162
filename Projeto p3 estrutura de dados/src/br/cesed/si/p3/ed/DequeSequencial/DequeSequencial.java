package br.cesed.si.p3.ed.DequeSequencial;

public class DequeSequencial {

	private static final int TAMANHO = 2;
	private static final int DOBRO = 2;
	private Object[] deque = new Object[TAMANHO];
	private int pos = 0;

	/**
	 * Quando o deque estiver cheio ele dobra seu tamanho
	 * 
	 */
	public void aumentaDeque(Object[] deque) {
		Object[] novoArray = new Object[deque.length * DOBRO];
		for (int i = 0; i < deque.length; i++) {
			novoArray[i] = deque[i];
		}
		this.deque = novoArray;

	}

	/**
	 * Retorna se o deque esta vazio ou não
	 */
	public boolean EstaVazia() {
		if (deque.length == 0) {
			return true;
		}
		return false;
	}

	/**
	 * Adiciona elemento no inicio
	 */
	public void adicionarInicio(Object item) {
		if (pos + 1 > deque.length) {
			aumentaDeque(deque);
		}
		Object[] novoArray = new Object[deque.length * DOBRO];
		for (int i = 0; i < deque.length - 1; i++) {
			novoArray[i + 1] = deque[i];
		}
		novoArray[0] = item;
		deque = novoArray;
		pos++;
	}

	/**
	 * Adiciona elemento no fim
	 */
	public void adicionarFim(Object item) {
		if (pos + 1 > deque.length) {
			aumentaDeque(deque);
		}
		deque[pos] = item;
		pos++;
	}
	/**
	 * Ver elemento da posicao inicial
	 */

	public Object verPrimeiroElemento() {
		return deque[0];
	}

	/**
	 * Ver ultimo Elemento
	 */
	public Object verUltimoElemento() {
		return deque[pos - 1];
	}

	/**
	 * Remove elemento do inicio
	 */
	public Object removerInicio() {
		Object aux = deque[0];
		for (int i = 0; i < pos; i++) {
			deque[i] = deque[i + 1];
		}
		pos--;
		return aux;
	}

	/**
	 * remove elemento do fim
	 */
	public Object removerFim() {
		Object aux = deque[pos - 1];
		deque[--pos] = null;
		return aux;
	}

	/**
	 * concatena dois deques
	 */
	public void concatenaDeque(DequeSequencial deque2) {
		int tamanho = deque2.getPos();
		for (int i = 0; i < tamanho; i++) {
			Object item = deque2.removerInicio();
			adicionarFim(item);
		}
	}

	/**
	 * esvazia deque
	 */
	public void esvaziar() {
		deque = null;

	}

	/**
	 * Tamanho do deque
	 */
	public Object size() {
		return pos;
	}
	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

}
