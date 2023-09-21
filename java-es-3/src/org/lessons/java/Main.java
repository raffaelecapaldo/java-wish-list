package org.lessons.java;

public class Main {

	public static void main(String[] args) {

		int[] interi =  {3,5,9,11,33};
		
		CiclaInteri ciclatore = new CiclaInteri(interi);
		
		System.out.println(ciclatore.getElementoSuccessivo());
		System.out.println(ciclatore.getElementoSuccessivo());
		System.out.println(ciclatore.getElementoSuccessivo());
		System.out.println(ciclatore.getElementoSuccessivo());
		System.out.println(ciclatore.hasAncoraElementi());
		System.out.println(ciclatore.getElementoSuccessivo());
		System.out.println(ciclatore.hasAncoraElementi());

		
		}
	}


