package com.spring.jpa.app.util.paginator;

public class PageItem {
	private int numero;
	private boolean current;
	public PageItem(int numero, boolean current) {
		this.numero = numero;
		this.current = current;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public boolean isCurrent() {
		return current;
	}
	public void setCurrent(boolean current) {
		this.current = current;
	}
	
	
}
