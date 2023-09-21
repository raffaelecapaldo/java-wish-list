package org.lessons.java;

public class CiclaInteri {

	private int posizione = 0;
	private int[] interi;
	
	private int getIntero(int indice) {
		return interi[indice];
	}

	private void setInteri(int[] interi) {
		this.interi = interi;
	}

	
	CiclaInteri(int[] interi) {
		setInteri(interi);
	}
	
	CiclaInteri() {
		this.interi = new int[0];
	}
	
	public int getElementoSuccessivo() {
		int intero = getIntero(posizione);
		posizione++;
		return intero;
	}
	
	public void addElemento(int intero) {
		int[] nuovoArray = new int[this.interi.length+1];
		for (int i = 0; i < this.interi.length; i++) {
			nuovoArray[i] = this.interi[i];
		}
		nuovoArray[this.interi.length] = intero;
		this.interi = nuovoArray;
		System.out.println("Elemento aggiunto");
	}
	
	public boolean hasAncoraElementi() {
		if (posizione == interi.length) {
			return false;
		}
			else {
				return true;
			}
			
		}
	}

