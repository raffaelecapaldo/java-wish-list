package org.lessons.java;

public class Main {

	public static void main(String[] args) {

		int[] interi =  {3,5,9,11,33};
		
		CiclaInteri ciclatore = new CiclaInteri(interi);
		
		while(ciclatore.hasAncoraElementi()) {
			System.out.println(ciclatore.getElementoSuccessivo());
		}
		
		CiclaInteri ciclatoreVuoto = new CiclaInteri();
		ciclatoreVuoto.addElemento(3);
		ciclatoreVuoto.addElemento(6);
		ciclatoreVuoto.addElemento(15);
		while (ciclatoreVuoto.hasAncoraElementi()) {
			System.out.println(ciclatoreVuoto.getElementoSuccessivo());
		}

		
		}
	}


