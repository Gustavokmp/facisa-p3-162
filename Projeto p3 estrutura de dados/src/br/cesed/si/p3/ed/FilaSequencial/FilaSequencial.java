package br.cesed.si.p3.ed.FilaSequencial;

public class FilaSequencial {
	private static final int TAMANHO = 2;
	private static final int DOBRO = 2;
	private Object[] fila = new Object[TAMANHO];
	int pos = 0;

	public void aumentaFila(Object[] fila) {
		Object[] novoArray = new Object[fila.length * DOBRO];
		for (int i = 0; i < fila.length; i++) {
			novoArray[i] = fila[i];
		}
		this.fila = novoArray;
	}

	public void Adicionar(Object item) {
		if (pos + 1 > fila.length) {
			aumentaFila(fila);
		}
		fila[pos] = item;
		pos++;
	}

	public boolean isVazia() {
		if (pos == 0) {
			return true;
		}
		return false;
	}

	public Object primeiroDaFila() {
		return fila[0];
	}

	public Object remove() {
		Object aux = fila[0];
		for (int i = 0; i < fila.length -1; i++) {
			fila[i] = fila[i+1];
		}
		return aux;
	}

	public void esvaziarFila() {
		fila = null;

	}

	public int getPos() {
		return pos;
	}
	

}
