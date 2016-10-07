package br.cesed.si.p3.ed.ListaSequencial;

public class ListaSequencial {
	private static final int TAMANHO_LISTA = 3;
	private static final int DOBRO = 2;
	private Object[] lista = new Object[TAMANHO_LISTA];
	private int pos = 0;

	/*
	 * Esvaziar lista
	 */
	public void vazio() {
		lista = null;
	}

	/*
	 * Dobra tamanho da lista
	 */
	public void aumentaLista(Object[] lista) {
		Object[] novoArray = new Object[lista.length * DOBRO];
		for (int i = 0; i < lista.length; i++) {
			novoArray[i] = lista[i];
		}
		this.lista = novoArray;

	}

	/*
	 * Adiciona no fim da lista
	 */
	public void adicionarFim(Object adicionar) {
		if (pos == lista.length) {
			aumentaLista(lista);
		}
		lista[pos] = adicionar;
		pos++;
	}

	/*
	 * Ver tamanho da lista
	 */
	public int tamanho() {
		return pos;
	}

	/*
	 * Adiciona no inicio
	 */
	public void adicionarInicio(Object adicionar) {
		if (pos + 1 == lista.length) {
			aumentaLista(lista);
		}
		Object[] novoArray = new Object[lista.length * DOBRO];
		for (int i = 0; i < lista.length - 1; i++) {
			lista[i + 1] = lista[i];
		}
		novoArray[0] = adicionar;
		lista = novoArray;
		pos++;
	}

	/*
	 * Ver elemento de dada posicao
	 */
	public Object elementoPosicao(int i) {
		return lista[i - 1];
	}

	/*
	 * Posicao de deteminado elemento
	 */
	public int posElemento(Object elemento) {
		int posicao = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].equals(elemento)) {
				posicao = i;
				break;
			}
		}
		return posicao + 1;
	}

	/*
	 * Adiciona item pela posicao
	 */
	public void adicionarPelaPosicao(Object adicionar, int i) {
		if (pos + 1 == lista.length) {
			aumentaLista(lista);
		}
		for (int j = i - 1; j < pos; j++) {
			lista[i + 1] = lista[i];
		}
		lista[i - 1] = adicionar;

	}

	/*
	 * Concatena duas listas
	 */
	public void concatenaLista(ListaSequencial lista2) {
		int tamanho = lista2.getPos();
		for (int i = 0; i < tamanho; i++) {
			Object item = lista2.removerFim();
			adicionarFim(item);
		}

	}

	public void remove(int posicao) {
		lista[--posicao] = null;
		for (int i = posicao; i < pos; i++) {
			lista[i] = lista[i + 1];
		}
		pos--;
	}

	public void remover(Object remova) {
		int posicao = posElemento(remova);
		remove(posicao);

	}

	public Object removerFim() {
		Object aux = lista[pos - 1];
		lista[--pos] = null;
		return aux;
	}

	public Object[] getLista() {
		return lista;
	}

	public void setLista(Object[] lista) {
		this.lista = lista;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

}
