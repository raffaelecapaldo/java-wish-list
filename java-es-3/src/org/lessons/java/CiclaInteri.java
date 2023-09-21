package org.lessons.java;

public class CiclaInteri {

	private static int posizione = 0;
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
	
	public int getElementoSuccessivo() {
		int intero = getIntero(posizione);
		posizione++;
		return intero;
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

