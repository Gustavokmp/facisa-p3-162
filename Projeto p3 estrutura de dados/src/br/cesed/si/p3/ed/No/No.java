package br.cesed.si.p3.ed.No;

public class No {
	private No prox, ant;
	private Object item;

	public No(Object item) {
		this.item = item;
		prox = null;
		ant = null;
	}

	public No getProx() {
		return prox;
	}

	public void setProx(No prox) {
		this.prox = prox;
	}

	public No getAnt() {
		return ant;
	}

	public void setAnt(No ant) {
		this.ant = ant;
	}

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}

}
